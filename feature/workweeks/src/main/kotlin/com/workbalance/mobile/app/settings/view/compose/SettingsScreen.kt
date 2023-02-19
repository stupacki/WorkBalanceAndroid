@file:OptIn(ExperimentalMaterial3Api::class)

package com.workbalance.mobile.app.settings.view.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavBackStackEntry
import com.workbalance.mobile.navigation.main.Navigator

@Composable
fun SettingsScreen(navigator: Navigator, backStackEntry: NavBackStackEntry) {
    Scaffold() { padding ->
        Column(modifier = Modifier.padding(padding)) {
        }
    }
}
