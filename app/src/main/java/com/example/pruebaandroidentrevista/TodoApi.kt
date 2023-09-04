package com.example.pruebaandroidentrevista

import com.example.pruebaandroidentrevista.model.Todo
import retrofit2.Response
import retrofit2.http.GET

interface TodoApi {
    @GET("/todos")
    suspend fun getTodos(): Response<ArrayList<Todo>>

}