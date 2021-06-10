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
##### app build.gradle
```
plugins {
    id 'com.android.application'
    id 'kotlin-android'
    id 'kotlin-kapt'
}

android {
    compileSdkVersion 30
    buildToolsVersion "30.0.3"

    defaultConfig {
        applicationId ${yourApplicationId}
        minSdkVersion 21
        targetSdkVersion 30
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
}
```
