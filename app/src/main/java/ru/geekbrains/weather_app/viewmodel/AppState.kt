package ru.geekbrains.weather_app.viewmodel

import ru.geekbrains.weather_app.model.Weather

sealed class AppState {
    data class Success(val weatherData: List<Weather>) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}
