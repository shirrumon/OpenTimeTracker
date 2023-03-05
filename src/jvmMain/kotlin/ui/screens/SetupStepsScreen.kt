package ui.screens

import androidx.compose.runtime.Composable
import ui.components.setup.LoginFormComponent

class SetupStepsScreen {
    @Composable
    fun firstSetupScreen() {
        LoginFormComponent().generateForm()
    }
}