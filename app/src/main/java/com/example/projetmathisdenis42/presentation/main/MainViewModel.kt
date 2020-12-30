package com.example.projetmathisdenis42.presentation.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.Navigation.findNavController
import com.example.projetmathisdenis42.domain.entity.User
import com.example.projetmathisdenis42.domain.usecase.CreateUserUseCase
import com.example.projetmathisdenis42.domain.usecase.GetUserUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import androidx.navigation.fragment.findNavController
import com.example.projetmathisdenis42.R

class MainViewModel(
    private val createUserUseCase: CreateUserUseCase,
    private val getUserUseCase: GetUserUseCase
) : ViewModel(){

    val loginLiveData: MutableLiveData<LoginStatus> =  MutableLiveData()

    fun onClickedCreate(emailUser: String, password: String){
        viewModelScope.launch(Dispatchers.IO){
            val newUser = User(emailUser)
            createUserUseCase.invoke(newUser)
        }
    }


    fun onClickedLogin(emailUser: String, password: String) {
        viewModelScope.launch(Dispatchers.IO){
            val user : User? = getUserUseCase.invoke(emailUser)
            val loginStatus = if(user != null){
                LoginSuccess(user.email)

            } else{
                LoginError
            }

            withContext(Dispatchers.Main){
                loginLiveData.value = loginStatus
            }
        }
    }
}