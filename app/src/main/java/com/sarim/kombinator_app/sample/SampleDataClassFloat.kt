package com.sarim.kombinator_app.sample

import com.sarim.kombinator.Kombine

@Kombine(
    allPossibleFloatParams = [1f, 2f]
)
data class SampleDataClass1FloatWithFloatParams(
    val property1: Float,
)

@Kombine(
    allPossibleFloatParams = [1f, 2f]
)
data class SampleDataClass2FloatsWithFloatParams(
    val property1: Float,
    val property2: Float,
)

@Kombine(
    allPossibleFloatParams = [1f, 2f]
)
data class SampleDataClass3FloatsWithFloatParams(
    val property1: Float,
    val property2: Float,
    val property3: Float,
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
data class SampleDataClass1FloatWithAllParams(
    val property1: Float,
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
data class SampleDataClass2FloatsWithAllParams(
    val property1: Float,
    val property2: Float,
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
data class SampleDataClass3FloatsWithAllParams(
    val property1: Float,
    val property2: Float,
    val property3: Float,
)

@Kombine(
    allPossibleFloatParams = [1f, 2f],
    allPossibleLongParams = [1, 2],
    allPossibleCharParams = ['1', '2'],
    allPossibleShortParams = [1, 2],
    allPossibleUByteParams = [1u, 2u],
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass1FloatWithSomeParams(
    val property1: Float,
)

@Kombine(
    allPossibleFloatParams = [1f, 2f],
    allPossibleCharParams = ['1', '2'],
    allPossibleShortParams = [1, 2],
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass2FloatsWithSomeParams(
    val property1: Float,
    val property2: Float,
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
data class SampleDataClass3FloatsWithSomeParams(
    val property1: Float,
    val property2: Float,
    val property3: Float,
)
