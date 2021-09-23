package ru.geekbrains.weather_app.utils

import ru.geekbrains.weather_app.model.FactDTO
import ru.geekbrains.weather_app.model.Weather
import ru.geekbrains.weather_app.model.WeatherDTO
import ru.geekbrains.weather_app.model.getDefaultCity

fun convertDtoToModel(weatherDTO: WeatherDTO): List<Weather> {
    val fact: FactDTO = weatherDTO.fact!!
    return listOf(
        Weather(
            getDefaultCity(), fact.temp!!, fact.feels_like!!, fact.condition!!,
            fact.icon
        )
    )
}