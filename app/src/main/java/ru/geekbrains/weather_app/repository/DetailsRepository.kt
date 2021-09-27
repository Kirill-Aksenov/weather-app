package ru.geekbrains.weather_app.repository

import retrofit2.Callback
import ru.geekbrains.weather_app.model.WeatherDTO

interface DetailsRepository {
    fun getWeatherDetailsFromServer(
        lat: Double,
        lon: Double,
        callback: Callback<WeatherDTO>
    )
}