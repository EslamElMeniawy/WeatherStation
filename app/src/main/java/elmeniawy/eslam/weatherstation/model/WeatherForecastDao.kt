package elmeniawy.eslam.weatherstation.model

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import org.threeten.bp.Instant

/**
 * WeatherForecastDao
 *
 * Created by Eslam El-Meniawy on 29-Jul-2018.
 * CITC - Mansoura University
 */
@Dao
interface WeatherForecastDao {
    @Insert
    fun insert(weather: WeatherForecast): Long

    @Insert
    fun insertWeatherForecastItems(items: List<WeatherForecastItem>)

    @Query("SELECT retrievalLatitude, retrievalLongitude FROM WeatherForecast")
    fun getAllLocations(): List<LocationTuple>

    @Query("SELECT * FROM WeatherForecast WHERE retrievalLatitude = :latitude AND retrievalLongitude = :longitude")
    fun getWeatherForecast(latitude: Double, longitude: Double): WeatherForecast

    @Query("SELECT * FROM WeatherForecastItem WHERE forecastId = :forecastId")
    fun getWeatherForecastItems(forecastId: Long): List<WeatherForecastItem>

    @Query("SELECT * FROM WeatherForecastItem WHERE forecastId = :forecastId AND timestamp BETWEEN :start AND :end")
    fun getWeatherForecastItemsForDateRange(forecastId: Long, start: Long, end: Long): List<WeatherForecastItem>

    @Query("DELETE FROM WeatherForecast WHERE expiryTime < :cutoff")
    fun deleteOutdated(cutoff: Instant)
}