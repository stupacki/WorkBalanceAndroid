package com.workbalance.mobile.navigation.settings

import androidx.navigation.NavController
import com.workbalance.mobile.navigation.settings.WorkWeeks.Companion.DEST_ID_WORK_WEEKS_SCREEN

class WorkWeeksNavigation(private val navController: NavController) {

    fun entry() {
        navController.navigate(DEST_ID_WORK_WEEKS_SCREEN)
    }
}
