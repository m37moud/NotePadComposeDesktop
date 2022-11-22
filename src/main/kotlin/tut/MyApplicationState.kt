package tut

import androidx.compose.runtime.mutableStateListOf

class MyApplicationState {
    val windows = mutableStateListOf<MyWindowState>()

    init {
        windows += myWindowState("utiled")
    }

    fun openNew() {
        windows.add(myWindowState("windows ${windows.size}"))
    }

    fun exit() {
        windows.clear()
    }

    private fun myWindowState(title: String) =
        MyWindowState(title,
            onNewWindow = ::openNew,
            exit = ::exit,
            windows ::remove)
}