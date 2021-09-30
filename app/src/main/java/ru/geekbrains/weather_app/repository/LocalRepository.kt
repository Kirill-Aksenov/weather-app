package ru.geekbrains.weather_app.repository

import ru.geekbrains.weather_app.model.Weather

interface LocalRepository {
    fun getAllHistory(): List<Weather>
    fun saveEntity(weather: Weather)
}