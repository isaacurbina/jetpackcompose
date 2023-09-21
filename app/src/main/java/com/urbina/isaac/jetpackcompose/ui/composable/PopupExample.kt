package com.urbina.isaac.jetpackcompose.ui.composable

import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.window.Popup
import com.urbina.isaac.jetpackcompose.ui.provider.WindowCenterOffsetPositionProvider

@Composable
fun PopupExample() {
    var popupControl by remember {
        mutableStateOf(false)
    }
    TextButton(onClick = { popupControl = true }) {
        Text(text = "Open normal popup")
    }
    if (popupControl) {
        Popup(
//            alignment = Alignment.Center,
//            offset = IntOffset(0, 700),
            onDismissRequest = { popupControl = false },
//            properties = PopupProperties(
//                focusable = true,
//                dismissOnBackPress = true,
//                excludeFromSystemGesture = true
//            ),
            popupPositionProvider = WindowCenterOffsetPositionProvider()
        ) {
            Greeting(name = "Popup text here")
        }
    }
}