package com.example.todoapp.ui.todolist

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.todoapp.Database
import com.example.todoapp.domain.Todo

@Composable
fun TodoListScreen() {
    val todos = Database.todos

    LazyColumn {
        items(todos) { todo ->
            TodoView(todo = todo)
        }
    }
    // 1. Add button for going to AddTodoScreen
    // 2. Implement AddTodoScreen
    // 3. Implement todolist
   // Ma to byt jenom v te TodoListScreen, zadny ListOfTodos na obrazovce pro pridani todo neni.
   // Nikde nevidim, ze bys z databaze brala ten list todocek, ktere chces uzivateli zobrazit
   // Ten state neni potreba, items bere jako parametr ten list todocek, ne state.

}


@Composable
fun TodoView(todo: Todo) {
    Column() {
        Text(text = todo.title)
        Text(text = todo.description)
    }

}

