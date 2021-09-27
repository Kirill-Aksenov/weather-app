package ru.geekbrains.weather_app.repository

import ru.geekbrains.weather_app.model.Weather
import ru.geekbrains.weather_app.model.getRussianCities
import ru.geekbrains.weather_app.model.getWorldCities

class RepositoryImpl : Repository {
    override fun getWeatherFromServer() = Weather()

    override fun getWeatherFromLocalStorageRus() = getRussianCities()

    override fun getWeatherFromLocalStorageWorld() = getWorldCities()
}