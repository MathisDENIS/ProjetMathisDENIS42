package com.example.projetmathisdenis42.presentation.main

sealed class LoginStatus

data class LoginSuccess(val email: String) : LoginStatus()

object LoginError : LoginStatus()
