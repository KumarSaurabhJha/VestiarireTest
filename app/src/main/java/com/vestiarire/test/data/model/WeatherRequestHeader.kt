package com.vestiarire.test.data.model

data class WeatherRequestHeader(
    val cityName: String,
    val mode: String,
    val units: String,
    val count: Int,
    val appId: String
)
