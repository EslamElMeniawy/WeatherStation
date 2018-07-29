package elmeniawy.eslam.weatherstation.model

import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.launch
import org.threeten.bp.Duration
import org.threeten.bp.Instant
import javax.inject.Inject
import elmeniawy.eslam.weatherstation.location.LocationProvider
import elmeniawy.eslam.weatherstation.net.WeatherProvider

/**
 * CurrentWeatherRepository
 *
 * Created by Eslam El-Meniawy on 29-Jul-2018.
 * CITC - Mansoura University
 */
class CurrentWeatherRepository @Inject constructor(
        private val weatherProvider: WeatherProvider,
        private val currentWeatherDao: CurrentWeatherDao,
        locationProvider: LocationProvider,
        distanceChecker: DistanceChecker
) : WeatherRepository<CurrentWeather>(distanceChecker) {
    private val validity: Long = Duration.ofMinutes(10).toMillis()

    override val range: Double = 1000.0

    val currentWeather: WeatherLiveData<CurrentWeather> =
            WeatherLiveData(locationProvider, weatherProvider, ::updateLocation)

    override fun requestWeather(latitude: Double, longitude: Double,
                                func: (CurrentWeather) -> Unit) =
            weatherProvider.requestCurrentWeather(latitude, longitude) {
                launch(CommonPool) {
                    it.retrievalLatitude = latitude.toFloat()
                    it.retrievalLongitude = longitude.toFloat()
                    it.expiryTime = Instant.now().plusMillis(validity)
                    currentWeatherDao.insert(it)
                    func(it)
                }
            }

    override fun getWeather(latitude: Double, longitude: Double): CurrentWeather =
            currentWeatherDao.getWeather(latitude, longitude)

    override fun updateWeather(value: CurrentWeather) =
            currentWeather.postValue(value)

    override fun deleteOutdated(cutoff: Instant) = currentWeatherDao.deleteOutdated(cutoff)

    override fun getAllLocations(): List<LocationTuple> = currentWeatherDao.getAllLocations()

}