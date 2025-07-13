package com.sarim.kombinator_app

import com.google.common.truth.Truth.assertThat
import com.sarim.kombinator_app.sample.SampleDataClass1DoubleWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass1DoubleWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1DoubleWithDoubleParams
import com.sarim.kombinator_app.sample.SampleDataClass1DoubleWithDoubleParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1DoubleWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass1DoubleWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2DoublesWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass2DoublesWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2DoublesWithDoubleParams
import com.sarim.kombinator_app.sample.SampleDataClass2DoublesWithDoubleParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2DoublesWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass2DoublesWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3DoublesWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass3DoublesWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3DoublesWithDoubleParams
import com.sarim.kombinator_app.sample.SampleDataClass3DoublesWithDoubleParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3DoublesWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass3DoublesWithSomeParamsCombinations
import org.junit.Test

class SampleDataClassDoubleTest {
    @Test
    fun testSampleDataClass1DoubleWithDoubleParamsCombinations() {
        assertThat(SampleDataClass1DoubleWithDoubleParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1DoubleWithDoubleParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1DoubleWithDoubleParams(
                        property1 = 1.0,
                    ),
                    SampleDataClass1DoubleWithDoubleParams(
                        property1 = 2.0,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2DoublesWithDoubleParamsCombinations() {
        assertThat(SampleDataClass2DoublesWithDoubleParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2DoublesWithDoubleParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2DoublesWithDoubleParams(
                        property1 = 1.0,
                        property2 = 1.0,
                    ),
                    SampleDataClass2DoublesWithDoubleParams(
                        property1 = 1.0,
                        property2 = 2.0,
                    ),
                    SampleDataClass2DoublesWithDoubleParams(
                        property1 = 2.0,
                        property2 = 1.0,
                    ),
                    SampleDataClass2DoublesWithDoubleParams(
                        property1 = 2.0,
                        property2 = 2.0,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3DoublesWithDoubleParamsCombinations() {
        assertThat(SampleDataClass3DoublesWithDoubleParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3DoublesWithDoubleParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3DoublesWithDoubleParams(
                        property1 = 1.0,
                        property2 = 1.0,
                        property3 = 1.0,
                    ),
                    SampleDataClass3DoublesWithDoubleParams(
                        property1 = 1.0,
                        property2 = 1.0,
                        property3 = 2.0,
                    ),
                    SampleDataClass3DoublesWithDoubleParams(
                        property1 = 1.0,
                        property2 = 2.0,
                        property3 = 1.0,
                    ),
                    SampleDataClass3DoublesWithDoubleParams(
                        property1 = 1.0,
                        property2 = 2.0,
                        property3 = 2.0,
                    ),
                    SampleDataClass3DoublesWithDoubleParams(
                        property1 = 2.0,
                        property2 = 1.0,
                        property3 = 1.0,
                    ),
                    SampleDataClass3DoublesWithDoubleParams(
                        property1 = 2.0,
                        property2 = 1.0,
                        property3 = 2.0,
                    ),
                    SampleDataClass3DoublesWithDoubleParams(
                        property1 = 2.0,
                        property2 = 2.0,
                        property3 = 1.0,
                    ),
                    SampleDataClass3DoublesWithDoubleParams(
                        property1 = 2.0,
                        property2 = 2.0,
                        property3 = 2.0,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1DoubleWithAllParamsCombinations() {
        assertThat(SampleDataClass1DoubleWithAllParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1DoubleWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1DoubleWithAllParams(
                        property1 = 1.0,
                    ),
                    SampleDataClass1DoubleWithAllParams(
                        property1 = 2.0,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2DoublesWithAllParamsCombinations() {
        assertThat(SampleDataClass2DoublesWithAllParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2DoublesWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2DoublesWithAllParams(
                        property1 = 1.0,
                        property2 = 1.0,
                    ),
                    SampleDataClass2DoublesWithAllParams(
                        property1 = 1.0,
                        property2 = 2.0,
                    ),
                    SampleDataClass2DoublesWithAllParams(
                        property1 = 2.0,
                        property2 = 1.0,
                    ),
                    SampleDataClass2DoublesWithAllParams(
                        property1 = 2.0,
                        property2 = 2.0,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3DoublesWithAllParamsCombinations() {
        assertThat(SampleDataClass3DoublesWithAllParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3DoublesWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3DoublesWithAllParams(
                        property1 = 1.0,
                        property2 = 1.0,
                        property3 = 1.0,
                    ),
                    SampleDataClass3DoublesWithAllParams(
                        property1 = 1.0,
                        property2 = 1.0,
                        property3 = 2.0,
                    ),
                    SampleDataClass3DoublesWithAllParams(
                        property1 = 1.0,
                        property2 = 2.0,
                        property3 = 1.0,
                    ),
                    SampleDataClass3DoublesWithAllParams(
                        property1 = 1.0,
                        property2 = 2.0,
                        property3 = 2.0,
                    ),
                    SampleDataClass3DoublesWithAllParams(
                        property1 = 2.0,
                        property2 = 1.0,
                        property3 = 1.0,
                    ),
                    SampleDataClass3DoublesWithAllParams(
                        property1 = 2.0,
                        property2 = 1.0,
                        property3 = 2.0,
                    ),
                    SampleDataClass3DoublesWithAllParams(
                        property1 = 2.0,
                        property2 = 2.0,
                        property3 = 1.0,
                    ),
                    SampleDataClass3DoublesWithAllParams(
                        property1 = 2.0,
                        property2 = 2.0,
                        property3 = 2.0,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1DoubleWithSomeParamsCombinations() {
        assertThat(SampleDataClass1DoubleWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1DoubleWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1DoubleWithSomeParams(
                        property1 = 1.0,
                    ),
                    SampleDataClass1DoubleWithSomeParams(
                        property1 = 2.0,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2DoublesWithSomeParamsCombinations() {
        assertThat(SampleDataClass2DoublesWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2DoublesWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2DoublesWithSomeParams(
                        property1 = 1.0,
                        property2 = 1.0,
                    ),
                    SampleDataClass2DoublesWithSomeParams(
                        property1 = 1.0,
                        property2 = 2.0,
                    ),
                    SampleDataClass2DoublesWithSomeParams(
                        property1 = 2.0,
                        property2 = 1.0,
                    ),
                    SampleDataClass2DoublesWithSomeParams(
                        property1 = 2.0,
                        property2 = 2.0,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3DoublesWithSomeParamsCombinations() {
        assertThat(SampleDataClass3DoublesWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3DoublesWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3DoublesWithSomeParams(
                        property1 = 1.0,
                        property2 = 1.0,
                        property3 = 1.0,
                    ),
                    SampleDataClass3DoublesWithSomeParams(
                        property1 = 1.0,
                        property2 = 1.0,
                        property3 = 2.0,
                    ),
                    SampleDataClass3DoublesWithSomeParams(
                        property1 = 1.0,
                        property2 = 2.0,
                        property3 = 1.0,
                    ),
                    SampleDataClass3DoublesWithSomeParams(
                        property1 = 1.0,
                        property2 = 2.0,
                        property3 = 2.0,
                    ),
                    SampleDataClass3DoublesWithSomeParams(
                        property1 = 2.0,
                        property2 = 1.0,
                        property3 = 1.0,
                    ),
                    SampleDataClass3DoublesWithSomeParams(
                        property1 = 2.0,
                        property2 = 1.0,
                        property3 = 2.0,
                    ),
                    SampleDataClass3DoublesWithSomeParams(
                        property1 = 2.0,
                        property2 = 2.0,
                        property3 = 1.0,
                    ),
                    SampleDataClass3DoublesWithSomeParams(
                        property1 = 2.0,
                        property2 = 2.0,
                        property3 = 2.0,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }
}
