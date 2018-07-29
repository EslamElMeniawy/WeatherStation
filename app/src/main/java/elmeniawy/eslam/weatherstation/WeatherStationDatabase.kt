package elmeniawy.eslam.weatherstation

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import elmeniawy.eslam.weatherstation.model.*
import org.threeten.bp.Instant

/**
 * WeatherStationDatabase
 *
 * Created by Eslam El-Meniawy on 29-Jul-2018.
 * CITC - Mansoura University
 */
@Database(
        entities = [
            CurrentWeather::class,
            WeatherForecast::class,
            WeatherForecastItem::class
        ],
        version = 1,
        exportSchema = false
)
@TypeConverters(WeatherStationDatabase.Converters::class)
abstract class WeatherStationDatabase : RoomDatabase() {
    abstract fun currentWeatherDao(): CurrentWeatherDao

    abstract fun weatherForecastDao(): WeatherForecastDao

    class Converters {
        @TypeConverter
        fun instantFromTimestamp(timestamp: Long): Instant =
                Instant.ofEpochMilli(timestamp)

        @TypeConverter
        fun timestampFromInstant(instant: Instant): Long =
                instant.toEpochMilli()
    }
}