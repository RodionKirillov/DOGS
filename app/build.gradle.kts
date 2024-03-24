plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.example.dogs"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.dogs"
        minSdk = 24
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    //Конвертер для работы RxJava с Retrofit
    implementation ("com.squareup.retrofit2:adapter-rxjava3:2.9.0")

    //Gson
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

    //Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")

    //Glide
    implementation ("com.github.bumptech.glide:glide:4.16.0")

    //RxJava
    implementation ("io.reactivex.rxjava3:rxandroid:3.0.2")
    // Because RxAndroid releases are few and far between, it is recommended you also
    // explicitly depend on RxJava's latest version for bug fixes and new features.
    // (see https://github.com/ReactiveX/RxJava/releases for latest 3.x.x version)
    implementation ("io.reactivex.rxjava3:rxjava:3.1.5")

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}