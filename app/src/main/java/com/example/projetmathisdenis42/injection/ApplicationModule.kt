package com.example.projetmathisdenis42.injection

import com.example.projetmathisdenis42.MainViewModel
import org.koin.dsl.module

val presentationModule = module {
    factory { MainViewModel() }

}