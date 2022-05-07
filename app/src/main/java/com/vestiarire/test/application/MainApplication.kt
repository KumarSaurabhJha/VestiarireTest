package com.vestiarire.test.application

import android.app.Application
import com.vestiarire.test.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@MainApplication)
            modules(
                retrofitModule,
                restApiModule,
                domainModule,
                restRepositoryModule,
                viewModelModule
            )
        }

    }
}