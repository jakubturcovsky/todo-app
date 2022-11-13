package com.example.todoapp.ui.todolist

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.todoapp.Database
import com.example.todoapp.R
import com.example.todoapp.domain.Todo

@Composable
fun TodoListScreen(
    navigateToAddTodoScreen: () -> Unit,
    navigateToEditTodoScreen: () -> Unit,
) {
    val todos = Database.todos

    Column(
        modifier = Modifier
            .padding(start = 15.dp, top = 15.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.Start

    ) {
        Row(
            modifier = Modifier
            .height(70.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically

        ) {
            Button(
                onClick = { navigateToAddTodoScreen() },
                shape = RoundedCornerShape(40),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 10.dp,
                    pressedElevation = 20.dp,
                    disabledElevation = 0.dp
                )
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.plus),
                    contentDescription = "plus icon",
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text("Create TODO")
            }

            Button(
                onClick = { navigateToEditTodoScreen() },
                shape = RoundedCornerShape(40),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 10.dp,
                    pressedElevation = 20.dp,
                    disabledElevation = 0.dp
                )
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.pencil),
                    contentDescription = "plus icon",
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text("Edit TODO")

            }
        }
        Divider(modifier = Modifier
            .padding(end=15.dp),
            startIndent = 0.dp, color = Color.LightGray, thickness = 1.dp)

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
        Text(text = todo.title, fontSize = 25.sp, fontWeight = FontWeight.Bold)
        Text(text = todo.description, fontSize = 15.sp, fontStyle = FontStyle.Italic)
    }

}




