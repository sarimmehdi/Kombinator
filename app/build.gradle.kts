plugins {
    alias(libs.plugins.androidApplicationPlugin)
    alias(libs.plugins.kotlinAndroidPlugin)
    alias(libs.plugins.kspPlugin)
}

android {
    namespace = "com.sarim.kombinator_app"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.sarim.kombinator_app"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
    kotlin {
        compilerOptions {
            jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_21)
        }
    }
}

dependencies {

    testImplementation(libs.junitLibrary)
    testImplementation(libs.truthLibrary)
    testImplementation(libs.assertJLibrary)
    implementation(project(":Kombinator"))
    ksp(project(":Kombinator"))
}