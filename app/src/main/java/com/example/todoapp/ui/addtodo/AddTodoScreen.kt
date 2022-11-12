package com.example.todoapp.ui.addtodo

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun AddTodoScreen(
    navigateToTodoList: () -> Unit,
) {
    // Title
    // Description
    // Button for creating & saving todo
    Column {
        Text(text = "Add TODO")

        Button(onClick = { navigateToTodoList() }) {
            Text(text = "Create TODO")
        }
    }
}
