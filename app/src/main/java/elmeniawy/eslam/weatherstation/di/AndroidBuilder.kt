package elmeniawy.eslam.weatherstation.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import elmeniawy.eslam.weatherstation.ui.CurrentWeatherFragment
import elmeniawy.eslam.weatherstation.ui.DailyForecastFragment

/**
 * AndroidBuilder
 *
 * Created by Eslam El-Meniawy on 29-Jul-2018.
 * CITC - Mansoura University
 */
@Module
abstract class AndroidBuilder {
    @ContributesAndroidInjector
    abstract fun bindCurrentWeatherFragment(): CurrentWeatherFragment

    @ContributesAndroidInjector
    abstract fun bindDailyForecastFragment(): DailyForecastFragment
}