package com.example.domain.use_cases

import com.example.domain.repository.UserRepository
import javax.inject.Inject

class FetchUserUseCase @Inject constructor(
    private val userRepository: UserRepository
){

}