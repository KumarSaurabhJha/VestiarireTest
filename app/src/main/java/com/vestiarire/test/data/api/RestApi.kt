package com.vestiarire.test.data.api

import retrofit2.http.GET
import retrofit2.http.Query

interface RestApi {

    @GET("data/2.5/forecast/daily")
    suspend fun getWeather(
        @Query("q") cityName: String,
        @Query("mode") mode: String,
        @Query("units") units: String,
        @Query("cnt") count: Int,
        @Query("APPID") appId: String
    )
}