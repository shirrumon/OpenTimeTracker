import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import ui.components.LoginFormComponent
import ui.components.MainScreenComponent

@Composable
@Preview
fun app() {
    MaterialTheme {
        generateLoginPage()
        //generateMainScreen()
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