package com.sarim.kombinator.utils

import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.symbol.KSAnnotation
import com.squareup.kotlinpoet.BYTE
import com.squareup.kotlinpoet.CHAR
import com.squareup.kotlinpoet.DOUBLE
import com.squareup.kotlinpoet.FLOAT
import com.squareup.kotlinpoet.INT
import com.squareup.kotlinpoet.LONG
import com.squareup.kotlinpoet.SHORT
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.U_BYTE
import com.squareup.kotlinpoet.U_INT
import com.squareup.kotlinpoet.U_LONG
import com.squareup.kotlinpoet.U_SHORT

@Suppress("CyclomaticComplexMethod", "LongMethod")
fun readParameter(
    constructorParameters: List<ConstructorParameterInfo>,
    classLevelAnnotation: KSAnnotation?,
    combinableParameterGroups: MutableList<Pair<ConstructorParameterInfo, List<Any>>>,
    originalClassNameString: String,
    logger: KSPLogger,
) {
    constructorParameters
        .filter { !it.isBoolean && !it.isEnum && it.enumClassDeclaration == null && !it.hasDefaultValue }
        .forEach { paramInfo ->
            val annotationToUse = paramInfo.parameterAnnotation ?: classLevelAnnotation
            var valuesForParam: List<Any>? = null
            var sourceOfValues = "unknown"

            if (annotationToUse != null) {
                sourceOfValues =
                    if (paramInfo.parameterAnnotation != null) "parameter-level @Kombine" else "class-level @Kombine"
                valuesForParam =
                    when (paramInfo.type) {
                        STRING ->
                            readAnnotationArrayArgument(
                                annotationToUse,
                                "allPossibleStringParams",
                                "String",
                                logger,
                            ) { item, _ -> item as? String }

                        INT ->
                            readAnnotationArrayArgument(
                                annotationToUse,
                                "allPossibleIntParams",
                                "Int",
                                logger,
                            ) { item, _ -> (item as? Number)?.toInt() }

                        FLOAT ->
                            readAnnotationArrayArgument(
                                annotationToUse,
                                "allPossibleFloatParams",
                                "Float",
                                logger,
                            ) { item, _ -> (item as? Number)?.toFloat() }

                        DOUBLE ->
                            readAnnotationArrayArgument(
                                annotationToUse,
                                "allPossibleDoubleParams",
                                "Double",
                                logger,
                            ) { item, _ -> (item as? Number)?.toDouble() }

                        LONG ->
                            readAnnotationArrayArgument(
                                annotationToUse,
                                "allPossibleLongParams",
                                "Long",
                                logger,
                            ) { item, _ -> (item as? Number)?.toLong() }

                        BYTE ->
                            readAnnotationArrayArgument(
                                annotationToUse,
                                "allPossibleByteParams",
                                "Byte",
                                logger,
                            ) { item, _ -> (item as? Number)?.toByte() }

                        CHAR ->
                            readAnnotationArrayArgument(
                                annotationToUse,
                                "allPossibleCharParams",
                                "Char",
                                logger,
                            ) { item, _ -> item as? Char }

                        SHORT ->
                            readAnnotationArrayArgument(
                                annotationToUse,
                                "allPossibleShortParams",
                                "Short",
                                logger,
                            ) { item, _ -> (item as? Number)?.toShort() }

                        U_BYTE ->
                            readAnnotationArrayArgument(
                                annotationToUse,
                                "allPossibleUByteParams",
                                "UByte",
                                logger,
                            ) { item, l ->
                                when (item) {
                                    is UByte -> item
                                    is Byte -> item.toUByte()
                                    is Number -> item.toLong().toUByte()
                                    else -> {
                                        l.warn(
                                            "Cannot cast ${item::class.qualifiedName} " +
                                                "to UByte for 'allPossibleUByteParams' from $sourceOfValues",
                                        )
                                        null
                                    }
                                }
                            }

                        U_SHORT ->
                            readAnnotationArrayArgument(
                                annotationToUse,
                                "allPossibleUShortParams",
                                "UShort",
                                logger,
                            ) { item, l ->
                                when (item) {
                                    is UShort -> item
                                    is Short -> item.toUShort()
                                    is Number -> item.toLong().toUShort()
                                    else -> {
                                        l.warn(
                                            "Cannot cast ${item::class.qualifiedName} " +
                                                "to UShort for 'allPossibleUShortParams' from $sourceOfValues",
                                        )
                                        null
                                    }
                                }
                            }

                        U_INT ->
                            readAnnotationArrayArgument(
                                annotationToUse,
                                "allPossibleUIntParams",
                                "UInt",
                                logger,
                            ) { item, l ->
                                when (item) {
                                    is UInt -> item
                                    is Int -> item.toUInt()
                                    is Number -> item.toLong().toUInt()
                                    else -> {
                                        l.warn(
                                            "Cannot cast ${item::class.qualifiedName} " +
                                                "to UInt for 'allPossibleUIntParams' from $sourceOfValues",
                                        )
                                        null
                                    }
                                }
                            }

                        U_LONG ->
                            readAnnotationArrayArgument(
                                annotationToUse,
                                "allPossibleULongParams",
                                "ULong",
                                logger,
                            ) { item, l ->
                                when (item) {
                                    is ULong -> item
                                    is Long -> item.toULong()
                                    is Number -> item.toLong().toULong()
                                    else -> {
                                        l.warn(
                                            "Cannot cast ${item::class.qualifiedName} " +
                                                "to ULong for 'allPossibleULongParams' from $sourceOfValues",
                                        )
                                        null
                                    }
                                }
                            }

                        else -> null
                    }
            }

            if (valuesForParam != null && valuesForParam.isNotEmpty()) {
                combinableParameterGroups.add(paramInfo to valuesForParam)
            } else if (valuesForParam != null) {
                val argName =
                    when (paramInfo.type) {
                        STRING -> "allPossibleStringParams"
                        INT -> "allPossibleIntParams"
                        FLOAT -> "allPossibleFloatParams"
                        DOUBLE -> "allPossibleDoubleParams"
                        LONG -> "allPossibleLongParams"
                        BYTE -> "allPossibleByteParams"
                        CHAR -> "allPossibleCharParams"
                        SHORT -> "allPossibleShortParams"
                        U_BYTE -> "allPossibleUByteParams"
                        U_SHORT -> "allPossibleUShortParams"
                        U_INT -> "allPossibleUIntParams"
                        U_LONG -> "allPossibleULongParams"
                        else -> "unknown arg name!"
                    }
                logger.error(
                    "Parameter '${paramInfo.name}: ${paramInfo.type}' " +
                        "in $originalClassNameString uses $sourceOfValues, " +
                        "but its '$argName' is empty. Provide values to combine or remove the annotation/parameter.",
                    paramInfo.ksParameter,
                )
            }
        }
}
