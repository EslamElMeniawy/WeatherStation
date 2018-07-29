package elmeniawy.eslam.weatherstation.model

import org.threeten.bp.Instant
import org.threeten.bp.LocalDate

/**
 * FiveDayForecast
 *
 * Created by Eslam El-Meniawy on 29-Jul-2018.
 * CITC - Mansoura University
 */
data class FiveDayForecast(
        val forecastId: Long,
        val city: String,
        val expiryTime: Instant,
        val days: List<DailyItem>
) {
    data class DailyItem(
            val date: LocalDate,
            val type: String,
            val icon: String,
            val windSpeed: Float,
            val windDirection: Float,
            val temperatureMax: Float,
            val temperatureMin: Float
    )
}