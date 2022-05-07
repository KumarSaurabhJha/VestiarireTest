package com.vestiarire.test.domain.usecase

import com.vestiarire.test.data.model.WeatherForecastList
import com.vestiarire.test.data.repository.WeatherRepository
import com.vestiarire.test.domain.model.DesiredWeatherConditions

class GetWeatherForeCastUseCase(
    private val weatherRepository: WeatherRepository
) : UseCase<DesiredWeatherConditions, WeatherForecastList> {

    override suspend fun execute(input: DesiredWeatherConditions): WeatherForecastList =
        weatherRepository.getWeatherForecast(input)

}