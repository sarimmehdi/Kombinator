package com.sarim.kombinator.utils

import com.google.devtools.ksp.processing.KSPLogger
import com.squareup.kotlinpoet.CHAR
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FLOAT
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.U_BYTE
import com.squareup.kotlinpoet.U_INT
import com.squareup.kotlinpoet.U_LONG
import com.squareup.kotlinpoet.U_SHORT

fun writeProperties(
    totalCombinations: Int,
    combinableParameterGroups: MutableList<Pair<ConstructorParameterInfo, List<Any>>>,
    originalClassNameString: String,
    generatedPropertyNames: MutableList<String>,
    objectBuilder: TypeSpec.Builder,
    originalClassTypeName: TypeName,
    constructorParameters: List<ConstructorParameterInfo>,
    logger: KSPLogger
) {
    var instanceCounter = 1
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
            combinationNameForKdoc = "\n" + combinationNameParts.joinToString("\n"),
            logger = logger
        )

        for (k in combinableParameterGroups.indices.reversed()) {
            currentIndices[k]++
            if (currentIndices[k] < combinableParameterGroups[k].second.size) {
                break
            }
            currentIndices[k] = 0
        }
    }
}

fun generateInstanceProperty(
    objectBuilder: TypeSpec.Builder,
    originalClassTypeName: TypeName,
    instancePropertyName: String,
    parameterValues: Map<String, Any>,
    parameterInfos: List<ConstructorParameterInfo>,
    combinationNameForKdoc: String,
    logger: KSPLogger
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

        if (paramInfo.isEnum) {
            propertyArgs.add(CodeBlock.of("%N = %T.%L", paramName, paramInfo.type, value))
        } else {
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