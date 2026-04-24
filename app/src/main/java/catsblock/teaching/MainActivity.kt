package catsblock.teaching

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
// CRITICAL: Updated to match your exact folder structure
import catsblock.teaching.screens.LoginScreen 
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
                        Text("Feed Loaded") 
                    }
                }
            }
        }
    }
}
