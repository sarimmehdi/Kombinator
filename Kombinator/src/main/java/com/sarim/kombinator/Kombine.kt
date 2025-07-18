package com.sarim.kombinator

@Target(AnnotationTarget.CLASS, AnnotationTarget.VALUE_PARAMETER)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class Kombine
    @Suppress("LongParameterList")
    @OptIn(ExperimentalUnsignedTypes::class)
    constructor(
        val allPossibleStringParams: Array<String> = [],
        val allPossibleIntParams: IntArray = [],
        val allPossibleFloatParams: FloatArray = [],
        val allPossibleDoubleParams: DoubleArray = [],
        val allPossibleLongParams: LongArray = [],
        val allPossibleByteParams: ByteArray = [],
        val allPossibleCharParams: CharArray = [],
        val allPossibleShortParams: ShortArray = [],
        val allPossibleUByteParams: UByteArray = [],
        val allPossibleUShortParams: UShortArray = [],
        val allPossibleUIntParams: UIntArray = [],
        val allPossibleULongParams: ULongArray = [],
    )
