import org.jlleitschuh.gradle.ktlint.reporter.ReporterType

plugins {
    id("java-library")
    alias(libs.plugins.jetbrainsKotlinJvmPlugin)
    alias(libs.plugins.ktlintPlugin)
    alias(libs.plugins.detektPlugin)
    alias(libs.plugins.vanniktechMavenPublishingPlugin)
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

mavenPublishing {
    publishToMavenCentral()

    signAllPublications()

    coordinates("io.github.sarimmehdi", "kombinator", "1.0.0")

    pom {
        name = "Kombinator"
        description = "A library for generating all possible data class objects based on its parameters"
        inceptionYear = "2025"
        url = "https://github.com/sarimmehdi/Kombinator"
        licenses {
            license {
                name = "The Apache License, Version 2.0"
                url = "https://www.apache.org/licenses/LICENSE-2.0.txt"
                distribution = "https://www.apache.org/licenses/LICENSE-2.0.txt"
            }
        }
        developers {
            developer {
                id = "sarimmehdi"
                name = "Muhammad Sarim Mehdi"
                url = "https://github.com/sarimmehdi"
            }
        }
        scm {
            url = "https://github.com/sarimmehdi/Kombinator"
            connection = "scm:git:git://github.com/sarimmehdi/Kombinator.git"
            developerConnection = "scm:git:ssh://git@github.com/sarimmehdi/Kombinator.git"
        }
    }
}
