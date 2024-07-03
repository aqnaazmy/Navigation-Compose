package com.example.lazylayoutandnavigation.presentation

import android.graphics.drawable.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class ScreenName (
    val route : String,
    val imageVector: ImageVector,
    val label : String
){
    object Home :ScreenName(
        route = NavCons.Home,
        imageVector = Icons.Rounded.Home,
        label = "Home"
    )
    object Shop : ScreenName(
        route = NavCons.Shoop,
        imageVector = Icons.Rounded.ShoppingCart,
        label = "Shope"
    )
    object Profile : ScreenName (
        route = NavCons.Profile,
        imageVector = Icons.Rounded.Person,
        label = "Profile"
    )
}

object NavCons{
    const val Home = "Home"
    const val Shoop = "Shoop"
    const val Profile = "Profile"
}
