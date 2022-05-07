package com.vestiarire.test.application

import android.app.Application
import org.koin.core.context.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
        //TODO add modules here
        }

    }
}