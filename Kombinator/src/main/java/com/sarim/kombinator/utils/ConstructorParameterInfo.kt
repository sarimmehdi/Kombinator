package com.sarim.kombinator.utils

import com.google.devtools.ksp.symbol.KSAnnotation
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSValueParameter
import com.squareup.kotlinpoet.TypeName

data class ConstructorParameterInfo(
    val name: String,
    val type: TypeName,
    val hasDefaultValue: Boolean,
    val ksParameter: KSValueParameter,
    val parameterAnnotation: KSAnnotation? = null,
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
    val isULong: Boolean = false,
    val isEnum: Boolean = false,
    val enumClassDeclaration: KSClassDeclaration? = null,
)
