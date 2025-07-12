package com.sarim.kombinator_app

import com.google.common.truth.Truth.assertThat
import com.sarim.kombinator_app.sample.SampleDataClass1UIntWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass1UIntWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1UIntWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass1UIntWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1UIntWithUIntParams
import com.sarim.kombinator_app.sample.SampleDataClass1UIntWithUIntParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2UIntsWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass2UIntsWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2UIntsWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass2UIntsWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2UIntsWithUIntParams
import com.sarim.kombinator_app.sample.SampleDataClass2UIntsWithUIntParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3UIntsWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass3UIntsWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3UIntsWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass3UIntsWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3UIntsWithUIntParams
import com.sarim.kombinator_app.sample.SampleDataClass3UIntsWithUIntParamsCombinations
import org.junit.Test

class SampleDataClassUIntTest {

    @Test
    fun testSampleDataClass1UIntWithUIntParamsCombinations() {
        assertThat(SampleDataClass1UIntWithUIntParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1UIntWithUIntParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1UIntWithUIntParams(
                        property1 = 1u,
                    ),
                    SampleDataClass1UIntWithUIntParams(
                        property1 = 2u,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2UIntsWithUIntParamsCombinations() {
        assertThat(SampleDataClass2UIntsWithUIntParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2UIntsWithUIntParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2UIntsWithUIntParams(
                        property1 = 1u,
                        property2 = 1u,
                    ),
                    SampleDataClass2UIntsWithUIntParams(
                        property1 = 1u,
                        property2 = 2u,
                    ),
                    SampleDataClass2UIntsWithUIntParams(
                        property1 = 2u,
                        property2 = 1u,
                    ),
                    SampleDataClass2UIntsWithUIntParams(
                        property1 = 2u,
                        property2 = 2u,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3UIntsWithUIntParamsCombinations() {
        assertThat(SampleDataClass3UIntsWithUIntParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3UIntsWithUIntParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3UIntsWithUIntParams(
                        property1 = 1u,
                        property2 = 1u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UIntsWithUIntParams(
                        property1 = 1u,
                        property2 = 1u,
                        property3 = 2u,
                    ),
                    SampleDataClass3UIntsWithUIntParams(
                        property1 = 1u,
                        property2 = 2u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UIntsWithUIntParams(
                        property1 = 1u,
                        property2 = 2u,
                        property3 = 2u,
                    ),
                    SampleDataClass3UIntsWithUIntParams(
                        property1 = 2u,
                        property2 = 1u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UIntsWithUIntParams(
                        property1 = 2u,
                        property2 = 1u,
                        property3 = 2u,
                    ),
                    SampleDataClass3UIntsWithUIntParams(
                        property1 = 2u,
                        property2 = 2u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UIntsWithUIntParams(
                        property1 = 2u,
                        property2 = 2u,
                        property3 = 2u,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1UIntWithAllParamsCombinations() {
        assertThat(SampleDataClass1UIntWithAllParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1UIntWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1UIntWithAllParams(
                        property1 = 1u,
                    ),
                    SampleDataClass1UIntWithAllParams(
                        property1 = 2u,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2UIntsWithAllParamsCombinations() {
        assertThat(SampleDataClass2UIntsWithAllParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2UIntsWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2UIntsWithAllParams(
                        property1 = 1u,
                        property2 = 1u,
                    ),
                    SampleDataClass2UIntsWithAllParams(
                        property1 = 1u,
                        property2 = 2u,
                    ),
                    SampleDataClass2UIntsWithAllParams(
                        property1 = 2u,
                        property2 = 1u,
                    ),
                    SampleDataClass2UIntsWithAllParams(
                        property1 = 2u,
                        property2 = 2u,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3UIntsWithAllParamsCombinations() {
        assertThat(SampleDataClass3UIntsWithAllParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3UIntsWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3UIntsWithAllParams(
                        property1 = 1u,
                        property2 = 1u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UIntsWithAllParams(
                        property1 = 1u,
                        property2 = 1u,
                        property3 = 2u,
                    ),
                    SampleDataClass3UIntsWithAllParams(
                        property1 = 1u,
                        property2 = 2u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UIntsWithAllParams(
                        property1 = 1u,
                        property2 = 2u,
                        property3 = 2u,
                    ),
                    SampleDataClass3UIntsWithAllParams(
                        property1 = 2u,
                        property2 = 1u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UIntsWithAllParams(
                        property1 = 2u,
                        property2 = 1u,
                        property3 = 2u,
                    ),
                    SampleDataClass3UIntsWithAllParams(
                        property1 = 2u,
                        property2 = 2u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UIntsWithAllParams(
                        property1 = 2u,
                        property2 = 2u,
                        property3 = 2u,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1UIntWithSomeParamsCombinations() {
        assertThat(SampleDataClass1UIntWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1UIntWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1UIntWithSomeParams(
                        property1 = 1u,
                    ),
                    SampleDataClass1UIntWithSomeParams(
                        property1 = 2u,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2UIntsWithSomeParamsCombinations() {
        assertThat(SampleDataClass2UIntsWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2UIntsWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2UIntsWithSomeParams(
                        property1 = 1u,
                        property2 = 1u,
                    ),
                    SampleDataClass2UIntsWithSomeParams(
                        property1 = 1u,
                        property2 = 2u,
                    ),
                    SampleDataClass2UIntsWithSomeParams(
                        property1 = 2u,
                        property2 = 1u,
                    ),
                    SampleDataClass2UIntsWithSomeParams(
                        property1 = 2u,
                        property2 = 2u,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3UIntsWithSomeParamsCombinations() {
        assertThat(SampleDataClass3UIntsWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3UIntsWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3UIntsWithSomeParams(
                        property1 = 1u,
                        property2 = 1u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UIntsWithSomeParams(
                        property1 = 1u,
                        property2 = 1u,
                        property3 = 2u,
                    ),
                    SampleDataClass3UIntsWithSomeParams(
                        property1 = 1u,
                        property2 = 2u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UIntsWithSomeParams(
                        property1 = 1u,
                        property2 = 2u,
                        property3 = 2u,
                    ),
                    SampleDataClass3UIntsWithSomeParams(
                        property1 = 2u,
                        property2 = 1u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UIntsWithSomeParams(
                        property1 = 2u,
                        property2 = 1u,
                        property3 = 2u,
                    ),
                    SampleDataClass3UIntsWithSomeParams(
                        property1 = 2u,
                        property2 = 2u,
                        property3 = 1u,
                    ),
                    SampleDataClass3UIntsWithSomeParams(
                        property1 = 2u,
                        property2 = 2u,
                        property3 = 2u,
                    ),
                )
            )
        ).isEqualTo(true)
    }
}