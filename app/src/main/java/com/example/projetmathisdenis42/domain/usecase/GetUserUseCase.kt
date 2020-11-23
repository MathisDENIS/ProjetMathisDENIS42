package com.example.projetmathisdenis42.domain.usecase

import com.example.projetmathisdenis42.data.repository.UserRepository
import com.example.projetmathisdenis42.domain.entity.User

class GetUserUseCase(
    private val userRepository: UserRepository
) {
    suspend fun invoke(email: String) : User?{
        return userRepository.getUser(email)
    }
}