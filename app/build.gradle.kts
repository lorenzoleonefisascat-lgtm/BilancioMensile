plugins {
    id("com.android.application")
}

android {
    namespace = "it.bilanciomensile.app"
    compileSdk = 35

    defaultConfig {
        applicationId = "it.bilanciomensile.app"
        minSdk = 24
        targetSdk = 35
        versionCode = 100
        versionName = "1.0.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}
