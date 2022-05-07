package com.vestiarire.test.data.model

data class WeatherRequestHeader(
    val cityName: String,
    val count: Int,
    val units: String = "metric",
    val mode: String = "json",
    val appId: String = "648a3aac37935e5b45e09727df728ac2"
)

