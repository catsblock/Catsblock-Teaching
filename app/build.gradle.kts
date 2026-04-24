plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
}

android {
    namespace = "catsblock.teaching"
    compileSdk = 34

    defaultConfig {
        applicationId = "catsblock.teaching"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures { compose = true }
    
    composeOptions { 
        // 1.5.10 is required for Kotlin 1.9.22 compatibility
        kotlinCompilerExtensionVersion = "1.5.10" 
    }
    
    // Highly recommended to add this to avoid Java version conflicts
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(platform("com.google.firebase:firebase-bom:33.1.0")) // Updated BoM
    implementation("com.google.firebase:firebase-auth-ktx")
    implementation("com.google.firebase:firebase-firestore-ktx")
    implementation("com.google.firebase:firebase-analytics-ktx")

    implementation("androidx.compose.material3:material3:1.2.1")
    implementation("androidx.navigation:navigation-compose:2.7.7")
    
    implementation("com.github.jeziellago:compose-markdown:0.3.1")
}
