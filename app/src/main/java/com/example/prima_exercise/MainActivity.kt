package com.example.prima_exercise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.prima_exercise.navigation.Countries
import com.example.prima_exercise.ui.theme.PrimaexerciseTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrimaexerciseTheme {
                val navController = rememberNavController()
                NavHost(navController, startDestination = Countries.Home.route) {
                    composable(Countries.Home.route) { Home(navController) }
                    composable(Countries.Details.route) { Details(navController) }
                }
            }
        }
    }
}