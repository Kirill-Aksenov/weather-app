package ru.geekbrains.weather_app.repository

import ru.geekbrains.weather_app.model.Weather
import ru.geekbrains.weather_app.room.HistoryDao
import ru.geekbrains.weather_app.utils.convertHistoryEntityToWeather
import ru.geekbrains.weather_app.utils.convertWeatherToEntity

class LocalRepositoryImpl(private val localDataSource: HistoryDao) : LocalRepository {
    override fun getAllHistory(): List<Weather> {
        return convertHistoryEntityToWeather(localDataSource.all())
    }

    override fun saveEntity(weather: Weather) {
        localDataSource.insert(convertWeatherToEntity(weather))
    }
}