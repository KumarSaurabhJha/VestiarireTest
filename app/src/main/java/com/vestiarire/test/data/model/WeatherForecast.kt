package com.vestiarire.test.data.model

data class WeatherForecast(
    val city: City,
    val cnt: Int,
    val cod: String,
    val list: List<ListElement>,
    val message: Double
)