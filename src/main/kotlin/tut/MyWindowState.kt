package tut

class MyWindowState(
    val title: String,
    val onNewWindow: () -> Unit,
    val exit: () -> Unit,
    private val close: (MyWindowState) ->Unit
) {
    fun close() = close(this)
}