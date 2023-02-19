package com.workbalance.mobile.navigation.main

import androidx.navigation.NavController
import com.workbalance.mobile.navigation.settings.WorkWeeksNavigation

class Navigator(private val navController: NavController) {

    val toWorkWeeks by lazy { WorkWeeksNavigation(navController) }
}
