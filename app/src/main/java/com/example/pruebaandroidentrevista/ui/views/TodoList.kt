package com.example.pruebaandroidentrevista.ui.views

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.pruebaandroidentrevista.model.Todo

@Composable
fun TodoList(todoList: ArrayList<Todo>) {
    LazyColumn {
        items(todoList) { todo ->
            TodoComposable(todo)
        }
    }
}