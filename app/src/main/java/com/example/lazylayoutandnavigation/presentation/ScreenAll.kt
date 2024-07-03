package com.example.lazylayoutandnavigation.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen() {
    Surface (modifier = Modifier.fillMaxSize()) {
        Column (modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally){
            Text(text = "HOME SCREEN")
        }
    }
}

@Composable
fun ShoopScreen() {
    Surface (modifier = Modifier.fillMaxSize()) {
        Column (modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally){
            Text(text = "SHOOP SCREEN")
        }
    }
}

@Composable
fun ProfileScreen() {
    Surface (modifier = Modifier.fillMaxSize()) {
        Column (modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally){
            Text(text = "PROFILE SCREEN")
        }
    }
}