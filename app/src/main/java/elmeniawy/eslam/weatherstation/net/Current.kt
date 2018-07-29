package elmeniawy.eslam.weatherstation.net

import com.squareup.moshi.Json
import elmeniawy.eslam.weatherstation.model.CurrentWeather
import org.threeten.bp.Instant

/**
 * Current
 *
 * Created by Eslam El-Meniawy on 29-Jul-2018.
 * CITC - Mansoura University
 */
data class Current(
        @Json(name = "coord") val coordinates: Coordinates,
        @Json(name = "weather") val weather: List<Weather>,
        @Json(name = "main") val temperaturePressure: TemperaturePressure,
        @Json(name = "wind") val wind: Wind,
        @Json(name = "dt") val timestamp: Long,
        @Json(name = "name") val name: String
) {
    val time: Instant by lazy { Instant.ofEpochSecond(timestamp) }

    val currentWeather = CurrentWeather(
            coordinates.latitude,
            coordinates.longitude,
            name,
            temperaturePressure.temperature,
            wind.speed ?: 0f,
            wind.direction ?: 0f,
            weather[0].main,
            weather[0].description,
            weather[0].icon,
            time,
            Instant.now(),
            0f,
            0f
    )
}