package com.sarim.kombinator

import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSVisitorVoid
import com.google.devtools.ksp.symbol.Modifier
import com.google.devtools.ksp.validate
import com.sarim.kombinator.utils.ConstructorParameterInfo
import com.sarim.kombinator.utils.generateCode
import com.sarim.kombinator.utils.readParameter
import com.sarim.kombinator.utils.writeProperties
import com.squareup.kotlinpoet.BOOLEAN
import com.squareup.kotlinpoet.BYTE
import com.squareup.kotlinpoet.CHAR
import com.squareup.kotlinpoet.DOUBLE
import com.squareup.kotlinpoet.FLOAT
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.INT
import com.squareup.kotlinpoet.LONG
import com.squareup.kotlinpoet.SHORT
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.U_BYTE
import com.squareup.kotlinpoet.U_INT
import com.squareup.kotlinpoet.U_LONG
import com.squareup.kotlinpoet.U_SHORT
import com.squareup.kotlinpoet.ksp.toTypeName

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

        override fun visitClassDeclaration(classDeclaration: KSClassDeclaration, data: Unit) {
            val classLevelAnnotation = classDeclaration.annotations.firstOrNull { // Renamed for clarity
                it.annotationType.resolve().declaration.qualifiedName?.asString() == annotationClassQualifiedName
            }

            if (classLevelAnnotation == null) {
                logger.warn(
                    "Annotation Kombine not found on ${classDeclaration.simpleName.asString()}",
                    classDeclaration
                )
            }

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
                val resolvedType = ksParam.type.resolve()
                val type = resolvedType.toTypeName()
                val declaration = resolvedType.declaration

                var isEnumType = false
                var enumDeclaration: KSClassDeclaration? = null
                if (declaration is KSClassDeclaration && declaration.classKind == com.google.devtools.ksp.symbol.ClassKind.ENUM_CLASS) {
                    isEnumType = true
                    enumDeclaration = declaration
                }

                val parameterKombineAnnotation = ksParam.annotations.firstOrNull {
                    it.annotationType.resolve().declaration.qualifiedName?.asString() == annotationClassQualifiedName
                }

                ConstructorParameterInfo(
                    name = name,
                    type = type,
                    hasDefaultValue = ksParam.hasDefault,
                    ksParameter = ksParam,
                    parameterAnnotation = parameterKombineAnnotation,
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
                    isULong = type == U_LONG,
                    isEnum = isEnumType,
                    enumClassDeclaration = enumDeclaration
                )
            }

            if (constructorParameters.isEmpty() && primaryConstructor.parameters.isNotEmpty()) {
                logger.error("Failed to parse constructor parameters for $originalClassNameString.", classDeclaration)
                return
            }

            val combinableParameterGroups = mutableListOf<Pair<ConstructorParameterInfo, List<Any>>>()

            constructorParameters.filter { it.isBoolean && !it.hasDefaultValue }.forEach {
                combinableParameterGroups.add(it to listOf(false, true))
            }

            constructorParameters.filter { it.isEnum && it.enumClassDeclaration != null && !it.hasDefaultValue }.forEach { paramInfo ->
                val enumClassDeclaration = paramInfo.enumClassDeclaration
                if (enumClassDeclaration == null) {
                    logger.error("Enum parameter '${paramInfo.name}' in $originalClassNameString is missing its class declaration.", paramInfo.ksParameter)
                    return@forEach
                }

                val enumConstants = enumClassDeclaration.declarations
                    .filterIsInstance<KSClassDeclaration>()
                    .filter { it.classKind == com.google.devtools.ksp.symbol.ClassKind.ENUM_ENTRY }
                    .map { enumEntry ->
                        enumEntry.simpleName.asString()
                    }.toList()

                if (enumConstants.isNotEmpty()) {
                    combinableParameterGroups.add(paramInfo to enumConstants)
                } else {
                    logger.warn(
                        "Enum parameter '${paramInfo.name}: ${paramInfo.type}' in $originalClassNameString is of type ${enumClassDeclaration.qualifiedName?.asString()} " +
                                "but it has no enum constants. No combinations will be generated for this parameter.",
                        paramInfo.ksParameter
                    )
                }
            }

            readParameter(
                constructorParameters = constructorParameters,
                classLevelAnnotation = classLevelAnnotation,
                combinableParameterGroups = combinableParameterGroups,
                originalClassNameString = originalClassNameString,
                logger = logger
            )

            val hasAnyKombineAnnotationWithPotentialValues = classLevelAnnotation != null || constructorParameters.any { it.parameterAnnotation != null }

            if (combinableParameterGroups.isEmpty()) {
                if (hasAnyKombineAnnotationWithPotentialValues) {
                    logger.warn(
                        "No effective parameter combinations to generate for $originalClassNameString. " +
                                "This might be because all provided value lists in @Kombine (class or parameter level) are empty, " +
                                "or parameters are not of supported types for combination.",
                        classDeclaration
                    )
                } else {
                    logger.warn(
                        "No parameters found in $originalClassNameString to generate combinations from @Kombine. " +
                                "Ensure @Kombine is used on the class or on individual parameters with values for supported types.",
                        classDeclaration
                    )
                }
                return
            }

            val generatedObjectName = "${originalClassNameString}Combinations"
            val fileBuilder = FileSpec.builder(packageName, generatedObjectName)
            val objectBuilder = TypeSpec.objectBuilder(generatedObjectName)
                .addKdoc(
                    "Provides pre-configured instances of [%T] with various parameter combinations.",
                    originalClassTypeName
                )

            val generatedPropertyNames = mutableListOf<String>()

            val totalCombinations = combinableParameterGroups.fold(1) { acc, group -> acc * group.second.size }
            if (totalCombinations == 0 && combinableParameterGroups.isNotEmpty()) {
                logger.warn("Total combinations is 0, likely due to an empty list of provided values for a typed parameter in $originalClassNameString, despite groups being identified.", classDeclaration)
                return
            }

            writeProperties(
                totalCombinations = totalCombinations,
                combinableParameterGroups = combinableParameterGroups,
                originalClassNameString = originalClassNameString,
                generatedPropertyNames = generatedPropertyNames,
                objectBuilder = objectBuilder,
                originalClassTypeName = originalClassTypeName,
                constructorParameters = constructorParameters,
                logger = logger
            )

            generateCode(
                generatedPropertyNames = generatedPropertyNames,
                originalClassTypeName = originalClassTypeName,
                objectBuilder = objectBuilder,
                fileBuilder = fileBuilder,
                classDeclaration = classDeclaration,
                codeGenerator = codeGenerator,
                packageName = packageName,
                generatedObjectName = generatedObjectName,
                originalClassNameString = originalClassNameString,
                logger = logger
            )
        }
    }
}
