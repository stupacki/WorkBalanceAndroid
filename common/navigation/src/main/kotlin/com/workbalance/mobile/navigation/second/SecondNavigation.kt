package com.workbalance.mobile.navigation.second

import androidx.navigation.NavController
import com.workbalance.mobile.navigation.second.SecondScreenStep.Companion.DEST_ID_SECOND_SCREEN

class SecondNavigation(private val navController: NavController) {

    fun entry() {
        navController.navigate(DEST_ID_SECOND_SCREEN)
    }
}
