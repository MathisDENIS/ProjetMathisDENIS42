package com.example.projetmathisdenis42.domain.usecase

import com.example.projetmathisdenis42.data.repository.UserRepository
import com.example.projetmathisdenis42.domain.entity.User

class CreateUserUseCase(
    private val userRepository: UserRepository
) {
    suspend fun invoke(user: User){
        userRepository.createUser(user)
    }
}