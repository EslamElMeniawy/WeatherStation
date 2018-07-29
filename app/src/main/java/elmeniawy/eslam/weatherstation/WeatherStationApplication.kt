package elmeniawy.eslam.weatherstation

import android.app.Application
import android.support.v4.app.Fragment
import dagger.android.AndroidInjector
import dagger.android.support.HasSupportFragmentInjector

/**
 * WeatherStationApplication
 *
 * Created by Eslam El-Meniawy on 29-Jul-2018.
 * CITC - Mansoura University
 */
class WeatherStationApplication : Application(), HasSupportFragmentInjector {
    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}