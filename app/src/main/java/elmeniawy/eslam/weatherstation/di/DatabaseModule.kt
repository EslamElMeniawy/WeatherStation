package elmeniawy.eslam.weatherstation.di

import android.arch.persistence.room.Room
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * DatabaseModule
 *
 * Created by Eslam El-Meniawy on 29-Jul-2018.
 * CITC - Mansoura University
 */
@Module
class DatabaseModule {
//    @Provides
//    @Singleton
//    fun providesWeatherStationDatabase(context: Context): WeatherStationDatabase =
//            Room.databaseBuilder(context, WeatherStationDatabase::class.java,
//                    "WeatherStationDatabase").build()
//
//    @Provides
//    @Singleton
//    fun providesCurrentWeatherDao(database: WeatherStationDatabase) =
//            database.currentWeatherDao()
//
//    @Provides
//    @Singleton
//    fun providesWeatherForecastDao(database: WeatherStationDatabase) =
//            database.weatherForecastDao()
//
//    @Provides
//    fun providesDistanceChecker(): DistanceChecker =
//            LocationDistanceChecker()
}