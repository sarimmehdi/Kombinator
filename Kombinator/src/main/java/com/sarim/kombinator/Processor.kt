package com.sarim.kombinator

import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.Dependencies
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.processing.SymbolProcessorProvider
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSAnnotation
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSValueParameter
import com.google.devtools.ksp.symbol.KSVisitorVoid
import com.google.devtools.ksp.symbol.Modifier
import com.google.devtools.ksp.validate
import com.squareup.kotlinpoet.BOOLEAN
import com.squareup.kotlinpoet.BYTE
import com.squareup.kotlinpoet.CHAR
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.DOUBLE
import com.squareup.kotlinpoet.FLOAT
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.INT
import com.squareup.kotlinpoet.LIST
import com.squareup.kotlinpoet.LONG
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.SHORT
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.U_BYTE
import com.squareup.kotlinpoet.U_INT
import com.squareup.kotlinpoet.U_LONG
import com.squareup.kotlinpoet.U_SHORT
import com.squareup.kotlinpoet.ksp.toTypeName
import com.squareup.kotlinpoet.ksp.writeTo

data class ConstructorParameterInfo(
    val name: String,
    val type: TypeName,
    val ksParameter: KSValueParameter,
    val isBoolean: Boolean = false,
    val isString: Boolean = false,
    val isInt: Boolean = false,
    val isFloat: Boolean = false,
    val isDouble: Boolean = false,
    val isLong: Boolean = false,
    val isByte: Boolean = false,
    val isChar: Boolean = false,
    val isShort: Boolean = false,
    val isUByte: Boolean = false,
    val isUShort: Boolean = false,
    val isUInt: Boolean = false,
    val isULong: Boolean = false
)

class Processor(
    private val codeGenerator: CodeGenerator,
    private val logger: KSPLogger
) : SymbolProcessor {

    override fun process(resolver: Resolver): List<KSAnnotated> {
        val kombineAnnotationName = Kombine::class.qualifiedName
        if (kombineAnnotationName == null) {
            logger.error("Could not find qualified name for Kombine annotation.")
            return emptyList()
        }

        val symbols = resolver.getSymbolsWithAnnotation(kombineAnnotationName)
        val unableToProcess = symbols.filterNot { it.validate() }.toList()

        symbols
            .filterIsInstance<KSClassDeclaration>()
            .filter { it.validate() }
            .forEach { classDeclaration ->
                if (!classDeclaration.modifiers.contains(Modifier.DATA)) {
                    logger.warn(
                        "Kombine annotation is intended for data classes (for constructor properties). " +
                                "${classDeclaration.qualifiedName?.asString()} is not a data class. " +
                                "Ensure it has a primary constructor with properties to combine.",
                        classDeclaration
                    )
                }
                classDeclaration.accept(DataClassVisitor(kombineAnnotationName), Unit)
            }
        return unableToProcess
    }

    inner class DataClassVisitor(
        private val annotationClassQualifiedName: String
    ) : KSVisitorVoid() {

        private fun <T> readAnnotationArrayArgument(
            annotation: KSAnnotation,
            argumentName: String,
            expectedItemTypeName: String, // For logging
            targetTypeName: TypeName, // The actual KotlinPoet TypeName we want
            caster: (Any, KSPLogger) -> T?
        ): List<T> {
            val argument = annotation.arguments.firstOrNull { it.name?.asString() == argumentName }
            val value = argument?.value

            return when (value) {
                is List<*> -> {
                    value.mapNotNull { item ->
                        if (item == null) {
                            logger.warn(
                                "Null item found in list for argument '$argumentName' in @${annotation.shortName.asString()}.",
                                annotation
                            )
                            null
                        } else {
                            val castedValue = caster(item, logger)
                            if (castedValue == null) {
                                logger.warn(
                                    "Unexpected item type or failed cast in '$argumentName' for @${annotation.shortName.asString()}. " +
                                            "Expected to be able to convert to $expectedItemTypeName, got ${item::class.qualifiedName} with value '$item'.",
                                    annotation
                                )
                                null
                            } else {
                                castedValue
                            }
                        }
                    }
                }
                null -> {
                    // Argument not found or is null, this is not an error, just means no values provided
                    emptyList()
                }
                else -> {
                    logger.warn(
                        "Argument '$argumentName' for @${annotation.shortName.asString()} is not a List. " +
                                "Found: ${value::class.qualifiedName}.",
                        annotation
                    )
                    emptyList()
                }
            }
        }

        override fun visitClassDeclaration(classDeclaration: KSClassDeclaration, data: Unit) {
            val annotation = classDeclaration.annotations.firstOrNull {
                it.annotationType.resolve().declaration.qualifiedName?.asString() == annotationClassQualifiedName
            }

            if (annotation == null) {
                logger.warn(
                    "Annotation Kombine not found on ${classDeclaration.simpleName.asString()}",
                    classDeclaration
                )
                return
            }

            val allPossibleStringParams = readAnnotationArrayArgument(annotation, "allPossibleStringParams", "String", STRING) { item, _ -> item as? String }
            val allPossibleIntParams = readAnnotationArrayArgument(annotation, "allPossibleIntParams", "Int", INT) { item, _ -> (item as? Number)?.toInt() }
            val allPossibleFloatParams = readAnnotationArrayArgument(annotation, "allPossibleFloatParams", "Float", FLOAT) { item, _ -> (item as? Number)?.toFloat() }
            val allPossibleDoubleParams = readAnnotationArrayArgument(annotation, "allPossibleDoubleParams", "Double", DOUBLE) { item, _ -> (item as? Number)?.toDouble() }
            val allPossibleLongParams = readAnnotationArrayArgument(annotation, "allPossibleLongParams", "Long", LONG) { item, _ -> (item as? Number)?.toLong() }
            val allPossibleByteParams = readAnnotationArrayArgument(annotation, "allPossibleByteParams", "Byte", BYTE) { item, _ -> (item as? Number)?.toByte() }
            val allPossibleCharParams = readAnnotationArrayArgument(annotation, "allPossibleCharParams", "Char", CHAR) { item, _ -> item as? Char }
            val allPossibleShortParams = readAnnotationArrayArgument(annotation, "allPossibleShortParams", "Short", SHORT) { item, _ -> (item as? Number)?.toShort() }

            val allPossibleUByteParams = readAnnotationArrayArgument(annotation, "allPossibleUByteParams", "UByte", U_BYTE) { item, l ->
                when (item) {
                    is UByte -> item
                    is Byte -> item.toUByte()
                    is Number -> item.toLong().toUByte()
                    else -> {
                        l.warn("Cannot cast ${item::class.qualifiedName} to UByte for 'allPossibleUByteParams'")
                        null
                    }
                }
            }
            val allPossibleUShortParams = readAnnotationArrayArgument(annotation, "allPossibleUShortParams", "UShort", U_SHORT) { item, l ->
                when (item) {
                    is UShort -> item
                    is Short -> item.toUShort()
                    is Number -> item.toLong().toUShort()
                    else -> {
                        logger.warn("Cannot cast ${item::class.qualifiedName} to UShort for 'allPossibleUShortParams'")
                        null
                    }
                }
            }
            val allPossibleUIntParams = readAnnotationArrayArgument(annotation, "allPossibleUIntParams", "UInt", U_INT) { item, l ->
                when (item) {
                    is UInt -> item
                    is Int -> item.toUInt()
                    is Number -> item.toLong().toUInt()
                    else -> {
                        logger.warn("Cannot cast ${item::class.qualifiedName} to UInt for 'allPossibleUIntParams'")
                        null
                    }
                }
            }
            val allPossibleULongParams = readAnnotationArrayArgument(annotation, "allPossibleULongParams", "ULong", U_LONG) { item, l ->
                when (item) {
                    is ULong -> item.toLong()
                    is Long -> item.toULong()
                    is Number -> item.toLong().toULong() // Ensure it's a Long first
                    else -> {
                        logger.warn("Cannot cast ${item::class.qualifiedName} to ULong for 'allPossibleULongParams'")
                        null
                    }
                }
            }

            val providedParamLists = mapOf(
                STRING to allPossibleStringParams,
                INT to allPossibleIntParams,
                FLOAT to allPossibleFloatParams,
                DOUBLE to allPossibleDoubleParams,
                LONG to allPossibleLongParams,
                BYTE to allPossibleByteParams,
                CHAR to allPossibleCharParams,
                SHORT to allPossibleShortParams,
                U_BYTE to allPossibleUByteParams,
                U_SHORT to allPossibleUShortParams,
                U_INT to allPossibleUIntParams,
                U_LONG to allPossibleULongParams
            )

            val originalClassNameString = classDeclaration.simpleName.asString()
            val originalClassTypeName = classDeclaration.asType(emptyList()).toTypeName()
            val packageName = classDeclaration.packageName.asString()

            val primaryConstructor = classDeclaration.primaryConstructor
            if (primaryConstructor == null) {
                logger.error("Class ${classDeclaration.qualifiedName?.asString()} needs a primary constructor.", classDeclaration)
                return
            }

            val constructorParameters = primaryConstructor.parameters.mapNotNull { ksParam ->
                val name = ksParam.name?.asString()
                if (name == null) {
                    logger.error("Constructor parameter in $originalClassNameString has no name.", ksParam)
                    return@mapNotNull null
                }
                val type = ksParam.type.resolve().toTypeName()
                ConstructorParameterInfo(
                    name = name,
                    type = type,
                    ksParameter = ksParam,
                    isBoolean = type == BOOLEAN,
                    isString = type == STRING,
                    isInt = type == INT,
                    isFloat = type == FLOAT,
                    isDouble = type == DOUBLE,
                    isLong = type == LONG,
                    isByte = type == BYTE,
                    isChar = type == CHAR,
                    isShort = type == SHORT,
                    isUByte = type == U_BYTE,
                    isUShort = type == U_SHORT,
                    isUInt = type == U_INT,
                    isULong = type == U_LONG
                )
            }

            if (constructorParameters.isEmpty() && primaryConstructor.parameters.isNotEmpty()) {
                logger.error("Failed to parse constructor parameters for $originalClassNameString.", classDeclaration)
                return
            }

            val booleanParams = constructorParameters.filter { it.isBoolean }
            val typedParamsToCombine = constructorParameters.filter { param ->
                !param.isBoolean && providedParamLists[param.type]?.isNotEmpty() == true
            }

            if (booleanParams.isEmpty() && typedParamsToCombine.isEmpty()) {
                logger.warn("No parameters found in $originalClassNameString to generate combinations from @Kombine.", classDeclaration)
                return
            }

            constructorParameters.forEach { param ->
                if (!param.isBoolean && param.type in providedParamLists.keys && providedParamLists[param.type]?.isEmpty() == true) {
                    val annotationParamName = providedParamLists.entries.firstOrNull { it.key == param.type }?.let { entry ->
                        "allPossible${param.type.toString().split('.').last().replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }}Params"
                    } ?: "the corresponding array in @Kombine"

                    logger.error(
                        "Class $originalClassNameString has a '${param.name}: ${param.type}' parameter, " +
                                "but $annotationParamName is empty in @Kombine. Provide values to combine.",
                        classDeclaration
                    )
                }
            }


            val generatedObjectName = "${originalClassNameString}Combinations"
            val fileBuilder = FileSpec.builder(packageName, generatedObjectName)
            val objectBuilder = TypeSpec.objectBuilder(generatedObjectName)
                .addKdoc(
                    "Provides pre-configured instances of [%T] with various parameter combinations.",
                    originalClassTypeName
                )

            val generatedPropertyNames = mutableListOf<String>()
            var instanceCounter = 1

            val combinableParameterGroups = mutableListOf<Pair<ConstructorParameterInfo, List<Any>>>()
            if (booleanParams.isNotEmpty()) {
                booleanParams.forEach {
                    combinableParameterGroups.add(it to listOf(false, true))
                }
            }
            typedParamsToCombine.forEach { paramInfo ->
                providedParamLists[paramInfo.type]?.let { values ->
                    if (values.isNotEmpty()) {
                        combinableParameterGroups.add(paramInfo to values)
                    }
                }
            }

            if (combinableParameterGroups.isEmpty()) {
                logger.warn("No effective parameter combinations to generate for $originalClassNameString.", classDeclaration)
                return
            }

            val totalCombinations = combinableParameterGroups.fold(1) { acc, group -> acc * group.second.size }
            if (totalCombinations == 0 && (booleanParams.isNotEmpty() || typedParamsToCombine.isNotEmpty())) {
                logger.warn("Total combinations is 0, likely due to an empty list of provided values for a typed parameter in $originalClassNameString.", classDeclaration)
                return
            }

            val currentIndices = IntArray(combinableParameterGroups.size)

            repeat(totalCombinations) {
                val currentParameterValues = mutableMapOf<String, Any>()
                val combinationNameParts = mutableListOf<String>()

                for (k in combinableParameterGroups.indices) {
                    val paramInfo = combinableParameterGroups[k].first
                    val possibleValues = combinableParameterGroups[k].second
                    val value = possibleValues[currentIndices[k]]
                    currentParameterValues[paramInfo.name] = value
                    val valueString = when (value) {
                        is String -> "\"$value\""
                        is Char -> "'$value'"
                        is Float -> "${value}f"
                        else -> value.toString()
                    }
                    combinationNameParts.add(
                        "${paramInfo.name} = $valueString"
                    )
                }

                val basePropertyName = originalClassNameString.replaceFirstChar { it.lowercaseChar() }
                val instancePropertyName = "${basePropertyName}${instanceCounter++}"
                generatedPropertyNames.add(instancePropertyName)

                generateInstanceProperty(
                    objectBuilder = objectBuilder,
                    originalClassTypeName = originalClassTypeName,
                    instancePropertyName = instancePropertyName,
                    parameterValues = currentParameterValues,
                    parameterInfos = constructorParameters,
                    combinationNameForKdoc = "\n" + combinationNameParts.joinToString("\n")
                )

                for (k in combinableParameterGroups.indices.reversed()) {
                    currentIndices[k]++
                    if (currentIndices[k] < combinableParameterGroups[k].second.size) {
                        break
                    }
                    currentIndices[k] = 0
                }
            }

            if (generatedPropertyNames.isNotEmpty()) {
                val listType = LIST.parameterizedBy(originalClassTypeName)
                val getAllFunBuilder = FunSpec.builder("getAllCombinations")
                    .addKdoc("Returns a list of all pre-configured [%T] instances.", originalClassTypeName)
                    .returns(listType)
                val codeBlockBuilder = CodeBlock.builder().add("return listOf(⇥")
                generatedPropertyNames.forEachIndexed { index, propName ->
                    if (index == 0) codeBlockBuilder.add("\n%N", propName)
                    else codeBlockBuilder.add(",\n%N", propName)
                }
                codeBlockBuilder.add("\n⇤)")
                getAllFunBuilder.addCode(codeBlockBuilder.build())
                objectBuilder.addFunction(getAllFunBuilder.build())
            }

            fileBuilder.addType(objectBuilder.build())
            val fileSpec = fileBuilder.build()

            classDeclaration.containingFile?.let { file ->
                fileSpec.writeTo(codeGenerator, Dependencies(aggregating = false, file))
                logger.info("Generated: $packageName.$generatedObjectName")
            } ?: logger.error("Containing file is null for $originalClassNameString.", classDeclaration)
        }

        private fun generateInstanceProperty(
            objectBuilder: TypeSpec.Builder,
            originalClassTypeName: TypeName,
            instancePropertyName: String,
            parameterValues: Map<String, Any>,
            parameterInfos: List<ConstructorParameterInfo>,
            combinationNameForKdoc: String
        ) {
            val propertyArgs = mutableListOf<CodeBlock>()

            val sortedParamNames = parameterValues.keys.sorted()

            for (paramName in sortedParamNames) {
                val value = parameterValues[paramName] ?: continue
                val paramInfo = parameterInfos.firstOrNull { it.name == paramName }
                if (paramInfo == null) {
                    logger.warn("Parameter info not found for $paramName during instance generation. Skipping.")
                    continue
                }

                when (paramInfo.type) {
                    STRING -> propertyArgs.add(CodeBlock.of("%N = %S", paramName, value))
                    FLOAT -> propertyArgs.add(CodeBlock.of("%N = %Lf", paramName, value))
                    CHAR -> propertyArgs.add(CodeBlock.of("%N = '%L'", paramName, value))
                    U_BYTE -> propertyArgs.add(CodeBlock.of("%N = %Lu", paramName, (value as UByte).toLong()))
                    U_SHORT -> propertyArgs.add(CodeBlock.of("%N = %Lu", paramName, (value as UShort).toLong()))
                    U_INT -> propertyArgs.add(CodeBlock.of("%N = %Lu", paramName, (value as UInt).toLong()))
                    U_LONG -> propertyArgs.add(CodeBlock.of("%N = %Lu", paramName, value as ULong))
                    else -> propertyArgs.add(CodeBlock.of("%N = %L", paramName, value))
                }
            }


            val propertyInitializer = CodeBlock.builder()
                .add("%T(⇥\n", originalClassTypeName)
                .add(propertyArgs.joinToString(",\n"))
                .add("\n⇤)")
                .build()

            val propSpec = PropertySpec.builder(instancePropertyName, originalClassTypeName)
                .addKdoc(
                    "An instance of [%T] with parameters: %L.\n",
                    originalClassTypeName,
                    combinationNameForKdoc
                )
                .initializer(propertyInitializer)
                .build()
            objectBuilder.addProperty(propSpec)
        }
    }
}

class ProcessorProvider : SymbolProcessorProvider {
    override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor {
        return Processor(environment.codeGenerator, environment.logger)
    }
}
