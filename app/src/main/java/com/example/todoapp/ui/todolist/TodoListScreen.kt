package com.example.todoapp.ui.todolist

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.todoapp.Database
import com.example.todoapp.domain.Todo

@Composable
fun TodoListScreen(
    navigateToAddTodoScreen: () -> Unit,
) {
    val todos = Database.todos

    Column {
        Button(
            onClick = { navigateToAddTodoScreen() }
        ) {
            Text("Create TODO")
        }

        LazyColumn {
            items(todos) { todo ->
                TodoView(todo = todo)
            }
        }
    }
}


@Composable
fun TodoView(todo: Todo) {
    Column() {
        Text(text = todo.title)
        Text(text = todo.description)
    }

}

