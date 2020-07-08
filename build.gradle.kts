plugins {
    id("com.android.application") version "3.6.3"
    kotlin("android") version "1.3.72"
}

repositories {
    mavenCentral()
    jcenter()
    google()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.7")
}

android {
    compileSdkVersion(30)
    buildToolsVersion = "30.0.0"

    defaultConfig {
        minSdkVersion(23)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
    }

    sourceSets["main"].java.srcDir("src/main/kotlin")

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_7
        targetCompatibility = JavaVersion.VERSION_1_7
    }
}
