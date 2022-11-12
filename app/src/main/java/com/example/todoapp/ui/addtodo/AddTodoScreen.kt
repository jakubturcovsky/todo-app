package com.example.todoapp.ui.addtodo

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.todoapp.Database
import com.example.todoapp.domain.Todo



@Composable
fun AddTodoScreen(
    navigateToTodoListScreen: () -> Unit,
) {
    Column {
        TopAppBar(
        ) {
            Text(
                text = "Todo List",
                fontSize = 20.sp,
                color = Color.White,
                modifier = Modifier.padding(start = 7.dp)

            )
        }
        Column(
            modifier = Modifier
                .height(250.dp)
                .fillMaxWidth()
                .padding(all = 30.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.SpaceEvenly


        ) {
            TextFieldTodo(navigateToTodoListScreen)
        }

    }
}


@Composable
fun TextFieldTodo(
    navigateToTodoListScreen: () -> Unit,
) {
    var titleState by remember {
        mutableStateOf("")
    }
    var descriptionState by remember {
        mutableStateOf("")

    }
    OutlinedTextField(
        value = titleState, onValueChange = { titleState = it },
        placeholder = { Text(text = "Title") }
    )

    OutlinedTextField(
        value = descriptionState, onValueChange = { descriptionState = it },
        placeholder = { Text(text = "Description") })

    Button(
        onClick = {
            val todo = Todo(title = titleState, description = descriptionState)
            Database.todos.add(todo)
            navigateToTodoListScreen()
        },
        shape = RoundedCornerShape(40),
        elevation = ButtonDefaults.elevation(
            defaultElevation = 10.dp,
            pressedElevation = 20.dp,
            disabledElevation = 0.dp
        )
    ) {
        Text(text = "Add")
    }
}



