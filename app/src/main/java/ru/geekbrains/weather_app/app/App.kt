package ru.geekbrains.weather_app.app

import android.app.Application
import androidx.room.Room
import ru.geekbrains.weather_app.room.HistoryDao
import ru.geekbrains.weather_app.room.HistoryDatabase

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        appInstance = this
    }

    companion object {

        private var appInstance: App? = null
        private var db: HistoryDatabase? = null
        private const val DB_NAME = "History.db"

        private val appHistoryDao by lazy {
            Room
                .databaseBuilder(
                    appInstance!!.applicationContext,
                    HistoryDatabase::class.java,
                    DB_NAME
                )
                .allowMainThreadQueries()
                .build()
                .historyDao()
        }

        fun getHistoryDao(): HistoryDao = appHistoryDao
    }
}