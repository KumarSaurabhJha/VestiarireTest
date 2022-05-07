package com.vestiarire.test.domain.model


data class DesiredWeatherConditions(
    val cityName: String,
    val mode: String,
    val units: String,
    val count: Int,
    val appId: String

)
