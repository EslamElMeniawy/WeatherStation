package elmeniawy.eslam.weatherstation.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * WeatherStationModule
 *
 * Created by Eslam El-Meniawy on 29-Jul-2018.
 * CITC - Mansoura University
 */
@Module
class WeatherStationModule {
    @Provides
    @Singleton
    fun provideContext(application: Application): Context = application
}