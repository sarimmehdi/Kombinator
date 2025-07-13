package com.sarim.kombinator.utils

import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.symbol.KSAnnotation

fun <T> readAnnotationArrayArgument(
    annotation: KSAnnotation,
    argumentName: String,
    expectedItemTypeName: String,
    logger: KSPLogger,
    caster: (Any, KSPLogger) -> T?,
): List<T> {
    val argument = annotation.arguments.firstOrNull { it.name?.asString() == argumentName }
    val value = argument?.value

    return when (value) {
        is List<*> -> {
            value.mapNotNull { item ->
                if (item == null) {
                    logger.warn(
                        "Null item found in list for argument '$argumentName' in @${annotation.shortName.asString()}.",
                        annotation,
                    )
                    null
                } else {
                    val castedValue = caster(item, logger)
                    if (castedValue == null) {
                        logger.warn(
                            "Unexpected item type or failed cast in '$argumentName' " +
                                    "for @${annotation.shortName.asString()}. Expected to be able to " +
                                    "convert to $expectedItemTypeName, got ${item::class.qualifiedName} " +
                                    "with value '$item'.",
                            annotation,
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
                annotation,
            )
            emptyList()
        }
    }
}
