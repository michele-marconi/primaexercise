package com.example.prima_exercise.injection

import com.example.prima_exercise.apiservice.RemoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object HiltMainModule {

    @Singleton
    @Provides
    fun provideWebService() = RemoteDataSource()
}