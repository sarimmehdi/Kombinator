plugins {
    id("java-library")
    alias(libs.plugins.jetbrainsKotlinJvmPlugin)
}
java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}
kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_21
    }
}

dependencies {
    implementation(libs.kotlinPoetLibrary)
    implementation(libs.kotlinPoetKspLibrary)
    implementation(libs.kspApiLibrary)
}
