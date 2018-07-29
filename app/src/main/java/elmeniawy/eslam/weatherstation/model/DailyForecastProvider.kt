package elmeniawy.eslam.weatherstation.model

import org.threeten.bp.LocalDate

/**
 * DailyForecastProvider
 *
 * Created by Eslam El-Meniawy on 29-Jul-2018.
 * CITC - Mansoura University
 */
interface DailyForecastProvider {
    fun getDailyForecast(forecastId: Long, city: String, date: LocalDate): DailyForecast
}