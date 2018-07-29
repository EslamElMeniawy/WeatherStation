package elmeniawy.eslam.weatherstation.model

import androidx.lifecycle.MutableLiveData
import elmeniawy.eslam.weatherstation.location.LocationProvider
import elmeniawy.eslam.weatherstation.net.WeatherProvider

/**
 * WeatherLiveData
 *
 * Created by Eslam El-Meniawy on 29-Jul-2018.
 * CITC - Mansoura University
 */
class WeatherLiveData<T>(
        private val locationProvider: LocationProvider,
        private val weatherProvider: WeatherProvider,
        private val callback: (Double, Double) -> Unit
) : MutableLiveData<T>() {
    override fun onActive() {
        super.onActive()
        locationProvider.requestUpdates(callback)
    }

    override fun onInactive() {
        weatherProvider.cancel()
        locationProvider.cancelUpdates(callback)
        super.onInactive()
    }
}