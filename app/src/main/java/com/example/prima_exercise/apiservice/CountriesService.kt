package com.example.prima_exercise.apiservice

import okhttp3.Response
import retrofit2.http.GET

interface CountriesService {
    @GET("all")
    suspend fun getAllCountries(): Response<CountriesResponse>
}