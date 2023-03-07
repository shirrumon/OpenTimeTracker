package ui.components.setup

import State.Companion.globalState
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import ui.screens.SetupStepsScreen

class SetupFirstStep : SetupStepsScreen() {
    @Composable
    override fun setupContentSide() {

    }

    @Composable
    override fun setNavigationButtons() {
        Column {
            ElevatedButton(
                onClick = {
                    globalState.value = "step2"
                }
            ) {
                Text("Start tracking")
            }
        }
    }

    @Composable
    override fun setupStepDescription() {
        Text(
            "Please select the mode of the application.\u2028You can connect to a remote server or use local tracking by logging into your Atlassian account. You can always change the mode later into application settings.",
            fontSize = 16.sp,
        )
    }
}