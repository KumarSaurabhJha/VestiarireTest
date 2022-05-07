package com.vestiarire.test.data.repository

import com.vestiarire.test.data.api.RestApi
import com.vestiarire.test.data.model.WeatherForecastList
import com.vestiarire.test.data.model.WeatherRequestHeader

class WeatherRepository(private val restApi: RestApi) {

    suspend fun getWeatherForecast(header: WeatherRequestHeader): WeatherForecastList =
        restApi.getWeather(
            header.cityName,
            header.mode,
            header.units,
            header.count,
            header.appId
        )
}