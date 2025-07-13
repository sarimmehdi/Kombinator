package com.sarim.kombinator_app.sample

import com.sarim.kombinator.Kombine

@Kombine(
    allPossibleUShortParams = [1u, 2u],
)
data class SampleDataClass1UShortWithUShortParams(
    val property1: UShort,
)

@Kombine(
    allPossibleUShortParams = [1u, 2u],
)
data class SampleDataClass2UShortsWithUShortParams(
    val property1: UShort,
    val property2: UShort,
)

@Kombine(
    allPossibleUShortParams = [1u, 2u],
)
data class SampleDataClass3UShortsWithUShortParams(
    val property1: UShort,
    val property2: UShort,
    val property3: UShort,
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
data class SampleDataClass1UShortWithAllParams(
    val property1: UShort,
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
    allPossibleUShortParams = [1u, 2u],
    allPossibleUByteParams = [1u, 2u],
    allPossibleUIntParams = [1u, 2u],
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass2UShortsWithAllParams(
    val property1: UShort,
    val property2: UShort,
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
    allPossibleUShortParams = [1u, 2u],
    allPossibleUByteParams = [1u, 2u],
    allPossibleUIntParams = [1u, 2u],
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass3UShortsWithAllParams(
    val property1: UShort,
    val property2: UShort,
    val property3: UShort,
)

@Kombine(
    allPossibleDoubleParams = [1.0, 2.0],
    allPossibleByteParams = [1, 2],
    allPossibleCharParams = ['1', '2'],
    allPossibleUShortParams = [1u, 2u],
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass1UShortWithSomeParams(
    val property1: UShort,
)

@Kombine(
    allPossibleByteParams = [1, 2],
    allPossibleCharParams = ['1', '2'],
    allPossibleUShortParams = [1u, 2u],
)
data class SampleDataClass2UShortsWithSomeParams(
    val property1: UShort,
    val property2: UShort,
)

@Kombine(
    allPossibleStringParams = ["abc", "cde"],
    allPossibleIntParams = [1, 2],
    allPossibleFloatParams = [1f, 2f],
    allPossibleCharParams = ['1', '2'],
    allPossibleUShortParams = [1u, 2u],
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass3UShortsWithSomeParams(
    val property1: UShort,
    val property2: UShort,
    val property3: UShort,
)
