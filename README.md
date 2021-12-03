# base-library

<br/>

### References
https://github.com/sjjeong/dino-library

<br/>

### How to use
#### 1. Add this repository as submodule on your project.
#### 2. Set 'settings.gradle' and sync gradle
##### project settings.gradle
```
include ':app'
include ':base-library'
```
#### 3. Set 'project build.gradle' and sync gradle
##### project build.gradle
```
// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    apply from: 'base-library/versions.gradle'
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath deps.classpath.gradle
        classpath deps.classpath.kotlin
        classpath deps.classpath.hilt

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

task clean(type: Delete) {
    delete rootProject.buildDir
}
```
##### app build.gradle
```
plugins {
    id 'com.android.application'
    id 'kotlin-android'
    id 'kotlin-kapt'
    id 'dagger.hilt.android.plugin'
}

android {
    compileSdk versions.compile_sdk_version

    defaultConfig {
        applicationId ${yourApplicationId}
        minSdk versions.min_sdk_version
        targetSdk versions.target_sdk_version
        versionCode 1
        versionName "1.0"

        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = '1.8'
    }
    buildFeatures {
        dataBinding true
    }
}

dependencies {
    implementation project(':base-library')

    implementation deps.hilt.android
    kapt deps.hilt.compiler
}
```
