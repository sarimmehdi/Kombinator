package com.sarim.kombinator_app

import com.google.common.truth.Truth.assertThat
import com.sarim.kombinator_app.sample.SampleDataClass1ByteWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass1ByteWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1ByteWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass1ByteWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass1ByteWithByteParams
import com.sarim.kombinator_app.sample.SampleDataClass1ByteWithByteParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2BytesWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass2BytesWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2BytesWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass2BytesWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass2BytesWithByteParams
import com.sarim.kombinator_app.sample.SampleDataClass2BytesWithByteParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3BytesWithAllParams
import com.sarim.kombinator_app.sample.SampleDataClass3BytesWithAllParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3BytesWithSomeParams
import com.sarim.kombinator_app.sample.SampleDataClass3BytesWithSomeParamsCombinations
import com.sarim.kombinator_app.sample.SampleDataClass3BytesWithByteParams
import com.sarim.kombinator_app.sample.SampleDataClass3BytesWithByteParamsCombinations
import org.junit.Test

class SampleDataClassByteTest {

    @Test
    fun testSampleDataClass1ByteWithByteParamsCombinations() {
        assertThat(SampleDataClass1ByteWithByteParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1ByteWithByteParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1ByteWithByteParams(
                        property1 = 1,
                    ),
                    SampleDataClass1ByteWithByteParams(
                        property1 = 2,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2BytesWithByteParamsCombinations() {
        assertThat(SampleDataClass2BytesWithByteParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2BytesWithByteParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2BytesWithByteParams(
                        property1 = 1,
                        property2 = 1,
                    ),
                    SampleDataClass2BytesWithByteParams(
                        property1 = 1,
                        property2 = 2,
                    ),
                    SampleDataClass2BytesWithByteParams(
                        property1 = 2,
                        property2 = 1,
                    ),
                    SampleDataClass2BytesWithByteParams(
                        property1 = 2,
                        property2 = 2,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3BytesWithByteParamsCombinations() {
        assertThat(SampleDataClass3BytesWithByteParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3BytesWithByteParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3BytesWithByteParams(
                        property1 = 1,
                        property2 = 1,
                        property3 = 1,
                    ),
                    SampleDataClass3BytesWithByteParams(
                        property1 = 1,
                        property2 = 1,
                        property3 = 2,
                    ),
                    SampleDataClass3BytesWithByteParams(
                        property1 = 1,
                        property2 = 2,
                        property3 = 1,
                    ),
                    SampleDataClass3BytesWithByteParams(
                        property1 = 1,
                        property2 = 2,
                        property3 = 2,
                    ),
                    SampleDataClass3BytesWithByteParams(
                        property1 = 2,
                        property2 = 1,
                        property3 = 1,
                    ),
                    SampleDataClass3BytesWithByteParams(
                        property1 = 2,
                        property2 = 1,
                        property3 = 2,
                    ),
                    SampleDataClass3BytesWithByteParams(
                        property1 = 2,
                        property2 = 2,
                        property3 = 1,
                    ),
                    SampleDataClass3BytesWithByteParams(
                        property1 = 2,
                        property2 = 2,
                        property3 = 2,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1ByteWithAllParamsCombinations() {
        assertThat(SampleDataClass1ByteWithAllParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1ByteWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1ByteWithAllParams(
                        property1 = 1,
                    ),
                    SampleDataClass1ByteWithAllParams(
                        property1 = 2,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2BytesWithAllParamsCombinations() {
        assertThat(SampleDataClass2BytesWithAllParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2BytesWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2BytesWithAllParams(
                        property1 = 1,
                        property2 = 1,
                    ),
                    SampleDataClass2BytesWithAllParams(
                        property1 = 1,
                        property2 = 2,
                    ),
                    SampleDataClass2BytesWithAllParams(
                        property1 = 2,
                        property2 = 1,
                    ),
                    SampleDataClass2BytesWithAllParams(
                        property1 = 2,
                        property2 = 2,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3BytesWithAllParamsCombinations() {
        assertThat(SampleDataClass3BytesWithAllParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3BytesWithAllParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3BytesWithAllParams(
                        property1 = 1,
                        property2 = 1,
                        property3 = 1,
                    ),
                    SampleDataClass3BytesWithAllParams(
                        property1 = 1,
                        property2 = 1,
                        property3 = 2,
                    ),
                    SampleDataClass3BytesWithAllParams(
                        property1 = 1,
                        property2 = 2,
                        property3 = 1,
                    ),
                    SampleDataClass3BytesWithAllParams(
                        property1 = 1,
                        property2 = 2,
                        property3 = 2,
                    ),
                    SampleDataClass3BytesWithAllParams(
                        property1 = 2,
                        property2 = 1,
                        property3 = 1,
                    ),
                    SampleDataClass3BytesWithAllParams(
                        property1 = 2,
                        property2 = 1,
                        property3 = 2,
                    ),
                    SampleDataClass3BytesWithAllParams(
                        property1 = 2,
                        property2 = 2,
                        property3 = 1,
                    ),
                    SampleDataClass3BytesWithAllParams(
                        property1 = 2,
                        property2 = 2,
                        property3 = 2,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass1ByteWithSomeParamsCombinations() {
        assertThat(SampleDataClass1ByteWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(2)
        assertThat(
            SampleDataClass1ByteWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass1ByteWithSomeParams(
                        property1 = 1,
                    ),
                    SampleDataClass1ByteWithSomeParams(
                        property1 = 2,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass2BytesWithSomeParamsCombinations() {
        assertThat(SampleDataClass2BytesWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(4)
        assertThat(
            SampleDataClass2BytesWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass2BytesWithSomeParams(
                        property1 = 1,
                        property2 = 1,
                    ),
                    SampleDataClass2BytesWithSomeParams(
                        property1 = 1,
                        property2 = 2,
                    ),
                    SampleDataClass2BytesWithSomeParams(
                        property1 = 2,
                        property2 = 1,
                    ),
                    SampleDataClass2BytesWithSomeParams(
                        property1 = 2,
                        property2 = 2,
                    ),
                )
            )
        ).isEqualTo(true)
    }

    @Test
    fun testSampleDataClass3BytesWithSomeParamsCombinations() {
        assertThat(SampleDataClass3BytesWithSomeParamsCombinations.getAllCombinations().size).isEqualTo(8)
        assertThat(
            SampleDataClass3BytesWithSomeParamsCombinations.getAllCombinations().containsAll(
                listOf(
                    SampleDataClass3BytesWithSomeParams(
                        property1 = 1,
                        property2 = 1,
                        property3 = 1,
                    ),
                    SampleDataClass3BytesWithSomeParams(
                        property1 = 1,
                        property2 = 1,
                        property3 = 2,
                    ),
                    SampleDataClass3BytesWithSomeParams(
                        property1 = 1,
                        property2 = 2,
                        property3 = 1,
                    ),
                    SampleDataClass3BytesWithSomeParams(
                        property1 = 1,
                        property2 = 2,
                        property3 = 2,
                    ),
                    SampleDataClass3BytesWithSomeParams(
                        property1 = 2,
                        property2 = 1,
                        property3 = 1,
                    ),
                    SampleDataClass3BytesWithSomeParams(
                        property1 = 2,
                        property2 = 1,
                        property3 = 2,
                    ),
                    SampleDataClass3BytesWithSomeParams(
                        property1 = 2,
                        property2 = 2,
                        property3 = 1,
                    ),
                    SampleDataClass3BytesWithSomeParams(
                        property1 = 2,
                        property2 = 2,
                        property3 = 2,
                    ),
                )
            )
        ).isEqualTo(true)
    }
}