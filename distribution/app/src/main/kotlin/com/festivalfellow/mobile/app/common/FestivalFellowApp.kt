package com.festivalfellow.mobile.app.common

import android.app.Application
import com.festivalfellow.mobile.app.injection.AppComponent
import com.festivalfellow.mobile.app.injection.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.component.KoinComponent
import org.koin.core.context.GlobalContext.startKoin

class FestivalFellowApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin()
    }

    private fun startKoin() {
        startKoin {
            androidLogger()
            androidContext(this@FestivalFellowApp)
            modules(
                appModule()
            )
        }
    }

    companion object {

        //lateinit var appComponent: KoinComponent
    }
}
