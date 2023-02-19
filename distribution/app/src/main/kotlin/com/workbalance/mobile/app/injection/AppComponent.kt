package com.workbalance.mobile.app.injection

import com.workbalance.mobile.app.settings.view.compose.SettingsScreen
import com.workbalance.mobile.app.view.composable.SecondScreen
import com.workbalance.mobile.app.view.composable.StartScreen
import com.workbalance.mobile.navigation.main.NavigationStep
import com.workbalance.mobile.navigation.second.SecondScreenStep
import com.workbalance.mobile.navigation.settings.SettingsScreenStep
import com.workbalance.mobile.navigation.start.StartScreenStep
import org.koin.core.component.KoinComponent
import org.koin.core.module.Module
import org.koin.core.qualifier.StringQualifier
import org.koin.core.qualifier.named
import org.koin.dsl.module

internal class AppComponent : KoinComponent {

    companion object {

        val NAVIGATION_STEPS_QUALIFIER: StringQualifier = named("navigationSteps")
    }
}

fun appModule(): Module = module {

    single<List<NavigationStep>>(AppComponent.NAVIGATION_STEPS_QUALIFIER) {
        listOf(
            StartScreenStep(
                arguments = listOf(),
                content = { navigator, backStackEntry ->
                    StartScreen(
                        navigator,
                        backStackEntry,
                    )
                },
            ),
            SecondScreenStep(
                arguments = listOf(),
                content = { navigator, backStackEntry ->
                    SecondScreen(
                        navigator,
                        backStackEntry,
                    )
                },
            ),
            SettingsScreenStep(
                arguments = listOf(),
                content = { navigator, backStackEntry ->
                    SettingsScreen(
                        navigator,
                        backStackEntry,
                    )
                },
            )
        )
    }
}