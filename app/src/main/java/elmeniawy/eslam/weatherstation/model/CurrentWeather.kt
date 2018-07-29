package elmeniawy.eslam.weatherstation.model

import org.threeten.bp.Instant

/**
 * CurrentWeather
 *
 * Created by Eslam El-Meniawy on 29-Jul-2018.
 * CITC - Mansoura University
 */
data class CurrentWeather(
        val latitude: Float,
        val longitude: Float,
        val placeName: String,
        val temperature: Float,
        val windSpeed: Float,
        val windDirection: Float,
        val weatherType: String,
        val weatherDescription: String,
        val icon: String,
        val timestamp: Instant
)