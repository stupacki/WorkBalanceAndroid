package com.workbalance.mobile.navigation.settings

import androidx.compose.runtime.Composable
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavBackStackEntry
import com.workbalance.mobile.navigation.main.NavigationStep
import com.workbalance.mobile.navigation.main.Navigator

class WorkWeeks(
    override val arguments: List<NamedNavArgument>,
    override val content: @Composable (Navigator, NavBackStackEntry) -> Unit,
) : NavigationStep {

    override val isStartDestination: Boolean
        get() = true

    override val destination: String
        get() = DEST_ID_WORK_WEEKS_SCREEN

    companion object {
        const val DEST_ID_WORK_WEEKS_SCREEN = "workWeeksScreen"
    }
}

