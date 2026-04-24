pluginManagement {
    repositories {
        google() // <--- THIS IS THE MISSING KEY
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") } // Required for Markdown libraries
    }
}

rootProject.name = "Catsblock Teaching"
include(":app")
