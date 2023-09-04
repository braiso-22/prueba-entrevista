package com.example.pruebaandroidentrevista

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pruebaandroidentrevista.ui.theme.PruebaAndroidEntrevistaTheme
import com.example.pruebaandroidentrevista.ui.views.TodoView
import com.example.pruebaandroidentrevista.viewmodel.TodoViewModel

class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<TodoViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PruebaAndroidEntrevistaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        TodoView(todos = viewModel._todos, TodoViewModel = viewModel)
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PruebaAndroidEntrevistaTheme {
        Greeting("Android")
    }
}