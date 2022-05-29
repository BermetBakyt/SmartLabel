package com.example.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserEntity(
    @PrimaryKey
    var id: Long?,
    var companyName: String,
    var email: String,
    var password: String
)