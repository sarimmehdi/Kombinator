package com.sarim.kombinator_app.sample

import com.sarim.kombinator.Kombine

@Kombine(
    allPossibleStringParams = ["abc", "cde"],
    allPossibleIntParams = [1],
    allPossibleFloatParams = [1f, 2f, 3f],
    allPossibleDoubleParams = [1.0, 2.0],
    allPossibleLongParams = [1, 2],
    allPossibleByteParams = [1, 2],
    allPossibleCharParams = ['1', '2', '3'],
    allPossibleShortParams = [1, 2],
    allPossibleUByteParams = [1u, 2u],
    allPossibleUShortParams = [1u, 2u],
    allPossibleUIntParams = [1u, 2u],
    allPossibleULongParams = [1u, 2u, 45u],
)
data class MixedSampleDataClass(
    val property1: Boolean,
    val property2: Boolean,
    val property3: String,
    val property4: Double,
    val property5: UInt,
    val property6: UShort,
    val property7: UShort,
    val property8: Boolean,
    val property9: Int,
    val property10: Char,
)

@Kombine(
    allPossibleStringParams = ["abc", "cde"],
    allPossibleIntParams = [1],
    allPossibleFloatParams = [1f, 2f, 3f],
    allPossibleDoubleParams = [1.0, 2.0],
    allPossibleLongParams = [1, 2],
    allPossibleByteParams = [1, 2],
    allPossibleCharParams = ['1', '2', '3'],
    allPossibleShortParams = [1, 2],
    allPossibleUByteParams = [1u, 2u],
    allPossibleUShortParams = [1u, 2u],
    allPossibleUIntParams = [1u, 2u],
    allPossibleULongParams = [1u, 2u, 45u],
)
data class MixedSampleDataClassSomeParamsAnnotated(
    val property1: Boolean,
    @Kombine val property2: Boolean,
    val property3: String,
    @Kombine(allPossibleDoubleParams = [5.0, 110.0]) val property4: Double,
    val property5: UInt,
    @Kombine(allPossibleUShortParams = [3u, 5u]) val property6: UShort,
    val property7: UShort,
    val property8: Boolean,
    val property9: Int,
    @Kombine(allPossibleCharParams = ['5']) val property10: Char,
)
