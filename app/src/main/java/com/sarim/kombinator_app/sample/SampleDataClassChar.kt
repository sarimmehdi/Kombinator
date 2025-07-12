package com.sarim.kombinator_app.sample

import com.sarim.kombinator.Kombine

@Kombine(
    allPossibleCharParams = ['1', '2']
)
data class SampleDataClass1CharWithCharParams(
    val property1: Char,
)

@Kombine(
    allPossibleCharParams = ['1', '2']
)
data class SampleDataClass2CharsWithCharParams(
    val property1: Char,
    val property2: Char,
)

@Kombine(
    allPossibleCharParams = ['1', '2']
)
data class SampleDataClass3CharsWithCharParams(
    val property1: Char,
    val property2: Char,
    val property3: Char,
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
    allPossibleUShortParams = [1u, 2u],
    allPossibleUIntParams = [1u, 2u],
    allPossibleUByteParams = [1u, 2u],
)
data class SampleDataClass1CharWithAllParams(
    val property1: Char,
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
    allPossibleUShortParams = [1u, 2u],
    allPossibleUIntParams = [1u, 2u],
    allPossibleUByteParams = [1u, 2u],
)
data class SampleDataClass2CharsWithAllParams(
    val property1: Char,
    val property2: Char,
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
    allPossibleUShortParams = [1u, 2u],
    allPossibleUIntParams = [1u, 2u],
    allPossibleUByteParams = [1u, 2u],
)
data class SampleDataClass3CharsWithAllParams(
    val property1: Char,
    val property2: Char,
    val property3: Char,
)

@Kombine(
    allPossibleDoubleParams = [1.0, 2.0],
    allPossibleByteParams = [1, 2],
    allPossibleCharParams = ['1', '2'],
    allPossibleShortParams = [1, 2],
    allPossibleULongParams = [1u, 2u],
    allPossibleUByteParams = [1u, 2u],
)
data class SampleDataClass1CharWithSomeParams(
    val property1: Char,
)

@Kombine(
    allPossibleByteParams = [1, 2],
    allPossibleCharParams = ['1', '2'],
    allPossibleShortParams = [1, 2],
    allPossibleUByteParams = [1u, 2u],
)
data class SampleDataClass2CharsWithSomeParams(
    val property1: Char,
    val property2: Char,
)

@Kombine(
    allPossibleStringParams = ["abc", "cde"],
    allPossibleIntParams = [1, 2],
    allPossibleFloatParams = [1f, 2f],
    allPossibleCharParams = ['1', '2'],
    allPossibleShortParams = [1, 2],
    allPossibleULongParams = [1u, 2u],
    allPossibleUByteParams = [1u, 2u],
)
data class SampleDataClass3CharsWithSomeParams(
    val property1: Char,
    val property2: Char,
    val property3: Char,
)
