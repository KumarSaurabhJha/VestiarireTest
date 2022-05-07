package com.vestiarire.test.data.repository

import com.vestiarire.test.data.api.RestApi
import com.vestiarire.test.data.model.WeatherForecastList
import com.vestiarire.test.domain.model.DesiredWeatherConditions

class WeatherRepository(private val restApi: RestApi) {

    suspend fun getWeatherForecast(header: DesiredWeatherConditions): WeatherForecastList =
        restApi.getWeather(
            header.cityName,
            header.mode,
            header.units,
            header.count,
            header.appId
        )
}