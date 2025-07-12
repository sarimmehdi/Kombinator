package com.sarim.kombinator_app.sample

import com.sarim.kombinator.Kombine

@Kombine(
    allPossibleIntParams = [1, 2]
)
data class SampleDataClass1IntWithIntParams(
    val property1: Int,
)

@Kombine(
    allPossibleIntParams = [1, 2]
)
data class SampleDataClass2IntsWithIntParams(
    val property1: Int,
    val property2: Int,
)

@Kombine(
    allPossibleIntParams = [1, 2]
)
data class SampleDataClass3IntsWithIntParams(
    val property1: Int,
    val property2: Int,
    val property3: Int,
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
data class SampleDataClass1IntWithAllParams(
    val property1: Int,
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
data class SampleDataClass2IntsWithAllParams(
    val property1: Int,
    val property2: Int,
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
data class SampleDataClass3IntsWithAllParams(
    val property1: Int,
    val property2: Int,
    val property3: Int,
)

@Kombine(
    allPossibleIntParams = [1, 2],
    allPossibleLongParams = [1, 2],
    allPossibleCharParams = ['1', '2'],
    allPossibleShortParams = [1, 2],
    allPossibleUByteParams = [1u, 2u],
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass1IntWithSomeParams(
    val property1: Int,
)

@Kombine(
    allPossibleIntParams = [1, 2],
    allPossibleCharParams = ['1', '2'],
    allPossibleShortParams = [1, 2],
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass2IntsWithSomeParams(
    val property1: Int,
    val property2: Int,
)

@Kombine(
    allPossibleStringParams = ["abc", "cde"],
    allPossibleIntParams = [1, 2],
    allPossibleFloatParams = [1f, 2f],
    allPossibleDoubleParams = [1.0, 2.0],
    allPossibleShortParams = [1, 2],
    allPossibleUByteParams = [1u, 2u],
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass3IntsWithSomeParams(
    val property1: Int,
    val property2: Int,
    val property3: Int,
)
