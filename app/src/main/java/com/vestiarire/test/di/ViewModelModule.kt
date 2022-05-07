package com.vestiarire.test.di

import com.vestiarire.test.presentation.viewmodel.WeatherForecastViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        WeatherForecastViewModel(get())
    }
}