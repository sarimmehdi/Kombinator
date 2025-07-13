package com.sarim.kombinator_app

import com.google.common.truth.Truth.assertThat
import com.sarim.kombinator_app.sample.MixedSampleDataClassCombinations
import com.sarim.kombinator_app.sample.MixedSampleDataClassSomeParamsAnnotatedCombinations
import org.junit.Test

class MixedSampleDataClassTest {

    @Test
    fun testMixedSampleDataClassCombinations() {
        val allItemsAsList = MixedSampleDataClassCombinations.getAllCombinations()
        val allItemsAsSet = MixedSampleDataClassCombinations.getAllCombinations().toSet()
        assertThat(allItemsAsList.size).isEqualTo(allItemsAsSet.size)
    }

    @Test
    fun testMixedSampleDataClassSomeParamsAnnotatedCombinations() {
        val allItemsAsList = MixedSampleDataClassSomeParamsAnnotatedCombinations.getAllCombinations()
        val allItemsAsSet = MixedSampleDataClassSomeParamsAnnotatedCombinations.getAllCombinations().toSet()
        assertThat(allItemsAsList.size).isEqualTo(allItemsAsSet.size)
        assertThat(
            allItemsAsList.filter {
                it.property4 == 1.0 || it.property4 == 2.0
                        || it.property6 == 1u.toUShort() || it.property6 == 2u.toUShort()
            }.size
        ).isEqualTo(0)
        assertThat(
            allItemsAsList.filter {
                it.property10 == '5'
            }.size
        ).isEqualTo(allItemsAsList.size)
    }
}