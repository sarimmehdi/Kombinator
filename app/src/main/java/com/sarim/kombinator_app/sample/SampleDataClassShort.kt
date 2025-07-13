package com.sarim.kombinator_app.sample

import com.sarim.kombinator.Kombine

@Kombine(
    allPossibleShortParams = [1, 2],
)
data class SampleDataClass1ShortWithShortParams(
    val property1: Short,
)

@Kombine(
    allPossibleShortParams = [1, 2],
)
data class SampleDataClass2ShortsWithShortParams(
    val property1: Short,
    val property2: Short,
)

@Kombine(
    allPossibleShortParams = [1, 2],
)
data class SampleDataClass3ShortsWithShortParams(
    val property1: Short,
    val property2: Short,
    val property3: Short,
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
data class SampleDataClass1ShortWithAllParams(
    val property1: Short,
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
data class SampleDataClass2ShortsWithAllParams(
    val property1: Short,
    val property2: Short,
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
data class SampleDataClass3ShortsWithAllParams(
    val property1: Short,
    val property2: Short,
    val property3: Short,
)

@Kombine(
    allPossibleDoubleParams = [1.0, 2.0],
    allPossibleByteParams = [1, 2],
    allPossibleCharParams = ['1', '2'],
    allPossibleShortParams = [1, 2],
    allPossibleULongParams = [1u, 2u],
    allPossibleUByteParams = [1u, 2u],
)
data class SampleDataClass1ShortWithSomeParams(
    val property1: Short,
)

@Kombine(
    allPossibleByteParams = [1, 2],
    allPossibleCharParams = ['1', '2'],
    allPossibleShortParams = [1, 2],
    allPossibleUByteParams = [1u, 2u],
)
data class SampleDataClass2ShortsWithSomeParams(
    val property1: Short,
    val property2: Short,
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
data class SampleDataClass3ShortsWithSomeParams(
    val property1: Short,
    val property2: Short,
    val property3: Short,
)
