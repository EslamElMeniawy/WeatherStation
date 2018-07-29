package elmeniawy.eslam.weatherstation.model

import org.threeten.bp.LocalDate

/**
 * DailyForecast
 *
 * Created by Eslam El-Meniawy on 29-Jul-2018.
 * CITC - Mansoura University
 */
data class DailyForecast(
        val date: LocalDate,
        val city: String,
        val forecasts: List<WeatherForecastItem>
)
