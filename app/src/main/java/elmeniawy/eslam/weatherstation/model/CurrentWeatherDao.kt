package elmeniawy.eslam.weatherstation.model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import org.threeten.bp.Instant

/**
 * CurrentWeatherDao
 *
 * Created by Eslam El-Meniawy on 29-Jul-2018.
 * CITC - Mansoura University
 */
@Dao
interface CurrentWeatherDao {
    @Insert
    fun insert(weather: CurrentWeather): Long

    @Query("SELECT retrievalLatitude, retrievalLongitude FROM CurrentWeather")
    fun getAllLocations(): List<LocationTuple>

    @Query("SELECT * FROM CurrentWeather WHERE retrievalLatitude = :latitude AND retrievalLongitude = :longitude")
    fun getWeather(latitude: Double, longitude: Double): CurrentWeather

    @Query("DELETE FROM CurrentWeather WHERE expiryTime < :cutoff")
    fun deleteOutdated(cutoff: Instant)
}