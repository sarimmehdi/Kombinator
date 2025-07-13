package com.sarim.kombinator_app.sample

import com.sarim.kombinator.Kombine

@Kombine(
    allPossibleUByteParams = [1u, 2u],
)
data class SampleDataClass1UByteWithUByteParams(
    val property1: UByte,
)

@Kombine(
    allPossibleUByteParams = [1u, 2u],
)
data class SampleDataClass2UBytesWithUByteParams(
    val property1: UByte,
    val property2: UByte,
)

@Kombine(
    allPossibleUByteParams = [1u, 2u],
)
data class SampleDataClass3UBytesWithUByteParams(
    val property1: UByte,
    val property2: UByte,
    val property3: UByte,
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
data class SampleDataClass1UByteWithAllParams(
    val property1: UByte,
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
data class SampleDataClass2UBytesWithAllParams(
    val property1: UByte,
    val property2: UByte,
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
data class SampleDataClass3UBytesWithAllParams(
    val property1: UByte,
    val property2: UByte,
    val property3: UByte,
)

@Kombine(
    allPossibleDoubleParams = [1.0, 2.0],
    allPossibleByteParams = [1, 2],
    allPossibleCharParams = ['1', '2'],
    allPossibleUByteParams = [1u, 2u],
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass1UByteWithSomeParams(
    val property1: UByte,
)

@Kombine(
    allPossibleByteParams = [1, 2],
    allPossibleCharParams = ['1', '2'],
    allPossibleUByteParams = [1u, 2u],
)
data class SampleDataClass2UBytesWithSomeParams(
    val property1: UByte,
    val property2: UByte,
)

@Kombine(
    allPossibleStringParams = ["abc", "cde"],
    allPossibleIntParams = [1, 2],
    allPossibleFloatParams = [1f, 2f],
    allPossibleCharParams = ['1', '2'],
    allPossibleUByteParams = [1u, 2u],
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass3UBytesWithSomeParams(
    val property1: UByte,
    val property2: UByte,
    val property3: UByte,
)
