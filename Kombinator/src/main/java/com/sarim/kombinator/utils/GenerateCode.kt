package com.sarim.kombinator.utils

import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.Dependencies
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.LIST
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.ksp.writeTo

@Suppress("LongParameterList")
fun generateCode(
    generatedPropertyNames: List<String>,
    originalClassTypeName: TypeName,
    objectBuilder: TypeSpec.Builder,
    fileBuilder: FileSpec.Builder,
    classDeclaration: KSClassDeclaration,
    codeGenerator: CodeGenerator,
    packageName: String,
    generatedObjectName: String,
    originalClassNameString: String,
    logger: KSPLogger,
) {
    if (generatedPropertyNames.isNotEmpty()) {
        val listType = LIST.parameterizedBy(originalClassTypeName)
        val getAllFunBuilder =
            FunSpec
                .builder("getAllCombinations")
                .addKdoc("Returns a list of all pre-configured [%T] instances.", originalClassTypeName)
                .returns(listType)
        val codeBlockBuilder = CodeBlock.builder().add("return listOf(⇥")
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

    classDeclaration.containingFile?.let { file ->
        fileSpec.writeTo(codeGenerator, Dependencies(aggregating = false, file))
        logger.info("Generated: $packageName.$generatedObjectName")
    } ?: logger.error("Containing file is null for $originalClassNameString.", classDeclaration)
}
