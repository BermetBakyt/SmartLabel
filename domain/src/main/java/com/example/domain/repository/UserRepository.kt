package com.example.domain.repository

import com.example.domain.models.User

interface UserRepository {

    fun fetchUser(token: String) : User
}