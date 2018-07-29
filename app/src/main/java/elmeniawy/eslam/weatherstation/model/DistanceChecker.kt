package elmeniawy.eslam.weatherstation.model

import android.location.Location

/**
 * DistanceChecker
 *
 * Created by Eslam El-Meniawy on 29-Jul-2018.
 * CITC - Mansoura University
 */
interface DistanceChecker {
    fun distanceBetween(latitude1: Double, longitude1: Double, latitude2: Double,
                        longitude2: Double): Double
}

class LocationDistanceChecker : DistanceChecker {
    private val results = FloatArray(3)

    override fun distanceBetween(latitude1: Double, longitude1: Double, latitude2: Double,
                                 longitude2: Double): Double {
        Location.distanceBetween(latitude1, longitude1, latitude2, longitude2, results)
        return results[0].toDouble()
    }
}