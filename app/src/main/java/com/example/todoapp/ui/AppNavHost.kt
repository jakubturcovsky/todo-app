package com.example.todoapp.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.todoapp.ui.addtodo.AddTodoScreen
import com.example.todoapp.ui.edittodo.EditTodoScreen
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
                navigateToEditTodoScreen = { navController.navigate("edittodo")}
            )
        }
        composable("addtodo") {
            AddTodoScreen(
                navigateToTodoListScreen = { navController.navigate("todolist") },
            )
        }

        composable("edittodo") {
            EditTodoScreen(
                navigateToTodoListScreen = { navController.navigate("todolist") },
            )
        }

    }
}
