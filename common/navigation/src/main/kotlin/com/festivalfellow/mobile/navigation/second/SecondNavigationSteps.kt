package com.festivalfellow.mobile.navigation.second

import androidx.compose.runtime.Composable
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavBackStackEntry
import com.festivalfellow.mobile.navigation.main.NavigationStep
import com.festivalfellow.mobile.navigation.main.Navigator

class SecondScreenStep(
    override val arguments: List<NamedNavArgument>,
    override val content: @Composable (Navigator, NavBackStackEntry) -> Unit,
) : NavigationStep {

    override val isStartDestination: Boolean
        get() = false

    override val destination: String
        get() = DEST_ID_SECOND_SCREEN

    companion object {
        const val DEST_ID_SECOND_SCREEN = "secondScreen"
    }
}

