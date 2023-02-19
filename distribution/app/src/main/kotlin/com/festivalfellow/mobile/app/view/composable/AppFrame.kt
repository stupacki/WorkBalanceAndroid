@file:OptIn(ExperimentalMaterial3Api::class)

package com.festivalfellow.mobile.app.view.composable

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.festivalfellow.mobile.app.injection.AppComponent.Companion.NAVIGATION_STEPS_QUALIFIER
import com.festivalfellow.mobile.design.themes.AppTheme
import com.festivalfellow.mobile.navigation.main.NavigationStep
import com.festivalfellow.mobile.navigation.main.view.compose.MyAppNavHostFrame
import org.koin.androidx.compose.getKoin

@Composable
fun AppFrame(navigationSteps: List<NavigationStep> = getKoin().get(NAVIGATION_STEPS_QUALIFIER)) {
    AppTheme() {
        MyAppNavHostFrame(
            modifier = Modifier.fillMaxSize(),
            navController = rememberNavController(),
            navigationSteps = navigationSteps,
        )
    }
}

@Composable
@Preview
private fun AppFramePreview() {
    AppFrame()
}
