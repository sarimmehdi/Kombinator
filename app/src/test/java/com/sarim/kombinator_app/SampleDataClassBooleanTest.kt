package com.sarim.kombinator_app

import com.google.common.truth.Truth.assertThat
import com.sarim.kombinator_app.sample.SampleDataClass1Boolean
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanWithByteParams
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanWithByteParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanWithCharParams
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanWithCharParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanWithDoubleParams
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanWithDoubleParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanWithFloatParams
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanWithFloatParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanWithIntParams
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanWithIntParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanWithLongParams
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanWithLongParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanWithShortParams
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanWithShortParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanWithStringParams
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanWithStringParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanWithUByteParams
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanWithUByteParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanWithUIntParams
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanWithUIntParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanWithULongParams
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanWithULongParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanWithUShortParams
import com.sarim.kombinator_app.sample.SampleDataClass1BooleanWithUShortParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2Booleans
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansWithByteParams
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansWithByteParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansWithCharParams
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansWithCharParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansWithDoubleParams
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansWithDoubleParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansWithFloatParams
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansWithFloatParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansWithIntParams
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansWithIntParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansWithLongParams
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansWithLongParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansWithShortParams
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansWithShortParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansWithStringParams
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansWithStringParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansWithUByteParams
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansWithUByteParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansWithUIntParams
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansWithUIntParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansWithULongParams
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansWithULongParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansWithUShortParams
import com.sarim.kombinator_app.sample.SampleDataClass2BooleansWithUShortParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3Booleans
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansWithByteParams
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansWithByteParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansWithCharParams
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansWithCharParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansWithDoubleParams
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansWithDoubleParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansWithFloatParams
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansWithFloatParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansWithIntParams
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansWithIntParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansWithLongParams
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansWithLongParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansWithShortParams
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansWithShortParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansWithStringParams
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansWithStringParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansWithUByteParams
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansWithUByteParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansWithUIntParams
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansWithUIntParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansWithULongParams
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansWithULongParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansWithUShortParams
import com.sarim.kombinator_app.sample.SampleDataClass3BooleansWithUShortParamsCombinations
import org.junit.Test

@Suppress("LargeClass")
class SampleDataClassBooleanTest {
    @Test
    fun testSampleDataClass1BooleanCombinations() {
        assertThat(SampleDataClass1BooleanCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1BooleanCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1Boolean(
                        property1 = true,
                    ),
                    SampleDataClass1Boolean(
                        property1 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2BooleansCombinations() {
        assertThat(SampleDataClass2BooleansCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2BooleansCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2Booleans(
                        property1 = true,
                        property2 = false,
                    ),
                    SampleDataClass2Booleans(
                        property1 = false,
                        property2 = true,
                    ),
                    SampleDataClass2Booleans(
                        property1 = true,
                        property2 = true,
                    ),
                    SampleDataClass2Booleans(
                        property1 = false,
                        property2 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3BooleansCombinations() {
        assertThat(SampleDataClass3BooleansCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3BooleansCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3Booleans(
                        property1 = true,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3Booleans(
                        property1 = true,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3Booleans(
                        property1 = true,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3Booleans(
                        property1 = true,
                        property2 = false,
                        property3 = false,
                    ),
                    SampleDataClass3Booleans(
                        property1 = false,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3Booleans(
                        property1 = false,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3Booleans(
                        property1 = false,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3Booleans(
                        property1 = false,
                        property2 = false,
                        property3 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1BooleanWithStringParamsCombinations() {
        assertThat(SampleDataClass1BooleanWithStringParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1BooleanWithStringParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1BooleanWithStringParams(
                        property1 = true,
                    ),
                    SampleDataClass1BooleanWithStringParams(
                        property1 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2BooleansWithStringParamsCombinations() {
        assertThat(SampleDataClass2BooleansWithStringParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2BooleansWithStringParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2BooleansWithStringParams(
                        property1 = true,
                        property2 = false,
                    ),
                    SampleDataClass2BooleansWithStringParams(
                        property1 = false,
                        property2 = true,
                    ),
                    SampleDataClass2BooleansWithStringParams(
                        property1 = true,
                        property2 = true,
                    ),
                    SampleDataClass2BooleansWithStringParams(
                        property1 = false,
                        property2 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3BooleansWithStringParamsCombinations() {
        assertThat(SampleDataClass3BooleansWithStringParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3BooleansWithStringParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3BooleansWithStringParams(
                        property1 = true,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithStringParams(
                        property1 = true,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithStringParams(
                        property1 = true,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithStringParams(
                        property1 = true,
                        property2 = false,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithStringParams(
                        property1 = false,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithStringParams(
                        property1 = false,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithStringParams(
                        property1 = false,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithStringParams(
                        property1 = false,
                        property2 = false,
                        property3 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1BooleanWithIntParamsCombinations() {
        assertThat(SampleDataClass1BooleanWithIntParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1BooleanWithIntParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1BooleanWithIntParams(
                        property1 = true,
                    ),
                    SampleDataClass1BooleanWithIntParams(
                        property1 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2BooleansWithIntParamsCombinations() {
        assertThat(SampleDataClass2BooleansWithIntParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2BooleansWithIntParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2BooleansWithIntParams(
                        property1 = true,
                        property2 = false,
                    ),
                    SampleDataClass2BooleansWithIntParams(
                        property1 = false,
                        property2 = true,
                    ),
                    SampleDataClass2BooleansWithIntParams(
                        property1 = true,
                        property2 = true,
                    ),
                    SampleDataClass2BooleansWithIntParams(
                        property1 = false,
                        property2 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3BooleansWithIntParamsCombinations() {
        assertThat(SampleDataClass3BooleansWithIntParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3BooleansWithIntParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3BooleansWithIntParams(
                        property1 = true,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithIntParams(
                        property1 = true,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithIntParams(
                        property1 = true,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithIntParams(
                        property1 = true,
                        property2 = false,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithIntParams(
                        property1 = false,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithIntParams(
                        property1 = false,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithIntParams(
                        property1 = false,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithIntParams(
                        property1 = false,
                        property2 = false,
                        property3 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1BooleanWithFloatParamsCombinations() {
        assertThat(SampleDataClass1BooleanWithFloatParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1BooleanWithFloatParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1BooleanWithFloatParams(
                        property1 = true,
                    ),
                    SampleDataClass1BooleanWithFloatParams(
                        property1 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2BooleansWithFloatParamsCombinations() {
        assertThat(SampleDataClass2BooleansWithFloatParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2BooleansWithFloatParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2BooleansWithFloatParams(
                        property1 = true,
                        property2 = false,
                    ),
                    SampleDataClass2BooleansWithFloatParams(
                        property1 = false,
                        property2 = true,
                    ),
                    SampleDataClass2BooleansWithFloatParams(
                        property1 = true,
                        property2 = true,
                    ),
                    SampleDataClass2BooleansWithFloatParams(
                        property1 = false,
                        property2 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3BooleansWithFloatParamsCombinations() {
        assertThat(SampleDataClass3BooleansWithFloatParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3BooleansWithFloatParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3BooleansWithFloatParams(
                        property1 = true,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithFloatParams(
                        property1 = true,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithFloatParams(
                        property1 = true,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithFloatParams(
                        property1 = true,
                        property2 = false,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithFloatParams(
                        property1 = false,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithFloatParams(
                        property1 = false,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithFloatParams(
                        property1 = false,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithFloatParams(
                        property1 = false,
                        property2 = false,
                        property3 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1BooleanWithDoubleParamsCombinations() {
        assertThat(SampleDataClass1BooleanWithDoubleParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1BooleanWithDoubleParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1BooleanWithDoubleParams(
                        property1 = true,
                    ),
                    SampleDataClass1BooleanWithDoubleParams(
                        property1 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2BooleansWithDoubleParamsCombinations() {
        assertThat(SampleDataClass2BooleansWithDoubleParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2BooleansWithDoubleParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2BooleansWithDoubleParams(
                        property1 = true,
                        property2 = false,
                    ),
                    SampleDataClass2BooleansWithDoubleParams(
                        property1 = false,
                        property2 = true,
                    ),
                    SampleDataClass2BooleansWithDoubleParams(
                        property1 = true,
                        property2 = true,
                    ),
                    SampleDataClass2BooleansWithDoubleParams(
                        property1 = false,
                        property2 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3BooleansWithDoubleParamsCombinations() {
        assertThat(SampleDataClass3BooleansWithDoubleParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3BooleansWithDoubleParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3BooleansWithDoubleParams(
                        property1 = true,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithDoubleParams(
                        property1 = true,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithDoubleParams(
                        property1 = true,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithDoubleParams(
                        property1 = true,
                        property2 = false,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithDoubleParams(
                        property1 = false,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithDoubleParams(
                        property1 = false,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithDoubleParams(
                        property1 = false,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithDoubleParams(
                        property1 = false,
                        property2 = false,
                        property3 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1BooleanWithLongParamsCombinations() {
        assertThat(SampleDataClass1BooleanWithLongParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1BooleanWithLongParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1BooleanWithLongParams(
                        property1 = true,
                    ),
                    SampleDataClass1BooleanWithLongParams(
                        property1 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2BooleansWithLongParamsCombinations() {
        assertThat(SampleDataClass2BooleansWithLongParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2BooleansWithLongParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2BooleansWithLongParams(
                        property1 = true,
                        property2 = false,
                    ),
                    SampleDataClass2BooleansWithLongParams(
                        property1 = false,
                        property2 = true,
                    ),
                    SampleDataClass2BooleansWithLongParams(
                        property1 = true,
                        property2 = true,
                    ),
                    SampleDataClass2BooleansWithLongParams(
                        property1 = false,
                        property2 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3BooleansWithLongParamsCombinations() {
        assertThat(SampleDataClass3BooleansWithLongParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3BooleansWithLongParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3BooleansWithLongParams(
                        property1 = true,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithLongParams(
                        property1 = true,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithLongParams(
                        property1 = true,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithLongParams(
                        property1 = true,
                        property2 = false,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithLongParams(
                        property1 = false,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithLongParams(
                        property1 = false,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithLongParams(
                        property1 = false,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithLongParams(
                        property1 = false,
                        property2 = false,
                        property3 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1BooleanWithByteParamsCombinations() {
        assertThat(SampleDataClass1BooleanWithByteParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1BooleanWithByteParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1BooleanWithByteParams(
                        property1 = true,
                    ),
                    SampleDataClass1BooleanWithByteParams(
                        property1 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2BooleansWithByteParamsCombinations() {
        assertThat(SampleDataClass2BooleansWithByteParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2BooleansWithByteParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2BooleansWithByteParams(
                        property1 = true,
                        property2 = false,
                    ),
                    SampleDataClass2BooleansWithByteParams(
                        property1 = false,
                        property2 = true,
                    ),
                    SampleDataClass2BooleansWithByteParams(
                        property1 = true,
                        property2 = true,
                    ),
                    SampleDataClass2BooleansWithByteParams(
                        property1 = false,
                        property2 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3BooleansWithByteParamsCombinations() {
        assertThat(SampleDataClass3BooleansWithByteParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3BooleansWithByteParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3BooleansWithByteParams(
                        property1 = true,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithByteParams(
                        property1 = true,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithByteParams(
                        property1 = true,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithByteParams(
                        property1 = true,
                        property2 = false,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithByteParams(
                        property1 = false,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithByteParams(
                        property1 = false,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithByteParams(
                        property1 = false,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithByteParams(
                        property1 = false,
                        property2 = false,
                        property3 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1BooleanWithCharParamsCombinations() {
        assertThat(SampleDataClass1BooleanWithCharParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1BooleanWithCharParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1BooleanWithCharParams(
                        property1 = true,
                    ),
                    SampleDataClass1BooleanWithCharParams(
                        property1 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2BooleansWithCharParamsCombinations() {
        assertThat(SampleDataClass2BooleansWithCharParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2BooleansWithCharParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2BooleansWithCharParams(
                        property1 = true,
                        property2 = false,
                    ),
                    SampleDataClass2BooleansWithCharParams(
                        property1 = false,
                        property2 = true,
                    ),
                    SampleDataClass2BooleansWithCharParams(
                        property1 = true,
                        property2 = true,
                    ),
                    SampleDataClass2BooleansWithCharParams(
                        property1 = false,
                        property2 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3BooleansWithCharParamsCombinations() {
        assertThat(SampleDataClass3BooleansWithCharParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3BooleansWithCharParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3BooleansWithCharParams(
                        property1 = true,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithCharParams(
                        property1 = true,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithCharParams(
                        property1 = true,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithCharParams(
                        property1 = true,
                        property2 = false,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithCharParams(
                        property1 = false,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithCharParams(
                        property1 = false,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithCharParams(
                        property1 = false,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithCharParams(
                        property1 = false,
                        property2 = false,
                        property3 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1BooleanWithShortParamsCombinations() {
        assertThat(SampleDataClass1BooleanWithShortParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1BooleanWithShortParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1BooleanWithShortParams(
                        property1 = true,
                    ),
                    SampleDataClass1BooleanWithShortParams(
                        property1 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2BooleansWithShortParamsCombinations() {
        assertThat(SampleDataClass2BooleansWithShortParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2BooleansWithShortParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2BooleansWithShortParams(
                        property1 = true,
                        property2 = false,
                    ),
                    SampleDataClass2BooleansWithShortParams(
                        property1 = false,
                        property2 = true,
                    ),
                    SampleDataClass2BooleansWithShortParams(
                        property1 = true,
                        property2 = true,
                    ),
                    SampleDataClass2BooleansWithShortParams(
                        property1 = false,
                        property2 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3BooleansWithShortParamsCombinations() {
        assertThat(SampleDataClass3BooleansWithShortParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3BooleansWithShortParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3BooleansWithShortParams(
                        property1 = true,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithShortParams(
                        property1 = true,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithShortParams(
                        property1 = true,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithShortParams(
                        property1 = true,
                        property2 = false,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithShortParams(
                        property1 = false,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithShortParams(
                        property1 = false,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithShortParams(
                        property1 = false,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithShortParams(
                        property1 = false,
                        property2 = false,
                        property3 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1BooleanWithUByteParamsCombinations() {
        assertThat(SampleDataClass1BooleanWithUByteParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1BooleanWithUByteParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1BooleanWithUByteParams(
                        property1 = true,
                    ),
                    SampleDataClass1BooleanWithUByteParams(
                        property1 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2BooleansWithUByteParamsCombinations() {
        assertThat(SampleDataClass2BooleansWithUByteParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2BooleansWithUByteParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2BooleansWithUByteParams(
                        property1 = true,
                        property2 = false,
                    ),
                    SampleDataClass2BooleansWithUByteParams(
                        property1 = false,
                        property2 = true,
                    ),
                    SampleDataClass2BooleansWithUByteParams(
                        property1 = true,
                        property2 = true,
                    ),
                    SampleDataClass2BooleansWithUByteParams(
                        property1 = false,
                        property2 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3BooleansWithUByteParamsCombinations() {
        assertThat(SampleDataClass3BooleansWithUByteParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3BooleansWithUByteParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3BooleansWithUByteParams(
                        property1 = true,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithUByteParams(
                        property1 = true,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithUByteParams(
                        property1 = true,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithUByteParams(
                        property1 = true,
                        property2 = false,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithUByteParams(
                        property1 = false,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithUByteParams(
                        property1 = false,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithUByteParams(
                        property1 = false,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithUByteParams(
                        property1 = false,
                        property2 = false,
                        property3 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1BooleanWithUShortParamsCombinations() {
        assertThat(SampleDataClass1BooleanWithUShortParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1BooleanWithUShortParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1BooleanWithUShortParams(
                        property1 = true,
                    ),
                    SampleDataClass1BooleanWithUShortParams(
                        property1 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2BooleansWithUShortParamsCombinations() {
        assertThat(SampleDataClass2BooleansWithUShortParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2BooleansWithUShortParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2BooleansWithUShortParams(
                        property1 = true,
                        property2 = false,
                    ),
                    SampleDataClass2BooleansWithUShortParams(
                        property1 = false,
                        property2 = true,
                    ),
                    SampleDataClass2BooleansWithUShortParams(
                        property1 = true,
                        property2 = true,
                    ),
                    SampleDataClass2BooleansWithUShortParams(
                        property1 = false,
                        property2 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3BooleansWithUShortParamsCombinations() {
        assertThat(SampleDataClass3BooleansWithUShortParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3BooleansWithUShortParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3BooleansWithUShortParams(
                        property1 = true,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithUShortParams(
                        property1 = true,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithUShortParams(
                        property1 = true,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithUShortParams(
                        property1 = true,
                        property2 = false,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithUShortParams(
                        property1 = false,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithUShortParams(
                        property1 = false,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithUShortParams(
                        property1 = false,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithUShortParams(
                        property1 = false,
                        property2 = false,
                        property3 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1BooleanWithUIntParamsCombinations() {
        assertThat(SampleDataClass1BooleanWithUIntParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1BooleanWithUIntParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1BooleanWithUIntParams(
                        property1 = true,
                    ),
                    SampleDataClass1BooleanWithUIntParams(
                        property1 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2BooleansWithUIntParamsCombinations() {
        assertThat(SampleDataClass2BooleansWithUIntParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2BooleansWithUIntParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2BooleansWithUIntParams(
                        property1 = true,
                        property2 = false,
                    ),
                    SampleDataClass2BooleansWithUIntParams(
                        property1 = false,
                        property2 = true,
                    ),
                    SampleDataClass2BooleansWithUIntParams(
                        property1 = true,
                        property2 = true,
                    ),
                    SampleDataClass2BooleansWithUIntParams(
                        property1 = false,
                        property2 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3BooleansWithUIntParamsCombinations() {
        assertThat(SampleDataClass3BooleansWithUIntParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3BooleansWithUIntParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3BooleansWithUIntParams(
                        property1 = true,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithUIntParams(
                        property1 = true,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithUIntParams(
                        property1 = true,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithUIntParams(
                        property1 = true,
                        property2 = false,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithUIntParams(
                        property1 = false,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithUIntParams(
                        property1 = false,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithUIntParams(
                        property1 = false,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithUIntParams(
                        property1 = false,
                        property2 = false,
                        property3 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1BooleanWithULongParamsCombinations() {
        assertThat(SampleDataClass1BooleanWithULongParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1BooleanWithULongParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1BooleanWithULongParams(
                        property1 = true,
                    ),
                    SampleDataClass1BooleanWithULongParams(
                        property1 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2BooleansWithULongParamsCombinations() {
        assertThat(SampleDataClass2BooleansWithULongParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2BooleansWithULongParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2BooleansWithULongParams(
                        property1 = true,
                        property2 = false,
                    ),
                    SampleDataClass2BooleansWithULongParams(
                        property1 = false,
                        property2 = true,
                    ),
                    SampleDataClass2BooleansWithULongParams(
                        property1 = true,
                        property2 = true,
                    ),
                    SampleDataClass2BooleansWithULongParams(
                        property1 = false,
                        property2 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3BooleansWithULongParamsCombinations() {
        assertThat(SampleDataClass3BooleansWithULongParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3BooleansWithULongParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3BooleansWithULongParams(
                        property1 = true,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithULongParams(
                        property1 = true,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithULongParams(
                        property1 = true,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithULongParams(
                        property1 = true,
                        property2 = false,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithULongParams(
                        property1 = false,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithULongParams(
                        property1 = false,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithULongParams(
                        property1 = false,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithULongParams(
                        property1 = false,
                        property2 = false,
                        property3 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1BooleanWithAllParamsCombinations() {
        assertThat(SampleDataClass1BooleanWithAllParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1BooleanWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1BooleanWithAllParams(
                        property1 = true,
                    ),
                    SampleDataClass1BooleanWithAllParams(
                        property1 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2BooleansWithAllParamsCombinations() {
        assertThat(SampleDataClass2BooleansWithAllParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2BooleansWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2BooleansWithAllParams(
                        property1 = true,
                        property2 = false,
                    ),
                    SampleDataClass2BooleansWithAllParams(
                        property1 = false,
                        property2 = true,
                    ),
                    SampleDataClass2BooleansWithAllParams(
                        property1 = true,
                        property2 = true,
                    ),
                    SampleDataClass2BooleansWithAllParams(
                        property1 = false,
                        property2 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3BooleansWithAllParamsCombinations() {
        assertThat(SampleDataClass3BooleansWithAllParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3BooleansWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3BooleansWithAllParams(
                        property1 = true,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithAllParams(
                        property1 = true,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithAllParams(
                        property1 = true,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithAllParams(
                        property1 = true,
                        property2 = false,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithAllParams(
                        property1 = false,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithAllParams(
                        property1 = false,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithAllParams(
                        property1 = false,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithAllParams(
                        property1 = false,
                        property2 = false,
                        property3 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1BooleanWithSomeParamsCombinations() {
        assertThat(SampleDataClass1BooleanWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1BooleanWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1BooleanWithSomeParams(
                        property1 = true,
                    ),
                    SampleDataClass1BooleanWithSomeParams(
                        property1 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2BooleansWithSomeParamsCombinations() {
        assertThat(SampleDataClass2BooleansWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2BooleansWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2BooleansWithSomeParams(
                        property1 = true,
                        property2 = false,
                    ),
                    SampleDataClass2BooleansWithSomeParams(
                        property1 = false,
                        property2 = true,
                    ),
                    SampleDataClass2BooleansWithSomeParams(
                        property1 = true,
                        property2 = true,
                    ),
                    SampleDataClass2BooleansWithSomeParams(
                        property1 = false,
                        property2 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3BooleansWithSomeParamsCombinations() {
        assertThat(SampleDataClass3BooleansWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3BooleansWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3BooleansWithSomeParams(
                        property1 = true,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithSomeParams(
                        property1 = true,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithSomeParams(
                        property1 = true,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithSomeParams(
                        property1 = true,
                        property2 = false,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithSomeParams(
                        property1 = false,
                        property2 = true,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithSomeParams(
                        property1 = false,
                        property2 = true,
                        property3 = false,
                    ),
                    SampleDataClass3BooleansWithSomeParams(
                        property1 = false,
                        property2 = false,
                        property3 = true,
                    ),
                    SampleDataClass3BooleansWithSomeParams(
                        property1 = false,
                        property2 = false,
                        property3 = false,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }
}
