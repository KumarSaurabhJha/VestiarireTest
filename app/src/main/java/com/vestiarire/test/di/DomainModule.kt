package com.vestiarire.test.di

import com.vestiarire.test.domain.usecase.GetWeatherForeCastUseCase
import org.koin.dsl.module

val domainModule = module {
    single {
        GetWeatherForeCastUseCase(get())
    }
}