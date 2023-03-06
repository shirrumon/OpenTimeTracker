package ui.components.setup

import State.Companion.globalState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ui.screens.SetupStepsScreen

class SetupFirstStep: SetupStepsScreen() {
    @Composable
    override fun setupContentSide() {
        Column {
            Column(
                modifier = Modifier
                    .padding(top = 35.dp)
            ) {
                Text("Setup master", fontSize = 28.sp)
                Text(
                    "Please select the mode of the application.\u2028You can connect to a remote server or use local tracking by logging into your Atlassian account. You can always change the mode later into application settings.",
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(top = 20.dp)
                )
            }

            Column {
                Button(onClick = {
                    globalState.value = "step2"
                }) {
                    Text("Start tracking")
                }
            }
        }
    }
}