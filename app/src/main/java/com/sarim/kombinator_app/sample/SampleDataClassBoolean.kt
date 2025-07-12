package com.sarim.kombinator_app.sample

import com.sarim.kombinator.Kombine

@Kombine
data class SampleDataClass1Boolean(
    val property1: Boolean,
)

@Kombine
data class SampleDataClass2Booleans(
    val property1: Boolean,
    val property2: Boolean,
)

@Kombine
data class SampleDataClass3Booleans(
    val property1: Boolean,
    val property2: Boolean,
    val property3: Boolean,
)

@Kombine(
    allPossibleStringParams = ["abc", "cde"]
)
data class SampleDataClass1BooleanWithStringParams(
    val property1: Boolean,
)

@Kombine(
    allPossibleStringParams = ["abc", "cde"]
)
data class SampleDataClass2BooleansWithStringParams(
    val property1: Boolean,
    val property2: Boolean,
)

@Kombine(
    allPossibleStringParams = ["abc", "cde"]
)
data class SampleDataClass3BooleansWithStringParams(
    val property1: Boolean,
    val property2: Boolean,
    val property3: Boolean,
)

@Kombine(
    allPossibleIntParams = [1, 2]
)
data class SampleDataClass1BooleanWithIntParams(
    val property1: Boolean,
)

@Kombine(
    allPossibleIntParams = [1, 2]
)
data class SampleDataClass2BooleansWithIntParams(
    val property1: Boolean,
    val property2: Boolean,
)

@Kombine(
    allPossibleIntParams = [1, 2]
)
data class SampleDataClass3BooleansWithIntParams(
    val property1: Boolean,
    val property2: Boolean,
    val property3: Boolean,
)

@Kombine(
    allPossibleFloatParams = [1f, 2f]
)
data class SampleDataClass1BooleanWithFloatParams(
    val property1: Boolean,
)

@Kombine(
    allPossibleFloatParams = [1f, 2f]
)
data class SampleDataClass2BooleansWithFloatParams(
    val property1: Boolean,
    val property2: Boolean,
)

@Kombine(
    allPossibleFloatParams = [1f, 2f]
)
data class SampleDataClass3BooleansWithFloatParams(
    val property1: Boolean,
    val property2: Boolean,
    val property3: Boolean,
)

@Kombine(
    allPossibleDoubleParams = [1.0, 2.0]
)
data class SampleDataClass1BooleanWithDoubleParams(
    val property1: Boolean,
)

@Kombine(
    allPossibleDoubleParams = [1.0, 2.0]
)
data class SampleDataClass2BooleansWithDoubleParams(
    val property1: Boolean,
    val property2: Boolean,
)

@Kombine(
    allPossibleDoubleParams = [1.0, 2.0]
)
data class SampleDataClass3BooleansWithDoubleParams(
    val property1: Boolean,
    val property2: Boolean,
    val property3: Boolean,
)

@Kombine(
    allPossibleLongParams = [1, 2]
)
data class SampleDataClass1BooleanWithLongParams(
    val property1: Boolean,
)

@Kombine(
    allPossibleLongParams = [1, 2]
)
data class SampleDataClass2BooleansWithLongParams(
    val property1: Boolean,
    val property2: Boolean,
)

@Kombine(
    allPossibleLongParams = [1, 2]
)
data class SampleDataClass3BooleansWithLongParams(
    val property1: Boolean,
    val property2: Boolean,
    val property3: Boolean,
)

@Kombine(
    allPossibleByteParams = [1, 2]
)
data class SampleDataClass1BooleanWithByteParams(
    val property1: Boolean,
)

@Kombine(
    allPossibleByteParams = [1, 2]
)
data class SampleDataClass2BooleansWithByteParams(
    val property1: Boolean,
    val property2: Boolean,
)

@Kombine(
    allPossibleByteParams = [1, 2]
)
data class SampleDataClass3BooleansWithByteParams(
    val property1: Boolean,
    val property2: Boolean,
    val property3: Boolean,
)

@Kombine(
    allPossibleCharParams = ['1', '2']
)
data class SampleDataClass1BooleanWithCharParams(
    val property1: Boolean,
)

@Kombine(
    allPossibleCharParams = ['1', '2']
)
data class SampleDataClass2BooleansWithCharParams(
    val property1: Boolean,
    val property2: Boolean,
)

@Kombine(
    allPossibleCharParams = ['1', '2']
)
data class SampleDataClass3BooleansWithCharParams(
    val property1: Boolean,
    val property2: Boolean,
    val property3: Boolean,
)

@Kombine(
    allPossibleShortParams = [1, 2]
)
data class SampleDataClass1BooleanWithShortParams(
    val property1: Boolean,
)

@Kombine(
    allPossibleShortParams = [1, 2]
)
data class SampleDataClass2BooleansWithShortParams(
    val property1: Boolean,
    val property2: Boolean,
)

@Kombine(
    allPossibleShortParams = [1, 2]
)
data class SampleDataClass3BooleansWithShortParams(
    val property1: Boolean,
    val property2: Boolean,
    val property3: Boolean,
)

@Kombine(
    allPossibleUByteParams = [1u, 2u]
)
data class SampleDataClass1BooleanWithUByteParams(
    val property1: Boolean,
)

@Kombine(
    allPossibleUByteParams = [1u, 2u]
)
data class SampleDataClass2BooleansWithUByteParams(
    val property1: Boolean,
    val property2: Boolean,
)

@Kombine(
    allPossibleUByteParams = [1u, 2u]
)
data class SampleDataClass3BooleansWithUByteParams(
    val property1: Boolean,
    val property2: Boolean,
    val property3: Boolean,
)

@Kombine(
    allPossibleUShortParams = [1u, 2u]
)
data class SampleDataClass1BooleanWithUShortParams(
    val property1: Boolean,
)

@Kombine(
    allPossibleUShortParams = [1u, 2u]
)
data class SampleDataClass2BooleansWithUShortParams(
    val property1: Boolean,
    val property2: Boolean,
)

@Kombine(
    allPossibleUShortParams = [1u, 2u]
)
data class SampleDataClass3BooleansWithUShortParams(
    val property1: Boolean,
    val property2: Boolean,
    val property3: Boolean,
)

@Kombine(
    allPossibleUIntParams = [1u, 2u]
)
data class SampleDataClass1BooleanWithUIntParams(
    val property1: Boolean,
)

@Kombine(
    allPossibleUIntParams = [1u, 2u]
)
data class SampleDataClass2BooleansWithUIntParams(
    val property1: Boolean,
    val property2: Boolean,
)

@Kombine(
    allPossibleUIntParams = [1u, 2u]
)
data class SampleDataClass3BooleansWithUIntParams(
    val property1: Boolean,
    val property2: Boolean,
    val property3: Boolean,
)

@Kombine(
    allPossibleULongParams = [1u, 2u]
)
data class SampleDataClass1BooleanWithULongParams(
    val property1: Boolean,
)

@Kombine(
    allPossibleULongParams = [1u, 2u]
)
data class SampleDataClass2BooleansWithULongParams(
    val property1: Boolean,
    val property2: Boolean,
)

@Kombine(
    allPossibleULongParams = [1u, 2u]
)
data class SampleDataClass3BooleansWithULongParams(
    val property1: Boolean,
    val property2: Boolean,
    val property3: Boolean,
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
    allPossibleUByteParams = [1u, 2u],
    allPossibleUShortParams = [1u, 2u],
    allPossibleUIntParams = [1u, 2u],
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass1BooleanWithAllParams(
    val property1: Boolean,
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
    allPossibleUByteParams = [1u, 2u],
    allPossibleUShortParams = [1u, 2u],
    allPossibleUIntParams = [1u, 2u],
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass2BooleansWithAllParams(
    val property1: Boolean,
    val property2: Boolean,
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
    allPossibleUByteParams = [1u, 2u],
    allPossibleUShortParams = [1u, 2u],
    allPossibleUIntParams = [1u, 2u],
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass3BooleansWithAllParams(
    val property1: Boolean,
    val property2: Boolean,
    val property3: Boolean,
)

@Kombine(
    allPossibleStringParams = ["abc", "cde"],
    allPossibleLongParams = [1, 2],
    allPossibleCharParams = ['1', '2'],
    allPossibleShortParams = [1, 2],
    allPossibleUByteParams = [1u, 2u],
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass1BooleanWithSomeParams(
    val property1: Boolean,
)

@Kombine(
    allPossibleStringParams = ["abc", "cde"],
    allPossibleCharParams = ['1', '2'],
    allPossibleShortParams = [1, 2],
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass2BooleansWithSomeParams(
    val property1: Boolean,
    val property2: Boolean,
)

@Kombine(
    allPossibleStringParams = ["abc", "cde"],
    allPossibleIntParams = [1, 2],
    allPossibleFloatParams = [1f, 2f],
    allPossibleDoubleParams = [1.0, 2.0],
    allPossibleShortParams = [1, 2],
    allPossibleUByteParams = [1u, 2u],
    allPossibleULongParams = [1u, 2u],
)
data class SampleDataClass3BooleansWithSomeParams(
    val property1: Boolean,
    val property2: Boolean,
    val property3: Boolean,
)
