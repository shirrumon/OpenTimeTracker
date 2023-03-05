package ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainScreenComponent {

    @Composable
    fun generateMainScreen() {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(10.dp)
        ){
            Column{
                Row(
                ){
                    Column {
                        Row{
                            Text("ZD-24 Do some function")
                        }
                        Row{
                            Text("01:13:54")
                        }
                    }
                }
            }

            Column {
                Row(
                ){
                    Column {
                        var taskName by remember { mutableStateOf("") }
                        TextField(
                            value = taskName,
                            onValueChange = { taskName = it }
                        )

                        Button(onClick = {
                            //
                        }) {
                            Text("Start tracking")
                        }
                    }
                }
            }
        }
    }
}