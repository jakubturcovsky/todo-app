package com.example.todoapp.ui.edittodo

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.todoapp.R

@Composable
fun EditTodoScreen(
    navigateToTodoListScreen: () -> Unit,
) {

    Button(
        onClick = { navigateToTodoListScreen() },
        shape = RoundedCornerShape(40),
        elevation = ButtonDefaults.elevation(
            defaultElevation = 10.dp,
            pressedElevation = 20.dp,
            disabledElevation = 0.dp,
        )
    ) {
        Icon(
            painter = painterResource(id = R.drawable.arrow),
            contentDescription = "arrow",
            modifier = Modifier.size(20.dp)
        )
        Spacer(modifier = Modifier.width(10.dp))
        Text("Back to Todo List")
    }
}



