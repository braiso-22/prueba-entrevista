package com.example.pruebaandroidentrevista

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val api: TodoApi by lazy {
        Retrofit.Builder()
            .baseUrl("https://64f5fcf82b07270f705dfc11.mockapi.io")
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
            .create(TodoApi::class.java)
    }
}