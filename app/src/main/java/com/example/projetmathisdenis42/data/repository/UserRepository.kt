package com.example.projetmathisdenis42.data.repository

import com.example.projetmathisdenis42.data.local.DatabaseDao
import com.example.projetmathisdenis42.data.local.models.toData
import com.example.projetmathisdenis42.data.local.models.toEntity
import com.example.projetmathisdenis42.domain.entity.User

class UserRepository(
    private val databaseDao: DatabaseDao
) {

    suspend fun createUser(user: User){
        databaseDao.insert(user.toData())
    }

    fun getUser(email: String) : User? {
        val userLocal = databaseDao.findByName(email)
        return userLocal?.toEntity()
    }
}