package com.vestiarire.test.domain.model

import com.vestiarire.test.data.model.WeatherRequestHeader

data class DesiredWeatherConditions(
    val cityName: String,
    val mode: String,
    val units: String,
    val count: Int,
    val appId: String

)

fun DesiredWeatherConditions.toDataModel(): WeatherRequestHeader = WeatherRequestHeader(
    cityName = cityName,
    mode = mode,
    units = units,
    count = count,
    appId = appId
)