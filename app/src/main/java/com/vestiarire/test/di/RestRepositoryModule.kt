package com.vestiarire.test.di

import com.vestiarire.test.data.repository.WeatherRepository
import org.koin.dsl.module

val restRepositoryModule = module {
    single {
        WeatherRepository(get())
    }
}