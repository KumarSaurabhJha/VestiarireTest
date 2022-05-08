package com.vestiarire.test.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vestiarire.test.domain.model.DesiredWeatherConditions
import com.vestiarire.test.domain.usecase.GetWeatherForeCastUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class WeatherForecastViewModel(private val getWeatherForeCastUseCase: GetWeatherForeCastUseCase) :
    ViewModel() {

    private var fetchWeatherDataJob: Job? = null

    /**
     * This gives possibility to get these values from User in future
     */
    private val cityName = "Paris"
    private val numberOfDaysNeeded = 16

    fun init() {
        cancelFetchJob()
        fetchWeatherDataJob = viewModelScope.launch(Dispatchers.IO) {

            val response = getWeatherForeCastUseCase.execute(
                DesiredWeatherConditions(
                    cityName = cityName,
                    count = numberOfDaysNeeded
                )
            )

            Log.e("Kumi", "weather forecadt: $response")
        }

    }

    fun cancelFetchJob() {
        fetchWeatherDataJob?.let {
            if (it.isActive) {
                it.cancel()
            }
        }
    }
}