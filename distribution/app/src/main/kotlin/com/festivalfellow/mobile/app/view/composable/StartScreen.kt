@file:OptIn(ExperimentalMaterial3Api::class)

package com.festivalfellow.mobile.app.view.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavBackStackEntry
import com.festivalfellow.mobile.navigation.main.Navigator

@Composable
fun StartScreen(navigator: Navigator, backStackEntry: NavBackStackEntry) {
    Scaffold() { padding ->
        Column(modifier = Modifier.padding(padding)) {
            Button(onClick = navigator.toSecond::entry) {
                Text(text = "To Second Screen")
            }
            Button(onClick = navigator.toSettings::entry) {
                Text(text = "To Settings Screen")
            }
        }
    }
}
