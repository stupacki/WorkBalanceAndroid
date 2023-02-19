package com.workbalance.mobile.app.injection

import com.workbalance.mobile.app.navigation.tree.timetracking.TimeTrackingNavigationTree
import com.workbalance.mobile.navigation.main.NavigationStep
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
        TimeTrackingNavigationTree.tree
    }
}
