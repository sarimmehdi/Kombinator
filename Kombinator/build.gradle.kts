import org.jlleitschuh.gradle.ktlint.reporter.ReporterType

plugins {
    id("java-library")
    alias(libs.plugins.jetbrainsKotlinJvmPlugin)
    alias(libs.plugins.ktlintPlugin)
    alias(libs.plugins.detektPlugin)
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

ktlint {
    ignoreFailures = false
    reporters {
        reporter(ReporterType.PLAIN)
        reporter(ReporterType.CHECKSTYLE)
        reporter(ReporterType.SARIF)
    }
}
