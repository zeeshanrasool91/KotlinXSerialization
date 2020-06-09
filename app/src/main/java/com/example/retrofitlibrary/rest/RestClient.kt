package com.example.retrofitlibrary.rest

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RestClient {

    private val BASE_URL = "https://api.stackexchange.com"
    private var mRetrofit: Retrofit? = null


    val client: Retrofit
        get() {
            if (mRetrofit == null) {
                mRetrofit = Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        //.addConverterFactory(GsonConverterFactory.create())
                        //.addConverterFactory(Json.asConverterFactory(getContentType()))
                        .addConverterFactory(Json(JsonConfiguration.Stable.copy(ignoreUnknownKeys = true)).asConverterFactory(
                            getContentType()))
                        .build()
            }
            return this.mRetrofit!!
        }

    /*.addConverterFactory(
    Json(
    JsonConfiguration(strictMode = false)
    ).asConverterFactory(MediaType.get("application/json"))
    )*/


    fun getContentType(): MediaType {
        return "application/json".toMediaType()
    }
}
