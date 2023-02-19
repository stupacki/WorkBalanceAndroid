package com.workbalance.mobile.navigation.start

import androidx.navigation.NavController
import com.workbalance.mobile.navigation.start.StartScreenStep.Companion.DEST_ID_START_SCREEN

class StartNavigation(private val navController: NavController) {

    fun entry() {
        navController.navigate(DEST_ID_START_SCREEN)
    }
}