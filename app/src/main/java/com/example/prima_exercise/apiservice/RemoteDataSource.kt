package com.example.prima_exercise.apiservice

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class RemoteDataSource : BaseRepo() {
    private var client: CountriesService
    private val endpoint = "https://restcountries.com/v3.1/"

    init {
        val oAuthClient = OkHttpClient.Builder().build()

        val retrofit = Retrofit.Builder()
            .baseUrl(endpoint)
            .addConverterFactory(MoshiConverterFactory.create())
            .client(oAuthClient)
            .build()

        client = retrofit.create(CountriesService::class.java)
    }
}