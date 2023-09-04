package com.example.pruebaandroidentrevista.ui.views

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.pruebaandroidentrevista.model.Todo
import com.example.pruebaandroidentrevista.viewmodel.TodoViewModel

@Composable
fun TodoView(todos: ArrayList<Todo>, TodoViewModel: TodoViewModel) {
    Column {
        Button(onClick = { TodoViewModel.getTodos() }) {
            Text(text = "Get todos")
        }
        TodoList(todos)
    }

}