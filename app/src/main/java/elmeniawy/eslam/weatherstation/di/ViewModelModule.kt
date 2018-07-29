package elmeniawy.eslam.weatherstation.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.multibindings.IntoMap
import elmeniawy.eslam.weatherstation.model.*
import kotlin.reflect.KClass

/**
 * ViewModelModule
 *
 * Created by Eslam El-Meniawy on 29-Jul-2018.
 * CITC - Mansoura University
 */
@Target(
        AnnotationTarget.FUNCTION,
        AnnotationTarget.PROPERTY_GETTER,
        AnnotationTarget.PROPERTY_SETTER
)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)

@Module
abstract class ViewModelModule {
    @Binds
    abstract fun bindCurrentWeatherRepository(currentWeatherRepository: CurrentWeatherRepository):
            WeatherRepository<CurrentWeather>

    @Binds
    abstract fun bindForecastRepository(forecastRepository: ForecastRepository):
        WeatherRepository<WeatherForecast>

//    @Binds
//    @IntoMap
//    @ViewModelKey(WeatherViewModel::class)
//    abstract fun bindCurrentWeatherViewModel(viewModel: WeatherViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}