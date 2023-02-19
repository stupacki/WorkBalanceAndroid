package com.festivalfellow.mobile.navigation.main

import androidx.compose.runtime.Composable
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController

interface NavigationStep {

    val isStartDestination: Boolean

    val arguments: List<NamedNavArgument>

    val destination: String

    val content: @Composable (Navigator, NavBackStackEntry) -> Unit
}
