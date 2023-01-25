package com.example.prima_exercise.navigation

sealed class Countries(val route: String) {
    object Home : Countries("home")
    object Details : Countries("details")
}