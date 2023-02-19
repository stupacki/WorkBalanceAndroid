package com.festivalfellow.mobile.navigation.second

import androidx.navigation.NavController
import com.festivalfellow.mobile.navigation.second.SecondScreenStep.Companion.DEST_ID_SECOND_SCREEN

class SecondNavigation(private val navController: NavController) {

    fun entry() {
        navController.navigate(DEST_ID_SECOND_SCREEN)
    }
}
