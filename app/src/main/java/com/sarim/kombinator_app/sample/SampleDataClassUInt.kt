package com.sarim.kombinator_app.sample

import com.sarim.kombinator.Kombine

@Kombine(
    allPossibleUIntParams = [1u, 2u],
)
data class SampleDataClass1UIntWithUIntParams(
    val property1: UInt,
)

@Kombine(
    allPossibleUIntParams = [1u, 2u],
)
data class SampleDataClass2UIntsWithUIntParams(
    val property1: UInt,
    val property2: UInt,
)

@Kombine(
    allPossibleUIntParams = [1u, 2u],
)
data class SampleDataClass3UIntsWithUIntParams(
    val property1: UInt,
    val property2: UInt,
    val property3: UInt,
)

@Kombine(
    allPossibleStringParams = ["abc", "cde"],
    allPossibleIntParams = [1, 2],
    allPossibleFloatParams = [1f, 2f],
    allPossibleDoubleParams = [1.0, 2.0],
    allPossibleLongParams = [1, 2],
    allPossibleByteParams = [1, 2],
    allPossibleCharParams = ['1', '2'],
    allPossibleShortParams = [1, 2],
    allPossibleUByteParams = [1u, 2u],
    allPossibleUShortParams = [1u, 2u],
    allPossibleUIntParams = [1u, 2u],
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass1UIntWithAllParams(
    val property1: UInt,
)

@Kombine(
    allPossibleStringParams = ["abc", "cde"],
    allPossibleIntParams = [1, 2],
    allPossibleFloatParams = [1f, 2f],
    allPossibleDoubleParams = [1.0, 2.0],
    allPossibleLongParams = [1, 2],
    allPossibleByteParams = [1, 2],
    allPossibleCharParams = ['1', '2'],
    allPossibleShortParams = [1, 2],
    allPossibleUIntParams = [1u, 2u],
    allPossibleUByteParams = [1u, 2u],
    allPossibleUShortParams = [1u, 2u],
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass2UIntsWithAllParams(
    val property1: UInt,
    val property2: UInt,
)

@Kombine(
    allPossibleStringParams = ["abc", "cde"],
    allPossibleIntParams = [1, 2],
    allPossibleFloatParams = [1f, 2f],
    allPossibleDoubleParams = [1.0, 2.0],
    allPossibleLongParams = [1, 2],
    allPossibleByteParams = [1, 2],
    allPossibleCharParams = ['1', '2'],
    allPossibleShortParams = [1, 2],
    allPossibleUIntParams = [1u, 2u],
    allPossibleUByteParams = [1u, 2u],
    allPossibleUShortParams = [1u, 2u],
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass3UIntsWithAllParams(
    val property1: UInt,
    val property2: UInt,
    val property3: UInt,
)

@Kombine(
    allPossibleDoubleParams = [1.0, 2.0],
    allPossibleByteParams = [1, 2],
    allPossibleCharParams = ['1', '2'],
    allPossibleUIntParams = [1u, 2u],
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass1UIntWithSomeParams(
    val property1: UInt,
)

@Kombine(
    allPossibleByteParams = [1, 2],
    allPossibleCharParams = ['1', '2'],
    allPossibleUIntParams = [1u, 2u],
)
data class SampleDataClass2UIntsWithSomeParams(
    val property1: UInt,
    val property2: UInt,
)

@Kombine(
    allPossibleStringParams = ["abc", "cde"],
    allPossibleIntParams = [1, 2],
    allPossibleFloatParams = [1f, 2f],
    allPossibleCharParams = ['1', '2'],
    allPossibleUIntParams = [1u, 2u],
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass3UIntsWithSomeParams(
    val property1: UInt,
    val property2: UInt,
    val property3: UInt,
)
