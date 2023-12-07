plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

apply {
    from("${rootDir}/jvm_compat.gradle")
}

android {
    namespace = "github.nisrulz.projectshoutout"
    compileSdk = 34

    defaultConfig {
        applicationId = "github.nisrulz.projectshoutout"
        minSdk = 18
        targetSdk = 34
        versionCode = 1
        versionName = "1.0.0"

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

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")

    // SDK
    // implementation 'com.github.nisrulz:shoutout:1.4.4'
    implementation(project(":shoutout"))
}