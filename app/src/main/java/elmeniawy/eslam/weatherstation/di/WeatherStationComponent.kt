package elmeniawy.eslam.weatherstation.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import elmeniawy.eslam.weatherstation.WeatherStationApplication
import elmeniawy.eslam.weatherstation.location.LocationModule
import javax.inject.Singleton

/**
 * WeatherStationComponent
 *
 * Created by Eslam El-Meniawy on 29-Jul-2018.
 * CITC - Mansoura University
 */
@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    AndroidBuilder::class,
    WeatherStationModule::class,
    LocationModule::class,
//    WeatherModule::class,
    ViewModelModule::class,
    ViewModelProviderModule::class,
    DatabaseModule::class
])
interface WeatherStationComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): WeatherStationComponent
    }

    fun inject(application: WeatherStationApplication)
}