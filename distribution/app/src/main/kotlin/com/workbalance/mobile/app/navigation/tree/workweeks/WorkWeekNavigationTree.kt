package com.workbalance.mobile.app.navigation.tree.workweeks

import com.workbalance.mobile.app.navigation.tree.NavigationTree
import com.workbalance.mobile.app.settings.view.compose.SettingsScreen
import com.workbalance.mobile.navigation.main.NavigationStep
import com.workbalance.mobile.navigation.settings.WorkWeeks

object WorkWeekNavigationTree : NavigationTree {

    override val tree: List<NavigationStep>
        get() = listOf(
            START,
        )

    private val START = WorkWeeks(
        arguments = listOf(),
        content = { navigator, backStackEntry ->
            SettingsScreen(
                navigator,
                backStackEntry,
            )
        },
    )
}
