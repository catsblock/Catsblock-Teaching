package catsblock.teaching

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import catsblock.teaching.ui.screens.LoginScreen
import catsblock.teaching.ui.theme.CatsblockTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CatsblockTheme {
                val navController = rememberNavController()
                
                NavHost(navController = navController, startDestination = "login") {
                    composable("login") { 
                        LoginScreen { navController.navigate("feed") } 
                    }
                    composable("feed") { 
                        // Implementation for FeedScreen goes here
                        Text("Feed Loaded") 
                    }
                }
            }
        }
    }
}

