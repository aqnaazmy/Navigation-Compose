package com.example.lazylayoutandnavigation.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun MyNavHost(
    navHostController: NavHostController,
    startDestination: String
) {
    NavHost(
        navController = navHostController,
        startDestination = startDestination,
        builder = {
            composable(NavCons.Home){
                HomeScreen()
            }
            composable(NavCons.Shoop){
                ShoopScreen()
            }
            composable(NavCons.Profile){
                ProfileScreen()
            }

    } )
}