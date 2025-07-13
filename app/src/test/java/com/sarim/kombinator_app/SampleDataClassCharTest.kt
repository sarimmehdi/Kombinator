package com.sarim.kombinator_app

import com.google.common.truth.Truth.assertThat
import com.sarim.kombinator_app.sample.SampleDataClass1CharWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass1CharWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1CharWithCharParams
import com.sarim.kombinator_app.sample.SampleDataClass1CharWithCharParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1CharWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass1CharWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2CharsWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass2CharsWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2CharsWithCharParams
import com.sarim.kombinator_app.sample.SampleDataClass2CharsWithCharParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2CharsWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass2CharsWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3CharsWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass3CharsWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3CharsWithCharParams
import com.sarim.kombinator_app.sample.SampleDataClass3CharsWithCharParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3CharsWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass3CharsWithSomeParamsCombinations
import org.junit.Test

class SampleDataClassCharTest {
    @Test
    fun testSampleDataClass1CharWithCharParamsCombinations() {
        assertThat(SampleDataClass1CharWithCharParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1CharWithCharParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1CharWithCharParams(
                        property1 = '1',
                    ),
                    SampleDataClass1CharWithCharParams(
                        property1 = '2',
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2CharsWithCharParamsCombinations() {
        assertThat(SampleDataClass2CharsWithCharParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2CharsWithCharParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2CharsWithCharParams(
                        property1 = '1',
                        property2 = '1',
                    ),
                    SampleDataClass2CharsWithCharParams(
                        property1 = '1',
                        property2 = '2',
                    ),
                    SampleDataClass2CharsWithCharParams(
                        property1 = '2',
                        property2 = '1',
                    ),
                    SampleDataClass2CharsWithCharParams(
                        property1 = '2',
                        property2 = '2',
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3CharsWithCharParamsCombinations() {
        assertThat(SampleDataClass3CharsWithCharParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3CharsWithCharParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3CharsWithCharParams(
                        property1 = '1',
                        property2 = '1',
                        property3 = '1',
                    ),
                    SampleDataClass3CharsWithCharParams(
                        property1 = '1',
                        property2 = '1',
                        property3 = '2',
                    ),
                    SampleDataClass3CharsWithCharParams(
                        property1 = '1',
                        property2 = '2',
                        property3 = '1',
                    ),
                    SampleDataClass3CharsWithCharParams(
                        property1 = '1',
                        property2 = '2',
                        property3 = '2',
                    ),
                    SampleDataClass3CharsWithCharParams(
                        property1 = '2',
                        property2 = '1',
                        property3 = '1',
                    ),
                    SampleDataClass3CharsWithCharParams(
                        property1 = '2',
                        property2 = '1',
                        property3 = '2',
                    ),
                    SampleDataClass3CharsWithCharParams(
                        property1 = '2',
                        property2 = '2',
                        property3 = '1',
                    ),
                    SampleDataClass3CharsWithCharParams(
                        property1 = '2',
                        property2 = '2',
                        property3 = '2',
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1CharWithAllParamsCombinations() {
        assertThat(SampleDataClass1CharWithAllParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1CharWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1CharWithAllParams(
                        property1 = '1',
                    ),
                    SampleDataClass1CharWithAllParams(
                        property1 = '2',
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2CharsWithAllParamsCombinations() {
        assertThat(SampleDataClass2CharsWithAllParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2CharsWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2CharsWithAllParams(
                        property1 = '1',
                        property2 = '1',
                    ),
                    SampleDataClass2CharsWithAllParams(
                        property1 = '1',
                        property2 = '2',
                    ),
                    SampleDataClass2CharsWithAllParams(
                        property1 = '2',
                        property2 = '1',
                    ),
                    SampleDataClass2CharsWithAllParams(
                        property1 = '2',
                        property2 = '2',
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3CharsWithAllParamsCombinations() {
        assertThat(SampleDataClass3CharsWithAllParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3CharsWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3CharsWithAllParams(
                        property1 = '1',
                        property2 = '1',
                        property3 = '1',
                    ),
                    SampleDataClass3CharsWithAllParams(
                        property1 = '1',
                        property2 = '1',
                        property3 = '2',
                    ),
                    SampleDataClass3CharsWithAllParams(
                        property1 = '1',
                        property2 = '2',
                        property3 = '1',
                    ),
                    SampleDataClass3CharsWithAllParams(
                        property1 = '1',
                        property2 = '2',
                        property3 = '2',
                    ),
                    SampleDataClass3CharsWithAllParams(
                        property1 = '2',
                        property2 = '1',
                        property3 = '1',
                    ),
                    SampleDataClass3CharsWithAllParams(
                        property1 = '2',
                        property2 = '1',
                        property3 = '2',
                    ),
                    SampleDataClass3CharsWithAllParams(
                        property1 = '2',
                        property2 = '2',
                        property3 = '1',
                    ),
                    SampleDataClass3CharsWithAllParams(
                        property1 = '2',
                        property2 = '2',
                        property3 = '2',
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1CharWithSomeParamsCombinations() {
        assertThat(SampleDataClass1CharWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1CharWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1CharWithSomeParams(
                        property1 = '1',
                    ),
                    SampleDataClass1CharWithSomeParams(
                        property1 = '2',
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2CharsWithSomeParamsCombinations() {
        assertThat(SampleDataClass2CharsWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2CharsWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2CharsWithSomeParams(
                        property1 = '1',
                        property2 = '1',
                    ),
                    SampleDataClass2CharsWithSomeParams(
                        property1 = '1',
                        property2 = '2',
                    ),
                    SampleDataClass2CharsWithSomeParams(
                        property1 = '2',
                        property2 = '1',
                    ),
                    SampleDataClass2CharsWithSomeParams(
                        property1 = '2',
                        property2 = '2',
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3CharsWithSomeParamsCombinations() {
        assertThat(SampleDataClass3CharsWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3CharsWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3CharsWithSomeParams(
                        property1 = '1',
                        property2 = '1',
                        property3 = '1',
                    ),
                    SampleDataClass3CharsWithSomeParams(
                        property1 = '1',
                        property2 = '1',
                        property3 = '2',
                    ),
                    SampleDataClass3CharsWithSomeParams(
                        property1 = '1',
                        property2 = '2',
                        property3 = '1',
                    ),
                    SampleDataClass3CharsWithSomeParams(
                        property1 = '1',
                        property2 = '2',
                        property3 = '2',
                    ),
                    SampleDataClass3CharsWithSomeParams(
                        property1 = '2',
                        property2 = '1',
                        property3 = '1',
                    ),
                    SampleDataClass3CharsWithSomeParams(
                        property1 = '2',
                        property2 = '1',
                        property3 = '2',
                    ),
                    SampleDataClass3CharsWithSomeParams(
                        property1 = '2',
                        property2 = '2',
                        property3 = '1',
                    ),
                    SampleDataClass3CharsWithSomeParams(
                        property1 = '2',
                        property2 = '2',
                        property3 = '2',
                    ),
                ),
            ),
        ).isEqualTo(true)
    }
}
