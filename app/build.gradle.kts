plugins { // Ensure this is lowercase
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
}

dependencies {
    implementation(platform("com.google.firebase:firebase-bom:33.1.0"))
    implementation("com.google.firebase:firebase-auth-ktx")
    implementation("com.google.firebase:firebase-firestore-ktx")
    implementation("com.google.firebase:firebase-analytics-ktx")

    implementation("androidx.compose.material3:material3:1.2.1")
    implementation("androidx.navigation:navigation-compose:2.7.7")
    implementation("androidx.appcompat:appcompat:1.6.1") // Force-adding this here too
    
    implementation("com.github.jeziellago:compose-markdown:0.4.1")
}

configurations.all {
    resolutionStrategy {
        // These 4 are the ones causing your "Build Failed" logs
        force("androidx.appcompat:appcompat:1.6.1")
        force("androidx.core:core-ktx:1.12.0")
        force("androidx.drawerlayout:drawerlayout:1.2.0")
        force("androidx.emoji2:emoji2:1.4.0")
    }
}
