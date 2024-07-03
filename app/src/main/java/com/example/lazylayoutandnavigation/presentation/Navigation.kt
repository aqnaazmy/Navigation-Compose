package com.example.lazylayoutandnavigation.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ){
        val navController = rememberNavController()
        Scaffold(
            bottomBar = {
                ButtomNav(navHostController = navController)
            }
        ) {
            it
            MyNavHost(
                navHostController = navController, 
                startDestination = ScreenName.Home.route)
        }
    }
}