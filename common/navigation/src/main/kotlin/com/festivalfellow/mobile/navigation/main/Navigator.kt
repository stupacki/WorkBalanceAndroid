package com.festivalfellow.mobile.navigation.main

import androidx.navigation.NavController
import com.festivalfellow.mobile.navigation.second.SecondNavigation
import com.festivalfellow.mobile.navigation.settings.SettingsNavigation
import com.festivalfellow.mobile.navigation.start.StartNavigation

class Navigator(private val navController: NavController) {

    val toStart by lazy { StartNavigation(navController) }

    val toSecond by lazy { SecondNavigation(navController) }

    val toSettings by lazy { SettingsNavigation(navController) }
}
