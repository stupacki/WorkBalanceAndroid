package com.festivalfellow.mobile.navigation.main.view.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.festivalfellow.mobile.navigation.main.NavigationStep
import com.festivalfellow.mobile.navigation.main.Navigator

@Composable
fun MyAppNavHostFrame(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    navigationSteps: List<NavigationStep>,
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = navigationSteps.first { it.isStartDestination }.destination,
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
