package com.example.projetmathisdenis42.data

import com.example.projetmathisdenis42.presentation.model.PaysAmeriqueCentrale
import retrofit2.Call
import retrofit2.http.GET

interface acAPI {
    @GET("americancent.json")
    fun getPays(): Call<List<PaysAmeriqueCentrale>>
}