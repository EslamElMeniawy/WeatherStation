package elmeniawy.eslam.weatherstation.location

/**
 * LocationProvider
 *
 * Created by Eslam El-Meniawy on 29-Jul-2018.
 * CITC - Mansoura University
 */
interface LocationProvider {
    fun requestUpdates(callback: (latitude: Double, longitude: Double) -> Unit)

    fun cancelUpdates(callback: (latitude: Double, longitude: Double) -> Unit)
}