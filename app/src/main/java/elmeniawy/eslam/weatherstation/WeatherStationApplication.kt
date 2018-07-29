package elmeniawy.eslam.weatherstation

import android.app.Application
import android.support.v4.app.Fragment
import com.jakewharton.threetenabp.AndroidThreeTen
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import elmeniawy.eslam.weatherstation.di.WeatherStationComponent
import elmeniawy.eslam.weatherstation.di.DaggerWeatherStationComponent
import javax.inject.Inject

/**
 * WeatherStationApplication
 *
 * Created by Eslam El-Meniawy on 29-Jul-2018.
 * CITC - Mansoura University
 */
class WeatherStationApplication : Application(), HasSupportFragmentInjector {
    @Inject
    lateinit var fragmentDispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    private val weatherStationComponent: WeatherStationComponent by lazy {
        DaggerWeatherStationComponent.builder()
                .application(this)
                .build()
    }

    override fun onCreate() {
        super.onCreate()

        weatherStationComponent.inject(this)
        AndroidThreeTen.init(this)
    }

    override fun supportFragmentInjector():
            AndroidInjector<Fragment> = fragmentDispatchingAndroidInjector
}