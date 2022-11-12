package com.example.todoapp.ui

import android.provider.ContactsContract
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.todoapp.ui.addtodo.AddTodoScreen
import com.example.todoapp.ui.theme.TodoAppTheme
import com.example.todoapp.ui.todolist.TodoListScreen

@Composable
fun TodoApp() {
    TodoAppTheme {
        val navController = rememberNavController()

        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            AppNavHost(navController = navController)
        }
    }
}

@Composable
fun AppNavHost(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = "todolist"
    ) {
        composable("todolist") {
            TodoListScreen(
                navigateToAddTodo = { navController.navigate("addtodo") },
            )
        }
        composable("addtodo") {
            AddTodoScreen(
                navigateToTodoList = { navController.navigate("todolist") }
            )
        }
    }
}
