plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.dokka")
    id("com.vanniktech.maven.publish")
}

apply {
    from("${rootDir}/docs.gradle")
    from("${rootDir}/jvm_compat.gradle")
}

android {
    namespace = "github.nisrulz.shoutout"
    compileSdk = 34

    defaultConfig {
        minSdk = 18

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
}