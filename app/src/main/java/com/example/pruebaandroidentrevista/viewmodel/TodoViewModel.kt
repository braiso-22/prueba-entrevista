package com.example.pruebaandroidentrevista.viewmodel


import android.annotation.SuppressLint
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pruebaandroidentrevista.RetrofitInstance
import com.example.pruebaandroidentrevista.model.Todo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@SuppressLint("MutableCollectionMutableState")
class TodoViewModel : ViewModel() {
    var _todos: ArrayList<Todo> by mutableStateOf(arrayListOf())
    fun getTodos() {
        viewModelScope.launch(Dispatchers.IO) {
            val response = RetrofitInstance.api.getTodos()
            if (response.isSuccessful) {
                _todos = response.body()!!
            }
        }
    }
}