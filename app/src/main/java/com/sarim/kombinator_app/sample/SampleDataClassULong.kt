package com.sarim.kombinator_app.sample

import com.sarim.kombinator.Kombine

@Kombine(
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass1ULongWithULongParams(
    val property1: ULong,
)

@Kombine(
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass2ULongsWithULongParams(
    val property1: ULong,
    val property2: ULong,
)

@Kombine(
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass3ULongsWithULongParams(
    val property1: ULong,
    val property2: ULong,
    val property3: ULong,
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
data class SampleDataClass1ULongWithAllParams(
    val property1: ULong,
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
    allPossibleULongParams = [1u, 2u],
    allPossibleUByteParams = [1u, 2u],
    allPossibleUShortParams = [1u, 2u],
    allPossibleUIntParams = [1u, 2u],
)
data class SampleDataClass2ULongsWithAllParams(
    val property1: ULong,
    val property2: ULong,
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
    allPossibleULongParams = [1u, 2u],
    allPossibleUByteParams = [1u, 2u],
    allPossibleUShortParams = [1u, 2u],
    allPossibleUIntParams = [1u, 2u],
)
data class SampleDataClass3ULongsWithAllParams(
    val property1: ULong,
    val property2: ULong,
    val property3: ULong,
)

@Kombine(
    allPossibleDoubleParams = [1.0, 2.0],
    allPossibleByteParams = [1, 2],
    allPossibleCharParams = ['1', '2'],
    allPossibleULongParams = [1u, 2u],
    allPossibleUIntParams = [1u, 2u],
)
data class SampleDataClass1ULongWithSomeParams(
    val property1: ULong,
)

@Kombine(
    allPossibleByteParams = [1, 2],
    allPossibleCharParams = ['1', '2'],
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass2ULongsWithSomeParams(
    val property1: ULong,
    val property2: ULong,
)

@Kombine(
    allPossibleStringParams = ["abc", "cde"],
    allPossibleIntParams = [1, 2],
    allPossibleFloatParams = [1f, 2f],
    allPossibleCharParams = ['1', '2'],
    allPossibleULongParams = [1u, 2u],
    allPossibleUIntParams = [1u, 2u],
)
data class SampleDataClass3ULongsWithSomeParams(
    val property1: ULong,
    val property2: ULong,
    val property3: ULong,
)
