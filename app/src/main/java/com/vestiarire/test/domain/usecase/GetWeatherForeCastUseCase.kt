package com.vestiarire.test.domain.usecase

import com.vestiarire.test.data.model.WeatherForecast
import com.vestiarire.test.data.repository.WeatherRepository
import com.vestiarire.test.domain.model.DesiredWeatherConditions

class GetWeatherForeCastUseCase(
    private val weatherRepository: WeatherRepository
) : UseCase<DesiredWeatherConditions, WeatherForecast> {

    override suspend fun execute(input: DesiredWeatherConditions): WeatherForecast =
        weatherRepository.getWeatherForecast(input)

}