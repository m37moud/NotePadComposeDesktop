// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.window.*
import tut.MyApplicationState
import tut.MyWindowState
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.window.application
import common.LocalAppResources
import common.rememberAppResources




fun main() = application {
    CompositionLocalProvider(LocalAppResources provides rememberAppResources()) {
        NotepadApplication(rememberApplicationState())
    }
}

//
//@Composable
//@Preview
//fun App() {
//    var text by remember { mutableStateOf("Hello, World!") }
//
//    MaterialTheme {
//        Button(onClick = {
//            text = "Hello, Desktop!"
//        }) {
//            Text(text)
//        }
//    }
//}
//
//fun main() = application {
//    val applicationState = remember { MyApplicationState() }
//
//    for (window in applicationState.windows) {
//        key(window) {
//            MyWindow(window)
//        }
//    }
//}
//@Composable
//private fun ApplicationScope.MyWindow(state : MyWindowState)
//= Window(onCloseRequest = state::close , title = state.title){
//    MenuBar {
//        Menu("File"){
//            Item("new window" , onClick = state.onNewWindow)
//            Item("close" , onClick = state::close)
//        }
//    }
//}
