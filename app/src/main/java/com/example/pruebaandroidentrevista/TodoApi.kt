package com.example.pruebaandroidentrevista

import com.example.pruebaandroidentrevista.model.Todo
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface TodoApi {
    @GET("/todos")
    suspend fun getTodos(): Response<ArrayList<Todo>>

    @POST("/todos")
    suspend fun postTodos(@Body todo: Todo): Response<Todo>

}