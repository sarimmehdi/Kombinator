package com.sarim.kombinator

import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.Dependencies
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.processing.SymbolProcessorProvider
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSValueParameter
import com.google.devtools.ksp.symbol.KSVisitorVoid
import com.google.devtools.ksp.symbol.Modifier
import com.google.devtools.ksp.validate
import com.squareup.kotlinpoet.BOOLEAN
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.LIST
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.ksp.toTypeName
import com.squareup.kotlinpoet.ksp.writeTo

data class ConstructorParameterInfo(
    val name: String,
    val type: TypeName,
    val isBoolean: Boolean,
    val ksParameter: KSValueParameter
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

            val originalClassNameString = classDeclaration.simpleName.asString()
            val originalClassTypeName = classDeclaration.asType(emptyList()).toTypeName()
            val packageName = classDeclaration.packageName.asString()

            val primaryConstructor = classDeclaration.primaryConstructor
            if (primaryConstructor == null) {
                logger.error(
                    "Class ${classDeclaration.qualifiedName?.asString()} annotated with @Kombine " +
                            "must have a primary constructor to generate instance combinations.",
                    classDeclaration
                )
                return
            }

            val constructorParameters = primaryConstructor.parameters.mapNotNull { ksParam ->
                val name = ksParam.name?.asString()
                if (name == null) {
                    logger.error("Constructor parameter in $originalClassNameString has no name.", ksParam)
                    return@mapNotNull null
                }
                val type = ksParam.type.resolve().toTypeName()
                ConstructorParameterInfo(name, type, type == BOOLEAN, ksParam)
            }

            if (constructorParameters.isEmpty() && primaryConstructor.parameters.isNotEmpty()) {
                logger.error("Failed to parse constructor parameters for $originalClassNameString.", classDeclaration)
                return
            }

            val booleanConstructorParams = constructorParameters.filter { it.isBoolean }

            if (booleanConstructorParams.isEmpty()) {
                logger.warn(
                    "No boolean constructor parameters found in ${classDeclaration.qualifiedName?.asString()} " +
                            "to generate combinations.", classDeclaration
                )
                return
            }

            val numBooleanProperties = booleanConstructorParams.size
            val totalCombinations = 1 shl numBooleanProperties

            val generatedObjectName = "${originalClassNameString}Combinations"
            val fileBuilder = FileSpec.builder(packageName, generatedObjectName)
            val objectBuilder = TypeSpec.objectBuilder(generatedObjectName)
                .addKdoc(
                    "Provides pre-configured instances of [%T] with various boolean combinations.",
                    originalClassTypeName
                )

            val generatedPropertyNames = mutableListOf<String>()
            var instanceCounter = 1

            for (i in 0 until totalCombinations) {
                val booleanValuesForThisCombination = mutableMapOf<String, Boolean>()
                val combinationNameParts = mutableListOf<String>()

                for (j in 0 until numBooleanProperties) {
                    val paramInfo = booleanConstructorParams[j]
                    val propertyName = paramInfo.name
                    val isTrue = (i shr j) and 1 == 1
                    booleanValuesForThisCombination[propertyName] = isTrue
                    combinationNameParts.add("$propertyName = $isTrue")
                }

                val basePropertyName = originalClassNameString.replaceFirstChar { it.lowercaseChar() }
                val instancePropertyName = "${basePropertyName}${instanceCounter}"
                instanceCounter++

                generatedPropertyNames.add(instancePropertyName)

                generateInstanceProperty(
                    objectBuilder = objectBuilder,
                    originalClassTypeName = originalClassTypeName,
                    instancePropertyName = instancePropertyName,
                    fixedBooleanValues = booleanValuesForThisCombination,
                    combinationNameForKdoc = "\n" + combinationNameParts.joinToString("\n")
                )
            }

            if (generatedPropertyNames.isNotEmpty()) {
                val listType = LIST.parameterizedBy(originalClassTypeName)
                val getAllFunBuilder = FunSpec.builder("getAllCombinations")
                    .addKdoc("Returns a list of all pre-configured [%T] instances.", originalClassTypeName)
                    .returns(listType)

                val codeBlockBuilder = CodeBlock.builder()
                codeBlockBuilder.add("return listOf(⇥")

                generatedPropertyNames.forEachIndexed { index, propName ->
                    if (index == 0) {
                        codeBlockBuilder.add("\n%N", propName)
                    } else {
                        codeBlockBuilder.add(",\n%N", propName)
                    }
                }

                codeBlockBuilder.add("\n⇤)")
                getAllFunBuilder.addCode(codeBlockBuilder.build())
                objectBuilder.addFunction(getAllFunBuilder.build())
            }

            fileBuilder.addType(objectBuilder.build())
            val fileSpec = fileBuilder.build()

            classDeclaration.containingFile?.let { fileContainingOriginalSourceClass ->
                fileSpec.writeTo(
                    codeGenerator,
                    Dependencies(aggregating = false, fileContainingOriginalSourceClass)
                )
                logger.info("Generated: $packageName.$generatedObjectName containing instance factories.")
            } ?: logger.error(
                "Error generating file $packageName.$generatedObjectName: " +
                        "the file containing $originalClassTypeName is null!",
                classDeclaration
            )
        }

        private fun generateInstanceProperty(
            objectBuilder: TypeSpec.Builder,
            originalClassTypeName: TypeName,
            instancePropertyName: String,
            fixedBooleanValues: Map<String, Boolean>,
            combinationNameForKdoc: String
        ) {
            val propertyArgs = mutableListOf<CodeBlock>()
            fixedBooleanValues.forEach { (paramName, value) ->
                propertyArgs.add(CodeBlock.of("%N = %L", paramName, value))
            }

            val propertyInitializer = CodeBlock.builder()
                .add("%T(⇥\n", originalClassTypeName)
                .add(propertyArgs.joinToString(",\n"))
                .add("\n⇤)")
                .build()

            val propSpec = PropertySpec.builder(instancePropertyName, originalClassTypeName)
                .addKdoc(
                    "An instance of [%T] with boolean flags: %L.\n",
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
