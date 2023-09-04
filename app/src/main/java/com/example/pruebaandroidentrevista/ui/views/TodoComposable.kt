package com.example.pruebaandroidentrevista.ui.views

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pruebaandroidentrevista.model.Todo

@Composable
fun TodoComposable(todo: Todo) {
    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column {
            Text(text = todo.title)
            Text(text = todo.id.toString())
            Text(text = todo.userId.toString())
            Text(text = if (todo.completed) "Completed" else "In progress")
        }
    }
}