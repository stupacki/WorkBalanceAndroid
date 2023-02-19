package com.workbalance.mobile.navigation.settings

import androidx.navigation.NavController
import com.workbalance.mobile.navigation.settings.SettingsScreenStep.Companion.DEST_ID_SETTINGS_SCREEN

class SettingsNavigation(private val navController: NavController) {

    fun entry() {
        navController.navigate(DEST_ID_SETTINGS_SCREEN)
    }
}
