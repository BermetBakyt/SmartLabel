package com.example.smartlabelling.data.local

import android.content.Context
import androidx.room.Room
import com.example.smartlabelling.data.local.dao.ProductDao
import com.example.smartlabelling.data.remote.services.ProductServiceApi

class RoomClient {

    fun provideAppDatabase(context: Context) = Room
        .databaseBuilder(context, AppDatabase::class.java, "ProductDetailAppDatabase")
        .build()

    fun provideProductDao(appDatabase: AppDatabase): ProductDao = appDatabase.productDao()
}