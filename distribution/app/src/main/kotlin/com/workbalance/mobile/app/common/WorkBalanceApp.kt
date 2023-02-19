package com.workbalance.mobile.app.common

import android.app.Application
import com.workbalance.mobile.app.injection.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class WorkBalanceApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin()
    }

    private fun startKoin() {
        startKoin {
            androidLogger()
            androidContext(this@WorkBalanceApp)
            modules(
                appModule()
            )
        }
    }
}
