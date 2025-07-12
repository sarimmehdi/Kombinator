package com.sarim.kombinator_app

import com.google.common.truth.Truth.assertThat
import com.sarim.kombinator_app.sample.SampleDataClass1ShortWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass1ShortWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1ShortWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass1ShortWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1ShortWithShortParams
import com.sarim.kombinator_app.sample.SampleDataClass1ShortWithShortParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2ShortsWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass2ShortsWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2ShortsWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass2ShortsWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2ShortsWithShortParams
import com.sarim.kombinator_app.sample.SampleDataClass2ShortsWithShortParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3ShortsWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass3ShortsWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3ShortsWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass3ShortsWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3ShortsWithShortParams
import com.sarim.kombinator_app.sample.SampleDataClass3ShortsWithShortParamsCombinations
import org.junit.Test

class SampleDataClassShortTest {

    @Test
    fun testSampleDataClass1ShortWithShortParamsCombinations() {
        assertThat(SampleDataClass1ShortWithShortParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1ShortWithShortParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1ShortWithShortParams(
                        property1 = 1,
                    ),
                    SampleDataClass1ShortWithShortParams(
                        property1 = 2,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2ShortsWithShortParamsCombinations() {
        assertThat(SampleDataClass2ShortsWithShortParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2ShortsWithShortParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2ShortsWithShortParams(
                        property1 = 1,
                        property2 = 1,
                    ),
                    SampleDataClass2ShortsWithShortParams(
                        property1 = 1,
                        property2 = 2,
                    ),
                    SampleDataClass2ShortsWithShortParams(
                        property1 = 2,
                        property2 = 1,
                    ),
                    SampleDataClass2ShortsWithShortParams(
                        property1 = 2,
                        property2 = 2,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3ShortsWithShortParamsCombinations() {
        assertThat(SampleDataClass3ShortsWithShortParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3ShortsWithShortParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3ShortsWithShortParams(
                        property1 = 1,
                        property2 = 1,
                        property3 = 1,
                    ),
                    SampleDataClass3ShortsWithShortParams(
                        property1 = 1,
                        property2 = 1,
                        property3 = 2,
                    ),
                    SampleDataClass3ShortsWithShortParams(
                        property1 = 1,
                        property2 = 2,
                        property3 = 1,
                    ),
                    SampleDataClass3ShortsWithShortParams(
                        property1 = 1,
                        property2 = 2,
                        property3 = 2,
                    ),
                    SampleDataClass3ShortsWithShortParams(
                        property1 = 2,
                        property2 = 1,
                        property3 = 1,
                    ),
                    SampleDataClass3ShortsWithShortParams(
                        property1 = 2,
                        property2 = 1,
                        property3 = 2,
                    ),
                    SampleDataClass3ShortsWithShortParams(
                        property1 = 2,
                        property2 = 2,
                        property3 = 1,
                    ),
                    SampleDataClass3ShortsWithShortParams(
                        property1 = 2,
                        property2 = 2,
                        property3 = 2,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1ShortWithAllParamsCombinations() {
        assertThat(SampleDataClass1ShortWithAllParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1ShortWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1ShortWithAllParams(
                        property1 = 1,
                    ),
                    SampleDataClass1ShortWithAllParams(
                        property1 = 2,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2ShortsWithAllParamsCombinations() {
        assertThat(SampleDataClass2ShortsWithAllParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2ShortsWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2ShortsWithAllParams(
                        property1 = 1,
                        property2 = 1,
                    ),
                    SampleDataClass2ShortsWithAllParams(
                        property1 = 1,
                        property2 = 2,
                    ),
                    SampleDataClass2ShortsWithAllParams(
                        property1 = 2,
                        property2 = 1,
                    ),
                    SampleDataClass2ShortsWithAllParams(
                        property1 = 2,
                        property2 = 2,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3ShortsWithAllParamsCombinations() {
        assertThat(SampleDataClass3ShortsWithAllParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3ShortsWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3ShortsWithAllParams(
                        property1 = 1,
                        property2 = 1,
                        property3 = 1,
                    ),
                    SampleDataClass3ShortsWithAllParams(
                        property1 = 1,
                        property2 = 1,
                        property3 = 2,
                    ),
                    SampleDataClass3ShortsWithAllParams(
                        property1 = 1,
                        property2 = 2,
                        property3 = 1,
                    ),
                    SampleDataClass3ShortsWithAllParams(
                        property1 = 1,
                        property2 = 2,
                        property3 = 2,
                    ),
                    SampleDataClass3ShortsWithAllParams(
                        property1 = 2,
                        property2 = 1,
                        property3 = 1,
                    ),
                    SampleDataClass3ShortsWithAllParams(
                        property1 = 2,
                        property2 = 1,
                        property3 = 2,
                    ),
                    SampleDataClass3ShortsWithAllParams(
                        property1 = 2,
                        property2 = 2,
                        property3 = 1,
                    ),
                    SampleDataClass3ShortsWithAllParams(
                        property1 = 2,
                        property2 = 2,
                        property3 = 2,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1ShortWithSomeParamsCombinations() {
        assertThat(SampleDataClass1ShortWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1ShortWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1ShortWithSomeParams(
                        property1 = 1,
                    ),
                    SampleDataClass1ShortWithSomeParams(
                        property1 = 2,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2ShortsWithSomeParamsCombinations() {
        assertThat(SampleDataClass2ShortsWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2ShortsWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2ShortsWithSomeParams(
                        property1 = 1,
                        property2 = 1,
                    ),
                    SampleDataClass2ShortsWithSomeParams(
                        property1 = 1,
                        property2 = 2,
                    ),
                    SampleDataClass2ShortsWithSomeParams(
                        property1 = 2,
                        property2 = 1,
                    ),
                    SampleDataClass2ShortsWithSomeParams(
                        property1 = 2,
                        property2 = 2,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3ShortsWithSomeParamsCombinations() {
        assertThat(SampleDataClass3ShortsWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3ShortsWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3ShortsWithSomeParams(
                        property1 = 1,
                        property2 = 1,
                        property3 = 1,
                    ),
                    SampleDataClass3ShortsWithSomeParams(
                        property1 = 1,
                        property2 = 1,
                        property3 = 2,
                    ),
                    SampleDataClass3ShortsWithSomeParams(
                        property1 = 1,
                        property2 = 2,
                        property3 = 1,
                    ),
                    SampleDataClass3ShortsWithSomeParams(
                        property1 = 1,
                        property2 = 2,
                        property3 = 2,
                    ),
                    SampleDataClass3ShortsWithSomeParams(
                        property1 = 2,
                        property2 = 1,
                        property3 = 1,
                    ),
                    SampleDataClass3ShortsWithSomeParams(
                        property1 = 2,
                        property2 = 1,
                        property3 = 2,
                    ),
                    SampleDataClass3ShortsWithSomeParams(
                        property1 = 2,
                        property2 = 2,
                        property3 = 1,
                    ),
                    SampleDataClass3ShortsWithSomeParams(
                        property1 = 2,
                        property2 = 2,
                        property3 = 2,
                    ),
                )
            )
        ).isEqualTo(true)
    }
}