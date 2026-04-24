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
        kotlinCompilerExtensionVersion = "1.5.10" 
    }
    
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    // NEW: This tells Gradle how to handle duplicate files
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
            merges += "META-INF/LICENSE*"
        }
    }
}

dependencies {
    implementation(platform("com.google.firebase:firebase-bom:33.1.0"))
    implementation("com.google.firebase:firebase-auth-ktx")
    implementation("com.google.firebase:firebase-firestore-ktx")
    implementation("com.google.firebase:firebase-analytics-ktx")

    implementation("androidx.compose.material3:material3:1.2.1")
    implementation("androidx.navigation:navigation-compose:2.7.7")
    
    // We're switching to a more modern Markdown library that doesn't 
    // drag in all those old appcompat problems.
    implementation("dev.jeziellago:compose-markdown:0.5.0")
}

configurations.all {
    resolutionStrategy {
        force("androidx.core:core-ktx:1.12.0")
        force("androidx.appcompat:appcompat:1.6.1")
    }
}
