package com.sarim.kombinator_app.sample

import com.sarim.kombinator.Kombine

@Kombine(
    allPossibleByteParams = [1, 2],
)
data class SampleDataClass1ByteWithByteParams(
    val property1: Byte,
)

@Kombine(
    allPossibleByteParams = [1, 2],
)
data class SampleDataClass2BytesWithByteParams(
    val property1: Byte,
    val property2: Byte,
)

@Kombine(
    allPossibleByteParams = [1, 2],
)
data class SampleDataClass3BytesWithByteParams(
    val property1: Byte,
    val property2: Byte,
    val property3: Byte,
)

@Kombine(
    allPossibleStringParams = ["abc", "cde"],
    allPossibleIntParams = [1, 2],
    allPossibleFloatParams = [1f, 2f],
    allPossibleDoubleParams = [1.0, 2.0],
    allPossibleLongParams = [1, 2],
    allPossibleByteParams = [1, 2],
    allPossibleCharParams = ['1', '2'],
    allPossibleShortParams = [1, 2],
    allPossibleULongParams = [1u, 2u],
    allPossibleUShortParams = [1u, 2u],
    allPossibleUIntParams = [1u, 2u],
    allPossibleUByteParams = [1u, 2u],
)
data class SampleDataClass1ByteWithAllParams(
    val property1: Byte,
)

@Kombine(
    allPossibleStringParams = ["abc", "cde"],
    allPossibleIntParams = [1, 2],
    allPossibleFloatParams = [1f, 2f],
    allPossibleDoubleParams = [1.0, 2.0],
    allPossibleLongParams = [1, 2],
    allPossibleByteParams = [1, 2],
    allPossibleCharParams = ['1', '2'],
    allPossibleShortParams = [1, 2],
    allPossibleULongParams = [1u, 2u],
    allPossibleUShortParams = [1u, 2u],
    allPossibleUIntParams = [1u, 2u],
    allPossibleUByteParams = [1u, 2u],
)
data class SampleDataClass2BytesWithAllParams(
    val property1: Byte,
    val property2: Byte,
)

@Kombine(
    allPossibleStringParams = ["abc", "cde"],
    allPossibleIntParams = [1, 2],
    allPossibleFloatParams = [1f, 2f],
    allPossibleDoubleParams = [1.0, 2.0],
    allPossibleLongParams = [1, 2],
    allPossibleByteParams = [1, 2],
    allPossibleCharParams = ['1', '2'],
    allPossibleShortParams = [1, 2],
    allPossibleULongParams = [1u, 2u],
    allPossibleUShortParams = [1u, 2u],
    allPossibleUIntParams = [1u, 2u],
    allPossibleUByteParams = [1u, 2u],
)
data class SampleDataClass3BytesWithAllParams(
    val property1: Byte,
    val property2: Byte,
    val property3: Byte,
)

@Kombine(
    allPossibleDoubleParams = [1.0, 2.0],
    allPossibleByteParams = [1, 2],
    allPossibleCharParams = ['1', '2'],
    allPossibleShortParams = [1, 2],
    allPossibleULongParams = [1u, 2u],
    allPossibleUByteParams = [1u, 2u],
)
data class SampleDataClass1ByteWithSomeParams(
    val property1: Byte,
)

@Kombine(
    allPossibleByteParams = [1, 2],
    allPossibleCharParams = ['1', '2'],
    allPossibleShortParams = [1, 2],
    allPossibleUByteParams = [1u, 2u],
)
data class SampleDataClass2BytesWithSomeParams(
    val property1: Byte,
    val property2: Byte,
)

@Kombine(
    allPossibleStringParams = ["abc", "cde"],
    allPossibleIntParams = [1, 2],
    allPossibleFloatParams = [1f, 2f],
    allPossibleByteParams = [1, 2],
    allPossibleShortParams = [1, 2],
    allPossibleULongParams = [1u, 2u],
    allPossibleUByteParams = [1u, 2u],
)
data class SampleDataClass3BytesWithSomeParams(
    val property1: Byte,
    val property2: Byte,
    val property3: Byte,
)
