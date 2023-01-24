package com.example.prima_exercise.apiservice

import com.example.prima_exercise.model.responsemodel.CountriesResponse
import retrofit2.Response
import retrofit2.http.GET

interface CountriesService {
    @GET("all")
    suspend fun getAllCountries(): Response<CountriesResponse>
}