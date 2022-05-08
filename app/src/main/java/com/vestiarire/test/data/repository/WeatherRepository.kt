package com.vestiarire.test.data.repository

import com.vestiarire.test.data.api.RestApi
import com.vestiarire.test.data.model.WeatherForecast
import com.vestiarire.test.data.model.WeatherRequestHeader
import com.vestiarire.test.domain.model.DesiredWeatherConditions

class WeatherRepository(private val restApi: RestApi) {

    suspend fun getWeatherForecast(input: DesiredWeatherConditions): WeatherForecast {
        val header = WeatherRequestHeader(cityName = input.cityName, count = input.count)
        return restApi.getWeather(
            cityName = header.cityName,
            mode = header.mode,
            units = header.units,
            count = header.count,
            appId = header.appId
        )
    }
}