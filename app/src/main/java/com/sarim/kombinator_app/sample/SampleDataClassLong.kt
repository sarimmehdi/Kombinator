package com.sarim.kombinator_app.sample

import com.sarim.kombinator.Kombine

@Kombine(
    allPossibleLongParams = [1, 2],
)
data class SampleDataClass1LongWithLongParams(
    val property1: Long,
)

@Kombine(
    allPossibleLongParams = [1, 2],
)
data class SampleDataClass2LongsWithLongParams(
    val property1: Long,
    val property2: Long,
)

@Kombine(
    allPossibleLongParams = [1, 2],
)
data class SampleDataClass3LongsWithLongParams(
    val property1: Long,
    val property2: Long,
    val property3: Long,
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
data class SampleDataClass1LongWithAllParams(
    val property1: Long,
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
data class SampleDataClass2LongsWithAllParams(
    val property1: Long,
    val property2: Long,
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
data class SampleDataClass3LongsWithAllParams(
    val property1: Long,
    val property2: Long,
    val property3: Long,
)

@Kombine(
    allPossibleDoubleParams = [1.0, 2.0],
    allPossibleLongParams = [1, 2],
    allPossibleCharParams = ['1', '2'],
    allPossibleShortParams = [1, 2],
    allPossibleUByteParams = [1u, 2u],
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass1LongWithSomeParams(
    val property1: Long,
)

@Kombine(
    allPossibleLongParams = [1, 2],
    allPossibleCharParams = ['1', '2'],
    allPossibleShortParams = [1, 2],
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass2LongsWithSomeParams(
    val property1: Long,
    val property2: Long,
)

@Kombine(
    allPossibleStringParams = ["abc", "cde"],
    allPossibleIntParams = [1, 2],
    allPossibleFloatParams = [1f, 2f],
    allPossibleLongParams = [1, 2],
    allPossibleShortParams = [1, 2],
    allPossibleUByteParams = [1u, 2u],
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass3LongsWithSomeParams(
    val property1: Long,
    val property2: Long,
    val property3: Long,
)
