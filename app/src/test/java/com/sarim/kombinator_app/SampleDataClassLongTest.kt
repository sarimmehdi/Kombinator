package com.sarim.kombinator_app

import com.google.common.truth.Truth.assertThat
import com.sarim.kombinator_app.sample.SampleDataClass1LongWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass1LongWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1LongWithLongParams
import com.sarim.kombinator_app.sample.SampleDataClass1LongWithLongParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1LongWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass1LongWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2LongsWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass2LongsWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2LongsWithLongParams
import com.sarim.kombinator_app.sample.SampleDataClass2LongsWithLongParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2LongsWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass2LongsWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3LongsWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass3LongsWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3LongsWithLongParams
import com.sarim.kombinator_app.sample.SampleDataClass3LongsWithLongParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3LongsWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass3LongsWithSomeParamsCombinations
import org.junit.Test

class SampleDataClassLongTest {
    @Test
    fun testSampleDataClass1LongWithLongParamsCombinations() {
        assertThat(SampleDataClass1LongWithLongParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1LongWithLongParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1LongWithLongParams(
                        property1 = 1,
                    ),
                    SampleDataClass1LongWithLongParams(
                        property1 = 2,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2LongsWithLongParamsCombinations() {
        assertThat(SampleDataClass2LongsWithLongParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2LongsWithLongParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2LongsWithLongParams(
                        property1 = 1,
                        property2 = 1,
                    ),
                    SampleDataClass2LongsWithLongParams(
                        property1 = 1,
                        property2 = 2,
                    ),
                    SampleDataClass2LongsWithLongParams(
                        property1 = 2,
                        property2 = 1,
                    ),
                    SampleDataClass2LongsWithLongParams(
                        property1 = 2,
                        property2 = 2,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3LongsWithLongParamsCombinations() {
        assertThat(SampleDataClass3LongsWithLongParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3LongsWithLongParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3LongsWithLongParams(
                        property1 = 1,
                        property2 = 1,
                        property3 = 1,
                    ),
                    SampleDataClass3LongsWithLongParams(
                        property1 = 1,
                        property2 = 1,
                        property3 = 2,
                    ),
                    SampleDataClass3LongsWithLongParams(
                        property1 = 1,
                        property2 = 2,
                        property3 = 1,
                    ),
                    SampleDataClass3LongsWithLongParams(
                        property1 = 1,
                        property2 = 2,
                        property3 = 2,
                    ),
                    SampleDataClass3LongsWithLongParams(
                        property1 = 2,
                        property2 = 1,
                        property3 = 1,
                    ),
                    SampleDataClass3LongsWithLongParams(
                        property1 = 2,
                        property2 = 1,
                        property3 = 2,
                    ),
                    SampleDataClass3LongsWithLongParams(
                        property1 = 2,
                        property2 = 2,
                        property3 = 1,
                    ),
                    SampleDataClass3LongsWithLongParams(
                        property1 = 2,
                        property2 = 2,
                        property3 = 2,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1LongWithAllParamsCombinations() {
        assertThat(SampleDataClass1LongWithAllParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1LongWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1LongWithAllParams(
                        property1 = 1,
                    ),
                    SampleDataClass1LongWithAllParams(
                        property1 = 2,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2LongsWithAllParamsCombinations() {
        assertThat(SampleDataClass2LongsWithAllParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2LongsWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2LongsWithAllParams(
                        property1 = 1,
                        property2 = 1,
                    ),
                    SampleDataClass2LongsWithAllParams(
                        property1 = 1,
                        property2 = 2,
                    ),
                    SampleDataClass2LongsWithAllParams(
                        property1 = 2,
                        property2 = 1,
                    ),
                    SampleDataClass2LongsWithAllParams(
                        property1 = 2,
                        property2 = 2,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3LongsWithAllParamsCombinations() {
        assertThat(SampleDataClass3LongsWithAllParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3LongsWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3LongsWithAllParams(
                        property1 = 1,
                        property2 = 1,
                        property3 = 1,
                    ),
                    SampleDataClass3LongsWithAllParams(
                        property1 = 1,
                        property2 = 1,
                        property3 = 2,
                    ),
                    SampleDataClass3LongsWithAllParams(
                        property1 = 1,
                        property2 = 2,
                        property3 = 1,
                    ),
                    SampleDataClass3LongsWithAllParams(
                        property1 = 1,
                        property2 = 2,
                        property3 = 2,
                    ),
                    SampleDataClass3LongsWithAllParams(
                        property1 = 2,
                        property2 = 1,
                        property3 = 1,
                    ),
                    SampleDataClass3LongsWithAllParams(
                        property1 = 2,
                        property2 = 1,
                        property3 = 2,
                    ),
                    SampleDataClass3LongsWithAllParams(
                        property1 = 2,
                        property2 = 2,
                        property3 = 1,
                    ),
                    SampleDataClass3LongsWithAllParams(
                        property1 = 2,
                        property2 = 2,
                        property3 = 2,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1LongWithSomeParamsCombinations() {
        assertThat(SampleDataClass1LongWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1LongWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1LongWithSomeParams(
                        property1 = 1,
                    ),
                    SampleDataClass1LongWithSomeParams(
                        property1 = 2,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2LongsWithSomeParamsCombinations() {
        assertThat(SampleDataClass2LongsWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2LongsWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2LongsWithSomeParams(
                        property1 = 1,
                        property2 = 1,
                    ),
                    SampleDataClass2LongsWithSomeParams(
                        property1 = 1,
                        property2 = 2,
                    ),
                    SampleDataClass2LongsWithSomeParams(
                        property1 = 2,
                        property2 = 1,
                    ),
                    SampleDataClass2LongsWithSomeParams(
                        property1 = 2,
                        property2 = 2,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3LongsWithSomeParamsCombinations() {
        assertThat(SampleDataClass3LongsWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3LongsWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3LongsWithSomeParams(
                        property1 = 1,
                        property2 = 1,
                        property3 = 1,
                    ),
                    SampleDataClass3LongsWithSomeParams(
                        property1 = 1,
                        property2 = 1,
                        property3 = 2,
                    ),
                    SampleDataClass3LongsWithSomeParams(
                        property1 = 1,
                        property2 = 2,
                        property3 = 1,
                    ),
                    SampleDataClass3LongsWithSomeParams(
                        property1 = 1,
                        property2 = 2,
                        property3 = 2,
                    ),
                    SampleDataClass3LongsWithSomeParams(
                        property1 = 2,
                        property2 = 1,
                        property3 = 1,
                    ),
                    SampleDataClass3LongsWithSomeParams(
                        property1 = 2,
                        property2 = 1,
                        property3 = 2,
                    ),
                    SampleDataClass3LongsWithSomeParams(
                        property1 = 2,
                        property2 = 2,
                        property3 = 1,
                    ),
                    SampleDataClass3LongsWithSomeParams(
                        property1 = 2,
                        property2 = 2,
                        property3 = 2,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }
}
