package com.example.smartlabelling.presentation.di

import com.example.smartlabelling.data.remote.RetrofitClient
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
    fun provideCharacterApiService(
        networkClient: RetrofitClient
    ) = networkClient.provideCharacterApiService()
}