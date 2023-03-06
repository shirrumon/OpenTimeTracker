import kotlinx.coroutines.flow.MutableStateFlow

class State {
    companion object {
        val globalState: MutableStateFlow<String> = MutableStateFlow("step1")
    }
}