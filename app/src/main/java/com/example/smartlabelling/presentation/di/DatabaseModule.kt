package com.example.smartlabelling.presentation.di

import android.content.Context
import com.example.smartlabelling.data.local.AppDatabase
import com.example.smartlabelling.data.local.RoomClient
import com.example.smartlabelling.data.local.dao.ProductDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    val roomClient = RoomClient()

    @Singleton
    @Provides
    fun provideAppDatabase(
        @ApplicationContext context: Context
    ): AppDatabase = roomClient.provideAppDatabase(context)

    @Singleton
    @Provides
    fun provideProductDao(
        appDatabase: AppDatabase
    ): ProductDao = roomClient.provideProductDao(appDatabase)
}