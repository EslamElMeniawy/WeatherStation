package elmeniawy.eslam.weatherstation.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import elmeniawy.eslam.weatherstation.model.CurrentWeather
import elmeniawy.eslam.weatherstation.model.DailyForecastProvider
import elmeniawy.eslam.weatherstation.model.FiveDayForecast
import javax.inject.Inject

/**
 * WeatherViewModel
 *
 * Created by Eslam El-Meniawy on 29-Jul-2018.
 * CITC - Mansoura University
 */
class WeatherViewModel @Inject constructor(
        val currentWeather: LiveData<CurrentWeather>,
        val fiveDayForecast: LiveData<FiveDayForecast>,
        dailyForecastProvider: DailyForecastProvider
) : ViewModel(), DailyForecastProvider by dailyForecastProvider