package com.workbalance.mobile.app.navigation.tree.timetracking

import com.workbalance.mobile.app.navigation.tree.NavigationTree
import com.workbalance.mobile.app.timetracking.workweeks.view.compose.SettingsScreen
import com.workbalance.mobile.navigation.main.NavigationStep
import com.workbalance.mobile.navigation.settings.WorkWeeks

object TimeTrackingNavigationTree : NavigationTree {

    override val tree: List<NavigationStep>
        get() = listOf(
            WORK_WEEKS,
        )

    private val WORK_WEEKS = WorkWeeks(
        arguments = listOf(),
        content = { navigator, backStackEntry ->
            SettingsScreen(
                navigator,
                backStackEntry,
            )
        },
    )
}
