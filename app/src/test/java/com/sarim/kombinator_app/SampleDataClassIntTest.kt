package com.sarim.kombinator_app

import com.google.common.truth.Truth.assertThat
import com.sarim.kombinator_app.sample.SampleDataClass1IntWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass1IntWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1IntWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass1IntWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1IntWithIntParams
import com.sarim.kombinator_app.sample.SampleDataClass1IntWithIntParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2IntsWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass2IntsWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2IntsWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass2IntsWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2IntsWithIntParams
import com.sarim.kombinator_app.sample.SampleDataClass2IntsWithIntParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3IntsWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass3IntsWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3IntsWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass3IntsWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3IntsWithIntParams
import com.sarim.kombinator_app.sample.SampleDataClass3IntsWithIntParamsCombinations
import org.junit.Test

class SampleDataClassIntTest {

    @Test
    fun testSampleDataClass1IntWithIntParamsCombinations() {
        assertThat(SampleDataClass1IntWithIntParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1IntWithIntParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1IntWithIntParams(
                        property1 = 1,
                    ),
                    SampleDataClass1IntWithIntParams(
                        property1 = 2,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2IntsWithIntParamsCombinations() {
        assertThat(SampleDataClass2IntsWithIntParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2IntsWithIntParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2IntsWithIntParams(
                        property1 = 1,
                        property2 = 1,
                    ),
                    SampleDataClass2IntsWithIntParams(
                        property1 = 1,
                        property2 = 2,
                    ),
                    SampleDataClass2IntsWithIntParams(
                        property1 = 2,
                        property2 = 1,
                    ),
                    SampleDataClass2IntsWithIntParams(
                        property1 = 2,
                        property2 = 2,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3IntsWithIntParamsCombinations() {
        assertThat(SampleDataClass3IntsWithIntParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3IntsWithIntParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3IntsWithIntParams(
                        property1 = 1,
                        property2 = 1,
                        property3 = 1,
                    ),
                    SampleDataClass3IntsWithIntParams(
                        property1 = 1,
                        property2 = 1,
                        property3 = 2,
                    ),
                    SampleDataClass3IntsWithIntParams(
                        property1 = 1,
                        property2 = 2,
                        property3 = 1,
                    ),
                    SampleDataClass3IntsWithIntParams(
                        property1 = 1,
                        property2 = 2,
                        property3 = 2,
                    ),
                    SampleDataClass3IntsWithIntParams(
                        property1 = 2,
                        property2 = 1,
                        property3 = 1,
                    ),
                    SampleDataClass3IntsWithIntParams(
                        property1 = 2,
                        property2 = 1,
                        property3 = 2,
                    ),
                    SampleDataClass3IntsWithIntParams(
                        property1 = 2,
                        property2 = 2,
                        property3 = 1,
                    ),
                    SampleDataClass3IntsWithIntParams(
                        property1 = 2,
                        property2 = 2,
                        property3 = 2,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1IntWithAllParamsCombinations() {
        assertThat(SampleDataClass1IntWithAllParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1IntWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1IntWithAllParams(
                        property1 = 1,
                    ),
                    SampleDataClass1IntWithAllParams(
                        property1 = 2,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2IntsWithAllParamsCombinations() {
        assertThat(SampleDataClass2IntsWithAllParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2IntsWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2IntsWithAllParams(
                        property1 = 1,
                        property2 = 1,
                    ),
                    SampleDataClass2IntsWithAllParams(
                        property1 = 1,
                        property2 = 2,
                    ),
                    SampleDataClass2IntsWithAllParams(
                        property1 = 2,
                        property2 = 1,
                    ),
                    SampleDataClass2IntsWithAllParams(
                        property1 = 2,
                        property2 = 2,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3IntsWithAllParamsCombinations() {
        assertThat(SampleDataClass3IntsWithAllParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3IntsWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3IntsWithAllParams(
                        property1 = 1,
                        property2 = 1,
                        property3 = 1,
                    ),
                    SampleDataClass3IntsWithAllParams(
                        property1 = 1,
                        property2 = 1,
                        property3 = 2,
                    ),
                    SampleDataClass3IntsWithAllParams(
                        property1 = 1,
                        property2 = 2,
                        property3 = 1,
                    ),
                    SampleDataClass3IntsWithAllParams(
                        property1 = 1,
                        property2 = 2,
                        property3 = 2,
                    ),
                    SampleDataClass3IntsWithAllParams(
                        property1 = 2,
                        property2 = 1,
                        property3 = 1,
                    ),
                    SampleDataClass3IntsWithAllParams(
                        property1 = 2,
                        property2 = 1,
                        property3 = 2,
                    ),
                    SampleDataClass3IntsWithAllParams(
                        property1 = 2,
                        property2 = 2,
                        property3 = 1,
                    ),
                    SampleDataClass3IntsWithAllParams(
                        property1 = 2,
                        property2 = 2,
                        property3 = 2,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1IntWithSomeParamsCombinations() {
        assertThat(SampleDataClass1IntWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1IntWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1IntWithSomeParams(
                        property1 = 1,
                    ),
                    SampleDataClass1IntWithSomeParams(
                        property1 = 2,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2IntsWithSomeParamsCombinations() {
        assertThat(SampleDataClass2IntsWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2IntsWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2IntsWithSomeParams(
                        property1 = 1,
                        property2 = 1,
                    ),
                    SampleDataClass2IntsWithSomeParams(
                        property1 = 1,
                        property2 = 2,
                    ),
                    SampleDataClass2IntsWithSomeParams(
                        property1 = 2,
                        property2 = 1,
                    ),
                    SampleDataClass2IntsWithSomeParams(
                        property1 = 2,
                        property2 = 2,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3IntsWithSomeParamsCombinations() {
        assertThat(SampleDataClass3IntsWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3IntsWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3IntsWithSomeParams(
                        property1 = 1,
                        property2 = 1,
                        property3 = 1,
                    ),
                    SampleDataClass3IntsWithSomeParams(
                        property1 = 1,
                        property2 = 1,
                        property3 = 2,
                    ),
                    SampleDataClass3IntsWithSomeParams(
                        property1 = 1,
                        property2 = 2,
                        property3 = 1,
                    ),
                    SampleDataClass3IntsWithSomeParams(
                        property1 = 1,
                        property2 = 2,
                        property3 = 2,
                    ),
                    SampleDataClass3IntsWithSomeParams(
                        property1 = 2,
                        property2 = 1,
                        property3 = 1,
                    ),
                    SampleDataClass3IntsWithSomeParams(
                        property1 = 2,
                        property2 = 1,
                        property3 = 2,
                    ),
                    SampleDataClass3IntsWithSomeParams(
                        property1 = 2,
                        property2 = 2,
                        property3 = 1,
                    ),
                    SampleDataClass3IntsWithSomeParams(
                        property1 = 2,
                        property2 = 2,
                        property3 = 2,
                    ),
                )
            )
        ).isEqualTo(true)
    }
}