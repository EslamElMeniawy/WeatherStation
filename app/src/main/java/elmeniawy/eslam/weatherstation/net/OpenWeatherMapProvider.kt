package elmeniawy.eslam.weatherstation.net

import android.telecom.Call

/**
 * OpenWeatherMapProvider
 *
 * Created by Eslam El-Meniawy on 29-Jul-2018.
 * CITC - Mansoura University
 */
class OpenWeatherMapProvider (
        context: Context,
        private val appId: String,
        okHttpClient: OkHttpClient = OkHttpClient.Builder()
                .cache(Cache(context.cacheDir, cacheSize))
                .addInterceptor(HttpLoggingInterceptor().apply {
                    level = HttpLoggingInterceptor.Level.BODY
                })
                .build(),
        converterFactory: Converter.Factory = MoshiConverterFactory.create(
                Moshi.Builder()
                        .add(KotlinJsonAdapterFactory())
                        .build()
        ),
        retrofit: Retrofit = Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("https://api.openweathermap.org/")
                .addConverterFactory(converterFactory)
                .build(),
        private val service: OpenWeatherMap = retrofit.create(OpenWeatherMap::class.java),
        private val calls: MutableList<Call<Current>> = mutableListOf()

) : CurrentWeatherProvider {
}