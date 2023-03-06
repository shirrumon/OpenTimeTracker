import State.Companion.globalState
import androidx.compose.material3.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.*
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import ui.components.setup.LoginFormComponent
import ui.components.MainScreenComponent
import ui.screens.SetupStepsScreen

@Composable
@Preview
fun app() {
    MaterialTheme {
        //generateLoginPage()
        //generateMainScreen()
        if(globalState.collectAsState().value == "step1") {
            SetupStepsScreen().firstSetupScreen()
        } else {
            generateMainScreen()
        }
    }
}

fun main() = application {
    val windowState = rememberWindowState(size = DpSize(800.dp, 600.dp))
    Window(
        onCloseRequest = ::exitApplication,
        resizable = false,
        title = "OpenTimeTracker",
        state = windowState
    ) {
        app()
    }
}

@Composable
private fun generateLoginPage() {
    LoginFormComponent().generateForm()
}

@Composable
private fun generateMainScreen() {
    MainScreenComponent().generateMainScreen()
}