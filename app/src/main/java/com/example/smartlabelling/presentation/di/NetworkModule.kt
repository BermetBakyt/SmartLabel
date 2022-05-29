package com.example.smartlabelling.presentation.di

import com.example.data.remote.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideProductApiService(
        networkClient: com.example.data.remote.RetrofitClient
    ) = networkClient.provideProductApiService()
}