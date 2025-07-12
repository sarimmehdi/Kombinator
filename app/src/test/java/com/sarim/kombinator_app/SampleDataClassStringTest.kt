package com.sarim.kombinator_app

import com.google.common.truth.Truth.assertThat
import com.sarim.kombinator_app.sample.SampleDataClass1StringWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass1StringWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1StringWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass1StringWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1StringWithStringParams
import com.sarim.kombinator_app.sample.SampleDataClass1StringWithStringParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2StringsWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass2StringsWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2StringsWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass2StringsWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2StringsWithStringParams
import com.sarim.kombinator_app.sample.SampleDataClass2StringsWithStringParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3StringsWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass3StringsWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3StringsWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass3StringsWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3StringsWithStringParams
import com.sarim.kombinator_app.sample.SampleDataClass3StringsWithStringParamsCombinations
import org.junit.Test

class SampleDataClassStringTest {

    @Test
    fun testSampleDataClass1StringWithStringParamsCombinations() {
        assertThat(SampleDataClass1StringWithStringParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1StringWithStringParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1StringWithStringParams(
                        property1 = "abc",
                    ),
                    SampleDataClass1StringWithStringParams(
                        property1 = "cde",
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2StringsWithStringParamsCombinations() {
        assertThat(SampleDataClass2StringsWithStringParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2StringsWithStringParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2StringsWithStringParams(
                        property1 = "abc",
                        property2 = "abc",
                    ),
                    SampleDataClass2StringsWithStringParams(
                        property1 = "abc",
                        property2 = "cde",
                    ),
                    SampleDataClass2StringsWithStringParams(
                        property1 = "cde",
                        property2 = "abc",
                    ),
                    SampleDataClass2StringsWithStringParams(
                        property1 = "cde",
                        property2 = "cde",
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3StringsWithStringParamsCombinations() {
        assertThat(SampleDataClass3StringsWithStringParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3StringsWithStringParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3StringsWithStringParams(
                        property1 = "abc",
                        property2 = "abc",
                        property3 = "abc",
                    ),
                    SampleDataClass3StringsWithStringParams(
                        property1 = "abc",
                        property2 = "abc",
                        property3 = "cde",
                    ),
                    SampleDataClass3StringsWithStringParams(
                        property1 = "abc",
                        property2 = "cde",
                        property3 = "abc",
                    ),
                    SampleDataClass3StringsWithStringParams(
                        property1 = "abc",
                        property2 = "cde",
                        property3 = "cde",
                    ),
                    SampleDataClass3StringsWithStringParams(
                        property1 = "cde",
                        property2 = "abc",
                        property3 = "abc",
                    ),
                    SampleDataClass3StringsWithStringParams(
                        property1 = "cde",
                        property2 = "abc",
                        property3 = "cde",
                    ),
                    SampleDataClass3StringsWithStringParams(
                        property1 = "cde",
                        property2 = "cde",
                        property3 = "abc",
                    ),
                    SampleDataClass3StringsWithStringParams(
                        property1 = "cde",
                        property2 = "cde",
                        property3 = "cde",
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1StringWithAllParamsCombinations() {
        assertThat(SampleDataClass1StringWithAllParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1StringWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1StringWithAllParams(
                        property1 = "abc",
                    ),
                    SampleDataClass1StringWithAllParams(
                        property1 = "cde",
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2StringsWithAllParamsCombinations() {
        assertThat(SampleDataClass2StringsWithAllParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2StringsWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2StringsWithAllParams(
                        property1 = "abc",
                        property2 = "abc",
                    ),
                    SampleDataClass2StringsWithAllParams(
                        property1 = "abc",
                        property2 = "cde",
                    ),
                    SampleDataClass2StringsWithAllParams(
                        property1 = "cde",
                        property2 = "abc",
                    ),
                    SampleDataClass2StringsWithAllParams(
                        property1 = "cde",
                        property2 = "cde",
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3StringsWithAllParamsCombinations() {
        assertThat(SampleDataClass3StringsWithAllParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3StringsWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3StringsWithAllParams(
                        property1 = "abc",
                        property2 = "abc",
                        property3 = "abc",
                    ),
                    SampleDataClass3StringsWithAllParams(
                        property1 = "abc",
                        property2 = "abc",
                        property3 = "cde",
                    ),
                    SampleDataClass3StringsWithAllParams(
                        property1 = "abc",
                        property2 = "cde",
                        property3 = "abc",
                    ),
                    SampleDataClass3StringsWithAllParams(
                        property1 = "abc",
                        property2 = "cde",
                        property3 = "cde",
                    ),
                    SampleDataClass3StringsWithAllParams(
                        property1 = "cde",
                        property2 = "abc",
                        property3 = "abc",
                    ),
                    SampleDataClass3StringsWithAllParams(
                        property1 = "cde",
                        property2 = "abc",
                        property3 = "cde",
                    ),
                    SampleDataClass3StringsWithAllParams(
                        property1 = "cde",
                        property2 = "cde",
                        property3 = "abc",
                    ),
                    SampleDataClass3StringsWithAllParams(
                        property1 = "cde",
                        property2 = "cde",
                        property3 = "cde",
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1StringWithSomeParamsCombinations() {
        assertThat(SampleDataClass1StringWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1StringWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1StringWithSomeParams(
                        property1 = "abc",
                    ),
                    SampleDataClass1StringWithSomeParams(
                        property1 = "cde",
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2StringsWithSomeParamsCombinations() {
        assertThat(SampleDataClass2StringsWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2StringsWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2StringsWithSomeParams(
                        property1 = "abc",
                        property2 = "abc",
                    ),
                    SampleDataClass2StringsWithSomeParams(
                        property1 = "abc",
                        property2 = "cde",
                    ),
                    SampleDataClass2StringsWithSomeParams(
                        property1 = "cde",
                        property2 = "abc",
                    ),
                    SampleDataClass2StringsWithSomeParams(
                        property1 = "cde",
                        property2 = "cde",
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3StringsWithSomeParamsCombinations() {
        assertThat(SampleDataClass3StringsWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3StringsWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3StringsWithSomeParams(
                        property1 = "abc",
                        property2 = "abc",
                        property3 = "abc",
                    ),
                    SampleDataClass3StringsWithSomeParams(
                        property1 = "abc",
                        property2 = "abc",
                        property3 = "cde",
                    ),
                    SampleDataClass3StringsWithSomeParams(
                        property1 = "abc",
                        property2 = "cde",
                        property3 = "abc",
                    ),
                    SampleDataClass3StringsWithSomeParams(
                        property1 = "abc",
                        property2 = "cde",
                        property3 = "cde",
                    ),
                    SampleDataClass3StringsWithSomeParams(
                        property1 = "cde",
                        property2 = "abc",
                        property3 = "abc",
                    ),
                    SampleDataClass3StringsWithSomeParams(
                        property1 = "cde",
                        property2 = "abc",
                        property3 = "cde",
                    ),
                    SampleDataClass3StringsWithSomeParams(
                        property1 = "cde",
                        property2 = "cde",
                        property3 = "abc",
                    ),
                    SampleDataClass3StringsWithSomeParams(
                        property1 = "cde",
                        property2 = "cde",
                        property3 = "cde",
                    ),
                )
            )
        ).isEqualTo(true)
    }
}