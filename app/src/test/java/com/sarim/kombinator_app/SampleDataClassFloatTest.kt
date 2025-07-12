package com.sarim.kombinator_app

import com.google.common.truth.Truth.assertThat
import com.sarim.kombinator_app.sample.SampleDataClass1FloatWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass1FloatWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1FloatWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass1FloatWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1FloatWithFloatParams
import com.sarim.kombinator_app.sample.SampleDataClass1FloatWithFloatParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2FloatsWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass2FloatsWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2FloatsWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass2FloatsWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2FloatsWithFloatParams
import com.sarim.kombinator_app.sample.SampleDataClass2FloatsWithFloatParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3FloatsWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass3FloatsWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3FloatsWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass3FloatsWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3FloatsWithFloatParams
import com.sarim.kombinator_app.sample.SampleDataClass3FloatsWithFloatParamsCombinations
import org.junit.Test

class SampleDataClassFloatTest {

    @Test
    fun testSampleDataClass1FloatWithFloatParamsCombinations() {
        assertThat(SampleDataClass1FloatWithFloatParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1FloatWithFloatParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1FloatWithFloatParams(
                        property1 = 1f,
                    ),
                    SampleDataClass1FloatWithFloatParams(
                        property1 = 2f,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2FloatsWithFloatParamsCombinations() {
        assertThat(SampleDataClass2FloatsWithFloatParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2FloatsWithFloatParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2FloatsWithFloatParams(
                        property1 = 1f,
                        property2 = 1f,
                    ),
                    SampleDataClass2FloatsWithFloatParams(
                        property1 = 1f,
                        property2 = 2f,
                    ),
                    SampleDataClass2FloatsWithFloatParams(
                        property1 = 2f,
                        property2 = 1f,
                    ),
                    SampleDataClass2FloatsWithFloatParams(
                        property1 = 2f,
                        property2 = 2f,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3FloatsWithFloatParamsCombinations() {
        assertThat(SampleDataClass3FloatsWithFloatParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3FloatsWithFloatParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3FloatsWithFloatParams(
                        property1 = 1f,
                        property2 = 1f,
                        property3 = 1f,
                    ),
                    SampleDataClass3FloatsWithFloatParams(
                        property1 = 1f,
                        property2 = 1f,
                        property3 = 2f,
                    ),
                    SampleDataClass3FloatsWithFloatParams(
                        property1 = 1f,
                        property2 = 2f,
                        property3 = 1f,
                    ),
                    SampleDataClass3FloatsWithFloatParams(
                        property1 = 1f,
                        property2 = 2f,
                        property3 = 2f,
                    ),
                    SampleDataClass3FloatsWithFloatParams(
                        property1 = 2f,
                        property2 = 1f,
                        property3 = 1f,
                    ),
                    SampleDataClass3FloatsWithFloatParams(
                        property1 = 2f,
                        property2 = 1f,
                        property3 = 2f,
                    ),
                    SampleDataClass3FloatsWithFloatParams(
                        property1 = 2f,
                        property2 = 2f,
                        property3 = 1f,
                    ),
                    SampleDataClass3FloatsWithFloatParams(
                        property1 = 2f,
                        property2 = 2f,
                        property3 = 2f,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1FloatWithAllParamsCombinations() {
        assertThat(SampleDataClass1FloatWithAllParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1FloatWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1FloatWithAllParams(
                        property1 = 1f,
                    ),
                    SampleDataClass1FloatWithAllParams(
                        property1 = 2f,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2FloatsWithAllParamsCombinations() {
        assertThat(SampleDataClass2FloatsWithAllParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2FloatsWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2FloatsWithAllParams(
                        property1 = 1f,
                        property2 = 1f,
                    ),
                    SampleDataClass2FloatsWithAllParams(
                        property1 = 1f,
                        property2 = 2f,
                    ),
                    SampleDataClass2FloatsWithAllParams(
                        property1 = 2f,
                        property2 = 1f,
                    ),
                    SampleDataClass2FloatsWithAllParams(
                        property1 = 2f,
                        property2 = 2f,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3FloatsWithAllParamsCombinations() {
        assertThat(SampleDataClass3FloatsWithAllParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3FloatsWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3FloatsWithAllParams(
                        property1 = 1f,
                        property2 = 1f,
                        property3 = 1f,
                    ),
                    SampleDataClass3FloatsWithAllParams(
                        property1 = 1f,
                        property2 = 1f,
                        property3 = 2f,
                    ),
                    SampleDataClass3FloatsWithAllParams(
                        property1 = 1f,
                        property2 = 2f,
                        property3 = 1f,
                    ),
                    SampleDataClass3FloatsWithAllParams(
                        property1 = 1f,
                        property2 = 2f,
                        property3 = 2f,
                    ),
                    SampleDataClass3FloatsWithAllParams(
                        property1 = 2f,
                        property2 = 1f,
                        property3 = 1f,
                    ),
                    SampleDataClass3FloatsWithAllParams(
                        property1 = 2f,
                        property2 = 1f,
                        property3 = 2f,
                    ),
                    SampleDataClass3FloatsWithAllParams(
                        property1 = 2f,
                        property2 = 2f,
                        property3 = 1f,
                    ),
                    SampleDataClass3FloatsWithAllParams(
                        property1 = 2f,
                        property2 = 2f,
                        property3 = 2f,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1FloatWithSomeParamsCombinations() {
        assertThat(SampleDataClass1FloatWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1FloatWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1FloatWithSomeParams(
                        property1 = 1f,
                    ),
                    SampleDataClass1FloatWithSomeParams(
                        property1 = 2f,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2FloatsWithSomeParamsCombinations() {
        assertThat(SampleDataClass2FloatsWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2FloatsWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2FloatsWithSomeParams(
                        property1 = 1f,
                        property2 = 1f,
                    ),
                    SampleDataClass2FloatsWithSomeParams(
                        property1 = 1f,
                        property2 = 2f,
                    ),
                    SampleDataClass2FloatsWithSomeParams(
                        property1 = 2f,
                        property2 = 1f,
                    ),
                    SampleDataClass2FloatsWithSomeParams(
                        property1 = 2f,
                        property2 = 2f,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3FloatsWithSomeParamsCombinations() {
        assertThat(SampleDataClass3FloatsWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3FloatsWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3FloatsWithSomeParams(
                        property1 = 1f,
                        property2 = 1f,
                        property3 = 1f,
                    ),
                    SampleDataClass3FloatsWithSomeParams(
                        property1 = 1f,
                        property2 = 1f,
                        property3 = 2f,
                    ),
                    SampleDataClass3FloatsWithSomeParams(
                        property1 = 1f,
                        property2 = 2f,
                        property3 = 1f,
                    ),
                    SampleDataClass3FloatsWithSomeParams(
                        property1 = 1f,
                        property2 = 2f,
                        property3 = 2f,
                    ),
                    SampleDataClass3FloatsWithSomeParams(
                        property1 = 2f,
                        property2 = 1f,
                        property3 = 1f,
                    ),
                    SampleDataClass3FloatsWithSomeParams(
                        property1 = 2f,
                        property2 = 1f,
                        property3 = 2f,
                    ),
                    SampleDataClass3FloatsWithSomeParams(
                        property1 = 2f,
                        property2 = 2f,
                        property3 = 1f,
                    ),
                    SampleDataClass3FloatsWithSomeParams(
                        property1 = 2f,
                        property2 = 2f,
                        property3 = 2f,
                    ),
                )
            )
        ).isEqualTo(true)
    }
}