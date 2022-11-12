package com.example.todoapp.ui.todolist

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun TodoListScreen(
    navigateToAddTodo: () -> Unit,
) {
    // 1. Add button for going to AddTodoScreen
    // 2. Implement AddTodoScreen
    // 3. Implement todolist
    Column {
        Text(text = "TodoListScreen")

        Button(onClick = { navigateToAddTodo() }) {
            Text("Add TODO")
        }
    }
}

