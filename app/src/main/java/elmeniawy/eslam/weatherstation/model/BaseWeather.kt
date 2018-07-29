package elmeniawy.eslam.weatherstation.model

import org.threeten.bp.Instant

/**
 * BaseWeather
 *
 * Created by Eslam El-Meniawy on 29-Jul-2018.
 * CITC - Mansoura University
 */
interface BaseWeather {
    var expiryTime: Instant
    var retrievalLatitude: Float
    var retrievalLongitude: Float
}