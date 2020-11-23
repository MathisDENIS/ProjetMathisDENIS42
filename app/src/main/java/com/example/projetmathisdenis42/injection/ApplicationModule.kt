package com.example.projetmathisdenis42.injection

import android.content.Context
import androidx.room.Room
import com.example.projetmathisdenis42.data.local.AppDatabase
import com.example.projetmathisdenis42.data.local.DatabaseDao
import com.example.projetmathisdenis42.data.repository.UserRepository
import com.example.projetmathisdenis42.domain.usecase.CreateUserUseCase
import com.example.projetmathisdenis42.domain.usecase.GetUserUseCase
import com.example.projetmathisdenis42.presentation.main.MainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val presentationModule = module {
    factory { MainViewModel(get(), get()) }
}

val domainModule = module {
    factory { CreateUserUseCase(get()) }
    factory { GetUserUseCase(get()) }
}

val dataModule = module {
    single { UserRepository(get()) }
    single { createDataBase(androidContext()) }
}

fun createDataBase(context: Context): DatabaseDao{
    val appDatabase = Room.databaseBuilder(
        context,
        AppDatabase::class.java, "database-name"
    ).build()
    return appDatabase.databaseDao()
}
