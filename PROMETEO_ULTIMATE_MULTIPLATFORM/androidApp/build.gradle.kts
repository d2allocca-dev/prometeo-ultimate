plugins {
    id("com.android.application")
    kotlin("android")
    id("org.jetbrains.compose")
    kotlin("plugin.compose")
}
android {
    namespace = "it.prometeo.ultimate"
    compileSdk = 35
    defaultConfig {
        applicationId = "it.prometeo.ultimate"
        minSdk = 26
        targetSdk = 35
        versionCode = 7
        versionName = "0.10.1-dev"
    }
    buildFeatures { compose = true }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
kotlin { jvmToolchain(17) }
dependencies {
    implementation(project(":shared"))
    implementation("androidx.activity:activity-compose:1.10.0")
}
