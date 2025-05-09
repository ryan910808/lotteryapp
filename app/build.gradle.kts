plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.example.lotteryapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.lotteryapp"
        minSdk = 24
        targetSdk = 35
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures {
        compose = true
    }
}

dependencies {
    // AppCompat - 用於 AppCompatActivity
    implementation("androidx.appcompat:appcompat:1.4.1")

    // Core 和 Lifecycle 库
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)

    // Jetpack Compose 相關依賴
    implementation(platform(libs.androidx.compose.bom)) // 這會同步對應版本的 Jetpack Compose 库
    implementation(libs.androidx.ui) // 用於 Compose UI
    implementation(libs.androidx.ui.graphics) // 用於 Compose Graphics
    implementation(libs.androidx.ui.tooling.preview) // 用於 Compose 預覽功能
    implementation(libs.androidx.material3) // 用於 Material3 組件

    // Activity Compose
    implementation(libs.androidx.activity.compose)

    // Material Components - 如果你還需要使用 Material 库
    implementation("com.google.android.material:material:1.4.0") // 如果你需要 Material 库支持，可以加入這一行

    // 測試相關依賴
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)

    // Debug 工具
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}
