package ru.geekbrains.weather_app.repository

import com.google.gson.GsonBuilder
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ru.geekbrains.weather_app.BuildConfig
import ru.geekbrains.weather_app.model.WeatherDTO

class RemoteDataSource {

    private val weatherApi = Retrofit.Builder()
        .baseUrl("https://api.weather.yandex.ru/")
        .addConverterFactory(
            GsonConverterFactory.create(
                GsonBuilder().setLenient().create()
            )
        )
        .build().create(WeatherAPI::class.java)

    fun getWeatherDetails(lat: Double, lon: Double, callback: Callback<WeatherDTO>) {
        weatherApi.getWeather(BuildConfig.WEATHER_API_KEY, lat, lon).enqueue(callback)
    }
}