package com.workbalance.mobile.navigation.main.view.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.workbalance.mobile.navigation.main.NavigationStep
import com.workbalance.mobile.navigation.main.Navigator
import com.workbalance.mobile.navigation.settings.WorkWeeks.Companion.DEST_ID_WORK_WEEKS_SCREEN

@Composable
fun MyAppNavHostFrame(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    navigationSteps: List<NavigationStep>,
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = DEST_ID_WORK_WEEKS_SCREEN,
    ) {
        val navigator: Navigator = Navigator(navController)

        navigationSteps.forEach { step: NavigationStep ->
            composable(
                route = step.destination,
                arguments = step.arguments,
                content = { backStackEntry ->
                    step.content(
                        navigator,
                        backStackEntry
                    )
                },
            )
        }
    }
}
