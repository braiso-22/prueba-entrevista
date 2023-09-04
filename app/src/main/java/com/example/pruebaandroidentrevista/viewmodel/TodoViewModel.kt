package com.example.pruebaandroidentrevista.viewmodel


import android.annotation.SuppressLint
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pruebaandroidentrevista.RetrofitInstance
import com.example.pruebaandroidentrevista.model.Todo
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@SuppressLint("MutableCollectionMutableState")
class TodoViewModel(private val dispatcher: CoroutineDispatcher = Dispatchers.IO) : ViewModel() {
    var _todos: ArrayList<Todo> by mutableStateOf(arrayListOf())
    fun getTodos() {
        viewModelScope.launch(dispatcher) {
            val response = RetrofitInstance.api.getTodos()
            if (response.isSuccessful) {
                _todos = response.body()!!
            }
        }
    }

    fun addTodo(todo: Todo){
        viewModelScope.launch(dispatcher) {
            val response = RetrofitInstance.api.postTodos(todo)
            withContext(Dispatchers.Main){
                if (response.isSuccessful) {
                    getTodos()
                }
            }
        }
    }
}