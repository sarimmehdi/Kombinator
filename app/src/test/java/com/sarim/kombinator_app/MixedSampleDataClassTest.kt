package com.sarim.kombinator_app

import com.google.common.truth.Truth.assertThat
import com.sarim.kombinator_app.sample.MixedSampleDataClassAllParamsAnnotatedCombinations
import com.sarim.kombinator_app.sample.MixedSampleDataClassAllParamsAnnotatedSomeParamsWithDefaultValueCombinations
import com.sarim.kombinator_app.sample.MixedSampleDataClassCombinations
import com.sarim.kombinator_app.sample.MixedSampleDataClassSomeParamsAnnotatedCombinations
import com.sarim.kombinator_app.sample.MixedSampleDataClassWithEnumsSomeParamsAnnotatedCombinations
import com.sarim.kombinator_app.sample.SampleEnum1
import com.sarim.kombinator_app.sample.SampleEnum2
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
            allItemsAsList
                .filter {
                    it.property4 == 1.0 ||
                        it.property4 == 2.0 ||
                        it.property6 == 1u.toUShort() ||
                        it.property6 == 2u.toUShort()
                }.size,
        ).isEqualTo(0)
        assertThat(
            allItemsAsList
                .filter {
                    it.property10 == '5'
                }.size,
        ).isEqualTo(allItemsAsList.size)
    }

    @Test
    fun testMixedSampleDataClassWithEnumsSomeParamsAnnotatedCombinations() {
        val allItemsAsList = MixedSampleDataClassWithEnumsSomeParamsAnnotatedCombinations.getAllCombinations()
        val allItemsAsSet = MixedSampleDataClassWithEnumsSomeParamsAnnotatedCombinations.getAllCombinations().toSet()
        assertThat(allItemsAsList.size).isEqualTo(allItemsAsSet.size)
        assertThat(
            allItemsAsList
                .filter {
                    it.property4 == 1.0 ||
                        it.property4 == 2.0 ||
                        it.property6 == 1u.toUShort() ||
                        it.property6 == 2u.toUShort()
                }.size,
        ).isEqualTo(0)
        assertThat(
            allItemsAsList
                .filter {
                    it.property10 == '5'
                }.size,
        ).isEqualTo(allItemsAsList.size)
        assertThat(
            allItemsAsList
                .filter {
                    it.property11 == SampleEnum1.TYPE_1
                }.size,
        ).isEqualTo(allItemsAsList.size)
        assertThat(
            allItemsAsList
                .filter {
                    it.property12 == SampleEnum2.TYPE_1
                }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList
                .filter {
                    it.property12 == SampleEnum2.TYPE_2
                }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList
                .filter {
                    it.property12 == SampleEnum2.TYPE_3
                }.size,
        ).isIn(0 until allItemsAsList.size)
    }

    @Suppress("LongMethod")
    @Test
    fun testMixedSampleDataClassAllParamsAnnotatedCombinations() {
        val allItemsAsList =
            MixedSampleDataClassAllParamsAnnotatedCombinations.getAllCombinations()
        val allItemsAsSet = MixedSampleDataClassAllParamsAnnotatedCombinations.getAllCombinations().toSet()
        assertThat(allItemsAsList.size).isEqualTo(allItemsAsSet.size)
        assertThat(
            allItemsAsList.filter { it.property1 }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { !it.property1 }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property2 }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { !it.property2 }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property8 }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { !it.property8 }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property3 == "abc" }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property3 == "cde" }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property10 == '5' }.size,
        ).isEqualTo(allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property9 == 1 }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property9 == 2 }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property9 == 3 }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property4 == 5.0 }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property4 == 110.0 }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property5 == 1u }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property5 == 2u }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property6 == 3u.toUShort() }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property6 == 5u.toUShort() }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property7 == 1u.toUShort() }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property7 == 2u.toUShort() }.size,
        ).isIn(0 until allItemsAsList.size)
    }

    @Test
    fun testMixedSampleDataClassAllParamsAnnotatedSomeParamsWithDefaultValueCombinations() {
        val allItemsAsList =
            MixedSampleDataClassAllParamsAnnotatedSomeParamsWithDefaultValueCombinations.getAllCombinations()
        val allItemsAsSet =
            MixedSampleDataClassAllParamsAnnotatedSomeParamsWithDefaultValueCombinations.getAllCombinations().toSet()
        assertThat(allItemsAsList.size).isEqualTo(allItemsAsSet.size)
        assertThat(
            allItemsAsList.filter { !it.property1 }.size,
        ).isEqualTo(allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property2 }.size,
        ).isEqualTo(allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { !it.property2 }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property8 }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { !it.property8 }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property3 == "abc" }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property3 == "cde" }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property10 == '5' }.size,
        ).isEqualTo(allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property9 == 3 }.size,
        ).isEqualTo(allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property4 == 5.0 }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property4 == 110.0 }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property5 == 2u }.size,
        ).isEqualTo(allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property6 == 3u.toUShort() }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property6 == 5u.toUShort() }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property7 == 1u.toUShort() }.size,
        ).isIn(0 until allItemsAsList.size)
        assertThat(
            allItemsAsList.filter { it.property7 == 2u.toUShort() }.size,
        ).isIn(0 until allItemsAsList.size)
    }
}
