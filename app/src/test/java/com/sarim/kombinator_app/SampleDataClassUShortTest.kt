package com.sarim.kombinator_app

import com.google.common.truth.Truth.assertThat
import com.sarim.kombinator_app.sample.SampleDataClass1UShortWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass1UShortWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1UShortWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass1UShortWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1UShortWithUShortParams
import com.sarim.kombinator_app.sample.SampleDataClass1UShortWithUShortParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2UShortsWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass2UShortsWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2UShortsWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass2UShortsWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2UShortsWithUShortParams
import com.sarim.kombinator_app.sample.SampleDataClass2UShortsWithUShortParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3UShortsWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass3UShortsWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3UShortsWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass3UShortsWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3UShortsWithUShortParams
import com.sarim.kombinator_app.sample.SampleDataClass3UShortsWithUShortParamsCombinations
import org.junit.Test

class SampleDataClassUShortTest {
    @Test
    fun testSampleDataClass1UShortWithUShortParamsCombinations() {
        assertThat(SampleDataClass1UShortWithUShortParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1UShortWithUShortParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1UShortWithUShortParams(
                        property1 = 1u,
                    ),
                    SampleDataClass1UShortWithUShortParams(
                        property1 = 2u,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2UShortsWithUShortParamsCombinations() {
        assertThat(SampleDataClass2UShortsWithUShortParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2UShortsWithUShortParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2UShortsWithUShortParams(
                        property1 = 1u,
                        property2 = 1u,
                    ),
                    SampleDataClass2UShortsWithUShortParams(
                        property1 = 1u,
                        property2 = 2u,
                    ),
                    SampleDataClass2UShortsWithUShortParams(
                        property1 = 2u,
                        property2 = 1u,
                    ),
                    SampleDataClass2UShortsWithUShortParams(
                        property1 = 2u,
                        property2 = 2u,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3UShortsWithUShortParamsCombinations() {
        assertThat(SampleDataClass3UShortsWithUShortParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3UShortsWithUShortParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3UShortsWithUShortParams(
                        property1 = 1u,
                        property2 = 1u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UShortsWithUShortParams(
                        property1 = 1u,
                        property2 = 1u,
                        property3 = 2u,
                    ),
                    SampleDataClass3UShortsWithUShortParams(
                        property1 = 1u,
                        property2 = 2u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UShortsWithUShortParams(
                        property1 = 1u,
                        property2 = 2u,
                        property3 = 2u,
                    ),
                    SampleDataClass3UShortsWithUShortParams(
                        property1 = 2u,
                        property2 = 1u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UShortsWithUShortParams(
                        property1 = 2u,
                        property2 = 1u,
                        property3 = 2u,
                    ),
                    SampleDataClass3UShortsWithUShortParams(
                        property1 = 2u,
                        property2 = 2u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UShortsWithUShortParams(
                        property1 = 2u,
                        property2 = 2u,
                        property3 = 2u,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1UShortWithAllParamsCombinations() {
        assertThat(SampleDataClass1UShortWithAllParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1UShortWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1UShortWithAllParams(
                        property1 = 1u,
                    ),
                    SampleDataClass1UShortWithAllParams(
                        property1 = 2u,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2UShortsWithAllParamsCombinations() {
        assertThat(SampleDataClass2UShortsWithAllParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2UShortsWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2UShortsWithAllParams(
                        property1 = 1u,
                        property2 = 1u,
                    ),
                    SampleDataClass2UShortsWithAllParams(
                        property1 = 1u,
                        property2 = 2u,
                    ),
                    SampleDataClass2UShortsWithAllParams(
                        property1 = 2u,
                        property2 = 1u,
                    ),
                    SampleDataClass2UShortsWithAllParams(
                        property1 = 2u,
                        property2 = 2u,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3UShortsWithAllParamsCombinations() {
        assertThat(SampleDataClass3UShortsWithAllParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3UShortsWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3UShortsWithAllParams(
                        property1 = 1u,
                        property2 = 1u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UShortsWithAllParams(
                        property1 = 1u,
                        property2 = 1u,
                        property3 = 2u,
                    ),
                    SampleDataClass3UShortsWithAllParams(
                        property1 = 1u,
                        property2 = 2u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UShortsWithAllParams(
                        property1 = 1u,
                        property2 = 2u,
                        property3 = 2u,
                    ),
                    SampleDataClass3UShortsWithAllParams(
                        property1 = 2u,
                        property2 = 1u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UShortsWithAllParams(
                        property1 = 2u,
                        property2 = 1u,
                        property3 = 2u,
                    ),
                    SampleDataClass3UShortsWithAllParams(
                        property1 = 2u,
                        property2 = 2u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UShortsWithAllParams(
                        property1 = 2u,
                        property2 = 2u,
                        property3 = 2u,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1UShortWithSomeParamsCombinations() {
        assertThat(SampleDataClass1UShortWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1UShortWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1UShortWithSomeParams(
                        property1 = 1u,
                    ),
                    SampleDataClass1UShortWithSomeParams(
                        property1 = 2u,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2UShortsWithSomeParamsCombinations() {
        assertThat(SampleDataClass2UShortsWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2UShortsWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2UShortsWithSomeParams(
                        property1 = 1u,
                        property2 = 1u,
                    ),
                    SampleDataClass2UShortsWithSomeParams(
                        property1 = 1u,
                        property2 = 2u,
                    ),
                    SampleDataClass2UShortsWithSomeParams(
                        property1 = 2u,
                        property2 = 1u,
                    ),
                    SampleDataClass2UShortsWithSomeParams(
                        property1 = 2u,
                        property2 = 2u,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3UShortsWithSomeParamsCombinations() {
        assertThat(SampleDataClass3UShortsWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3UShortsWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3UShortsWithSomeParams(
                        property1 = 1u,
                        property2 = 1u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UShortsWithSomeParams(
                        property1 = 1u,
                        property2 = 1u,
                        property3 = 2u,
                    ),
                    SampleDataClass3UShortsWithSomeParams(
                        property1 = 1u,
                        property2 = 2u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UShortsWithSomeParams(
                        property1 = 1u,
                        property2 = 2u,
                        property3 = 2u,
                    ),
                    SampleDataClass3UShortsWithSomeParams(
                        property1 = 2u,
                        property2 = 1u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UShortsWithSomeParams(
                        property1 = 2u,
                        property2 = 1u,
                        property3 = 2u,
                    ),
                    SampleDataClass3UShortsWithSomeParams(
                        property1 = 2u,
                        property2 = 2u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UShortsWithSomeParams(
                        property1 = 2u,
                        property2 = 2u,
                        property3 = 2u,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }
}
