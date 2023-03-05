package ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

class LoginFormComponent {

    @Composable
    fun generateForm() {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ){
            Column {
                Text("Login to Jira", fontSize = 25.sp)

                Text("Email", fontSize = 15.sp)
                var emailText by remember { mutableStateOf("") }
                TextField(
                    value = emailText,
                    onValueChange = { emailText = it }
                )

                Text("Password", fontSize = 15.sp)
                var passwordText by remember { mutableStateOf("") }
                TextField(
                    value = passwordText,
                    onValueChange = { passwordText = it }
                )

                Button(onClick = {
                    //
                }) {
                    Text("Sign-in")
                }
            }
        }
    }
}