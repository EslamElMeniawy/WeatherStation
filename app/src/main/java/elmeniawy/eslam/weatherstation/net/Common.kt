package elmeniawy.eslam.weatherstation.net

import com.squareup.moshi.Json

/**
 * Common
 *
 * Created by Eslam El-Meniawy on 29-Jul-2018.
 * CITC - Mansoura University
 */
data class Coordinates(
        @Json(name = "lat") val latitude: Float,
        @Json(name = "lon") val longitude: Float
)


data class Weather(
        @Json(name = "main") val main: String,
        @Json(name = "description") val description: String,
        @Json(name = "icon") val icon: String
)

data class TemperaturePressure(
        @Json(name = "temp") val temperature: Float,
        @Json(name = "temp_max") val temperatureMax: Float,
        @Json(name = "temp_min") val temperatureMin: Float,
        @Json(name = "pressure") val pressure: Float
)

data class Wind(
        @Json(name = "speed") val speed: Float?,
        @Json(name = "deg") val direction: Float?
)