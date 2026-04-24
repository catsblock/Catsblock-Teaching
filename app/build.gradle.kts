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
        // Correct version for Kotlin 1.9.22
        kotlinCompilerExtensionVersion = "1.5.10" 
    }
    
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    // Updated Firebase to match 2026 standards
    implementation(platform("com.google.firebase:firebase-bom:33.1.0"))
    implementation("com.google.firebase:firebase-auth-ktx")
    implementation("com.google.firebase:firebase-firestore-ktx")
    implementation("com.google.firebase:firebase-analytics-ktx")

    // UI & Navigation
    implementation("androidx.compose.material3:material3:1.2.1")
    implementation("androidx.navigation:navigation-compose:2.7.7")
    
    // Markdown - Updated to 0.4.1 to avoid the version crash you saw earlier
    implementation("com.github.jeziellago:compose-markdown:0.4.1")
}

// CRITICAL: Add this to prevent the "HasConvention" or version clash errors
configurations.all {
    resolutionStrategy {
        force("androidx.emoji2:emoji2:1.4.0")
        force("androidx.core:core-ktx:1.12.0")
    }
}
