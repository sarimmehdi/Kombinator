package com.sarim.kombinator

@Kombine
data class SampleDataClass(
    val property1: Boolean,
    val property2: Boolean,
    val property3: Boolean
)

@Target(AnnotationTarget.CLASS)
@MustBeDocumented
annotation class Kombine