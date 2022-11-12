package com.example.todoapp.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.todoapp.ui.addtodo.AddTodoScreen
import com.example.todoapp.ui.todolist.TodoListScreen

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
                navigateToAddTodoScreen = { navController.navigate("addtodo") },
            )
        }
        composable("addtodo") {
            AddTodoScreen(
                navigateToTodoListScreen = { navController.navigate("todolist") }
            )
        }
    }
}
