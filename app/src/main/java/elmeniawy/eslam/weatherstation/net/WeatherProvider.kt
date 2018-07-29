package elmeniawy.eslam.weatherstation.net

import elmeniawy.eslam.weatherstation.model.CurrentWeather

/**
 * WeatherProvider
 *
 * Created by Eslam El-Meniawy on 29-Jul-2018.
 * CITC - Mansoura University
 */
interface WeatherProvider {
    fun requestCurrentWeather(latitude: Double, longitude: Double,
                              callback: (CurrentWeather) -> Unit)

    fun requestWeatherForecast(latitude: Double, longitude: Double, callback: (Forecast) -> Unit)

    fun cancel()
}