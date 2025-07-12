package com.sarim.kombinator_app

import com.google.common.truth.Truth.assertThat
import com.sarim.kombinator_app.sample.SampleDataClass1UByteWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass1UByteWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1UByteWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass1UByteWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1UByteWithUByteParams
import com.sarim.kombinator_app.sample.SampleDataClass1UByteWithUByteParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2UBytesWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass2UBytesWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2UBytesWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass2UBytesWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2UBytesWithUByteParams
import com.sarim.kombinator_app.sample.SampleDataClass2UBytesWithUByteParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3UBytesWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass3UBytesWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3UBytesWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass3UBytesWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3UBytesWithUByteParams
import com.sarim.kombinator_app.sample.SampleDataClass3UBytesWithUByteParamsCombinations
import org.junit.Test

class SampleDataClassUByteTest {

    @Test
    fun testSampleDataClass1UByteWithUByteParamsCombinations() {
        assertThat(SampleDataClass1UByteWithUByteParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1UByteWithUByteParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1UByteWithUByteParams(
                        property1 = 1u,
                    ),
                    SampleDataClass1UByteWithUByteParams(
                        property1 = 2u,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2UBytesWithUByteParamsCombinations() {
        assertThat(SampleDataClass2UBytesWithUByteParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2UBytesWithUByteParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2UBytesWithUByteParams(
                        property1 = 1u,
                        property2 = 1u,
                    ),
                    SampleDataClass2UBytesWithUByteParams(
                        property1 = 1u,
                        property2 = 2u,
                    ),
                    SampleDataClass2UBytesWithUByteParams(
                        property1 = 2u,
                        property2 = 1u,
                    ),
                    SampleDataClass2UBytesWithUByteParams(
                        property1 = 2u,
                        property2 = 2u,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3UBytesWithUByteParamsCombinations() {
        assertThat(SampleDataClass3UBytesWithUByteParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3UBytesWithUByteParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3UBytesWithUByteParams(
                        property1 = 1u,
                        property2 = 1u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UBytesWithUByteParams(
                        property1 = 1u,
                        property2 = 1u,
                        property3 = 2u,
                    ),
                    SampleDataClass3UBytesWithUByteParams(
                        property1 = 1u,
                        property2 = 2u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UBytesWithUByteParams(
                        property1 = 1u,
                        property2 = 2u,
                        property3 = 2u,
                    ),
                    SampleDataClass3UBytesWithUByteParams(
                        property1 = 2u,
                        property2 = 1u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UBytesWithUByteParams(
                        property1 = 2u,
                        property2 = 1u,
                        property3 = 2u,
                    ),
                    SampleDataClass3UBytesWithUByteParams(
                        property1 = 2u,
                        property2 = 2u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UBytesWithUByteParams(
                        property1 = 2u,
                        property2 = 2u,
                        property3 = 2u,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1UByteWithAllParamsCombinations() {
        assertThat(SampleDataClass1UByteWithAllParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1UByteWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1UByteWithAllParams(
                        property1 = 1u,
                    ),
                    SampleDataClass1UByteWithAllParams(
                        property1 = 2u,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2UBytesWithAllParamsCombinations() {
        assertThat(SampleDataClass2UBytesWithAllParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2UBytesWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2UBytesWithAllParams(
                        property1 = 1u,
                        property2 = 1u,
                    ),
                    SampleDataClass2UBytesWithAllParams(
                        property1 = 1u,
                        property2 = 2u,
                    ),
                    SampleDataClass2UBytesWithAllParams(
                        property1 = 2u,
                        property2 = 1u,
                    ),
                    SampleDataClass2UBytesWithAllParams(
                        property1 = 2u,
                        property2 = 2u,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3UBytesWithAllParamsCombinations() {
        assertThat(SampleDataClass3UBytesWithAllParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3UBytesWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3UBytesWithAllParams(
                        property1 = 1u,
                        property2 = 1u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UBytesWithAllParams(
                        property1 = 1u,
                        property2 = 1u,
                        property3 = 2u,
                    ),
                    SampleDataClass3UBytesWithAllParams(
                        property1 = 1u,
                        property2 = 2u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UBytesWithAllParams(
                        property1 = 1u,
                        property2 = 2u,
                        property3 = 2u,
                    ),
                    SampleDataClass3UBytesWithAllParams(
                        property1 = 2u,
                        property2 = 1u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UBytesWithAllParams(
                        property1 = 2u,
                        property2 = 1u,
                        property3 = 2u,
                    ),
                    SampleDataClass3UBytesWithAllParams(
                        property1 = 2u,
                        property2 = 2u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UBytesWithAllParams(
                        property1 = 2u,
                        property2 = 2u,
                        property3 = 2u,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1UByteWithSomeParamsCombinations() {
        assertThat(SampleDataClass1UByteWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1UByteWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1UByteWithSomeParams(
                        property1 = 1u,
                    ),
                    SampleDataClass1UByteWithSomeParams(
                        property1 = 2u,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2UBytesWithSomeParamsCombinations() {
        assertThat(SampleDataClass2UBytesWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2UBytesWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2UBytesWithSomeParams(
                        property1 = 1u,
                        property2 = 1u,
                    ),
                    SampleDataClass2UBytesWithSomeParams(
                        property1 = 1u,
                        property2 = 2u,
                    ),
                    SampleDataClass2UBytesWithSomeParams(
                        property1 = 2u,
                        property2 = 1u,
                    ),
                    SampleDataClass2UBytesWithSomeParams(
                        property1 = 2u,
                        property2 = 2u,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3UBytesWithSomeParamsCombinations() {
        assertThat(SampleDataClass3UBytesWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3UBytesWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3UBytesWithSomeParams(
                        property1 = 1u,
                        property2 = 1u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UBytesWithSomeParams(
                        property1 = 1u,
                        property2 = 1u,
                        property3 = 2u,
                    ),
                    SampleDataClass3UBytesWithSomeParams(
                        property1 = 1u,
                        property2 = 2u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UBytesWithSomeParams(
                        property1 = 1u,
                        property2 = 2u,
                        property3 = 2u,
                    ),
                    SampleDataClass3UBytesWithSomeParams(
                        property1 = 2u,
                        property2 = 1u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UBytesWithSomeParams(
                        property1 = 2u,
                        property2 = 1u,
                        property3 = 2u,
                    ),
                    SampleDataClass3UBytesWithSomeParams(
                        property1 = 2u,
                        property2 = 2u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UBytesWithSomeParams(
                        property1 = 2u,
                        property2 = 2u,
                        property3 = 2u,
                    ),
                )
            )
        ).isEqualTo(true)
    }
}