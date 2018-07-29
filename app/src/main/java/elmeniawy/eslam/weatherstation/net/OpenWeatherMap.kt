package elmeniawy.eslam.weatherstation.net

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * OpenWeatherMap
 *
 * Created by Eslam El-Meniawy on 29-Jul-2018.
 * CITC - Mansoura University
 */
interface OpenWeatherMap {
    @GET("/data/2.5/weather")
    fun currentWeather(
            @Query("lat") latitude: Double,
            @Query("lon") longitude: Double,
            @Query("appid") appId: String
    ): Call<Current>

    @GET("/data/2.5/forecast")
    fun forecast(
            @Query("lat") latitude: Double,
            @Query("lon") longitude: Double,
            @Query("appid") appId: String
    ): Call<Forecast>
}