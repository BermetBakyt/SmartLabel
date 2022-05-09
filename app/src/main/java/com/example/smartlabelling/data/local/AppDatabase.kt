package com.example.smartlabelling.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.smartlabelling.data.local.dao.ProductDao
import com.example.smartlabelling.data.local.entities.ProductEntity

@Database(entities = [ProductEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
      abstract fun productDao(): ProductDao
}