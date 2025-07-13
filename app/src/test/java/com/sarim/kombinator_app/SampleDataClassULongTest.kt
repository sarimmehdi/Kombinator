package com.sarim.kombinator_app

import com.google.common.truth.Truth.assertThat
import com.sarim.kombinator_app.sample.SampleDataClass1ULongWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass1ULongWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1ULongWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass1ULongWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1ULongWithULongParams
import com.sarim.kombinator_app.sample.SampleDataClass1ULongWithULongParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2ULongsWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass2ULongsWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2ULongsWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass2ULongsWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2ULongsWithULongParams
import com.sarim.kombinator_app.sample.SampleDataClass2ULongsWithULongParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3ULongsWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass3ULongsWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3ULongsWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass3ULongsWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3ULongsWithULongParams
import com.sarim.kombinator_app.sample.SampleDataClass3ULongsWithULongParamsCombinations
import org.junit.Test

class SampleDataClassULongTest {
    @Test
    fun testSampleDataClass1ULongWithULongParamsCombinations() {
        assertThat(SampleDataClass1ULongWithULongParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1ULongWithULongParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1ULongWithULongParams(
                        property1 = 1u,
                    ),
                    SampleDataClass1ULongWithULongParams(
                        property1 = 2u,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2ULongsWithULongParamsCombinations() {
        assertThat(SampleDataClass2ULongsWithULongParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2ULongsWithULongParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2ULongsWithULongParams(
                        property1 = 1u,
                        property2 = 1u,
                    ),
                    SampleDataClass2ULongsWithULongParams(
                        property1 = 1u,
                        property2 = 2u,
                    ),
                    SampleDataClass2ULongsWithULongParams(
                        property1 = 2u,
                        property2 = 1u,
                    ),
                    SampleDataClass2ULongsWithULongParams(
                        property1 = 2u,
                        property2 = 2u,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3ULongsWithULongParamsCombinations() {
        assertThat(SampleDataClass3ULongsWithULongParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3ULongsWithULongParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3ULongsWithULongParams(
                        property1 = 1u,
                        property2 = 1u,
                        property3 = 1u,
                    ),
                    SampleDataClass3ULongsWithULongParams(
                        property1 = 1u,
                        property2 = 1u,
                        property3 = 2u,
                    ),
                    SampleDataClass3ULongsWithULongParams(
                        property1 = 1u,
                        property2 = 2u,
                        property3 = 1u,
                    ),
                    SampleDataClass3ULongsWithULongParams(
                        property1 = 1u,
                        property2 = 2u,
                        property3 = 2u,
                    ),
                    SampleDataClass3ULongsWithULongParams(
                        property1 = 2u,
                        property2 = 1u,
                        property3 = 1u,
                    ),
                    SampleDataClass3ULongsWithULongParams(
                        property1 = 2u,
                        property2 = 1u,
                        property3 = 2u,
                    ),
                    SampleDataClass3ULongsWithULongParams(
                        property1 = 2u,
                        property2 = 2u,
                        property3 = 1u,
                    ),
                    SampleDataClass3ULongsWithULongParams(
                        property1 = 2u,
                        property2 = 2u,
                        property3 = 2u,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1ULongWithAllParamsCombinations() {
        assertThat(SampleDataClass1ULongWithAllParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1ULongWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1ULongWithAllParams(
                        property1 = 1u,
                    ),
                    SampleDataClass1ULongWithAllParams(
                        property1 = 2u,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2ULongsWithAllParamsCombinations() {
        assertThat(SampleDataClass2ULongsWithAllParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2ULongsWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2ULongsWithAllParams(
                        property1 = 1u,
                        property2 = 1u,
                    ),
                    SampleDataClass2ULongsWithAllParams(
                        property1 = 1u,
                        property2 = 2u,
                    ),
                    SampleDataClass2ULongsWithAllParams(
                        property1 = 2u,
                        property2 = 1u,
                    ),
                    SampleDataClass2ULongsWithAllParams(
                        property1 = 2u,
                        property2 = 2u,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3ULongsWithAllParamsCombinations() {
        assertThat(SampleDataClass3ULongsWithAllParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3ULongsWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3ULongsWithAllParams(
                        property1 = 1u,
                        property2 = 1u,
                        property3 = 1u,
                    ),
                    SampleDataClass3ULongsWithAllParams(
                        property1 = 1u,
                        property2 = 1u,
                        property3 = 2u,
                    ),
                    SampleDataClass3ULongsWithAllParams(
                        property1 = 1u,
                        property2 = 2u,
                        property3 = 1u,
                    ),
                    SampleDataClass3ULongsWithAllParams(
                        property1 = 1u,
                        property2 = 2u,
                        property3 = 2u,
                    ),
                    SampleDataClass3ULongsWithAllParams(
                        property1 = 2u,
                        property2 = 1u,
                        property3 = 1u,
                    ),
                    SampleDataClass3ULongsWithAllParams(
                        property1 = 2u,
                        property2 = 1u,
                        property3 = 2u,
                    ),
                    SampleDataClass3ULongsWithAllParams(
                        property1 = 2u,
                        property2 = 2u,
                        property3 = 1u,
                    ),
                    SampleDataClass3ULongsWithAllParams(
                        property1 = 2u,
                        property2 = 2u,
                        property3 = 2u,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1ULongWithSomeParamsCombinations() {
        assertThat(SampleDataClass1ULongWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1ULongWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1ULongWithSomeParams(
                        property1 = 1u,
                    ),
                    SampleDataClass1ULongWithSomeParams(
                        property1 = 2u,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2ULongsWithSomeParamsCombinations() {
        assertThat(SampleDataClass2ULongsWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2ULongsWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2ULongsWithSomeParams(
                        property1 = 1u,
                        property2 = 1u,
                    ),
                    SampleDataClass2ULongsWithSomeParams(
                        property1 = 1u,
                        property2 = 2u,
                    ),
                    SampleDataClass2ULongsWithSomeParams(
                        property1 = 2u,
                        property2 = 1u,
                    ),
                    SampleDataClass2ULongsWithSomeParams(
                        property1 = 2u,
                        property2 = 2u,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3ULongsWithSomeParamsCombinations() {
        assertThat(SampleDataClass3ULongsWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3ULongsWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3ULongsWithSomeParams(
                        property1 = 1u,
                        property2 = 1u,
                        property3 = 1u,
                    ),
                    SampleDataClass3ULongsWithSomeParams(
                        property1 = 1u,
                        property2 = 1u,
                        property3 = 2u,
                    ),
                    SampleDataClass3ULongsWithSomeParams(
                        property1 = 1u,
                        property2 = 2u,
                        property3 = 1u,
                    ),
                    SampleDataClass3ULongsWithSomeParams(
                        property1 = 1u,
                        property2 = 2u,
                        property3 = 2u,
                    ),
                    SampleDataClass3ULongsWithSomeParams(
                        property1 = 2u,
                        property2 = 1u,
                        property3 = 1u,
                    ),
                    SampleDataClass3ULongsWithSomeParams(
                        property1 = 2u,
                        property2 = 1u,
                        property3 = 2u,
                    ),
                    SampleDataClass3ULongsWithSomeParams(
                        property1 = 2u,
                        property2 = 2u,
                        property3 = 1u,
                    ),
                    SampleDataClass3ULongsWithSomeParams(
                        property1 = 2u,
                        property2 = 2u,
                        property3 = 2u,
                    ),
                ),
            ),
        ).isEqualTo(true)
    }
}
