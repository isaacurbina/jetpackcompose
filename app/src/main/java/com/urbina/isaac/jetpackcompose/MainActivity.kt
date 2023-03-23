package com.urbina.isaac.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupPositionProvider
import androidx.compose.ui.window.PopupProperties
import com.urbina.isaac.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //ComposeExample()
            //ColumnExample()
            //RowExample()
            //BoxExample()
            PopupExample()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeTheme {
        Greeting("Android")
    }
}

@Composable
fun ComposeExample() {
    JetpackComposeTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
        ) {
            Greeting("Android")
        }
    }
}

@Composable
fun ColumnExample() {
    Column {
        Text(text = "Hello World!")
        Text(text = "Hello World!2")
    }
}

@Composable
fun RowExample() {
    Row {
        Text(text = "Hello World!")
        Text(text = "Hello World!2")
    }
}

@Composable
fun BoxExample() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "This is first text",
            modifier = Modifier.align(Alignment.TopCenter)
        )
        Box(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .fillMaxHeight()
                .widthIn(50.dp)
                .background(Color.Blue)
        )
        Text(
            text = "This is second text",
            modifier = Modifier.align(Alignment.Center)
        )
        FloatingActionButton(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(12.dp),
            onClick = { println("FAB clicked") }
        ) {
            Text(text = "+")
        }
    }
}

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

class WindowCenterOffsetPositionProvider(
    private val x: Int = 0,
    private val y: Int = 0
) : PopupPositionProvider {
    override fun calculatePosition(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: IntSize
    ): IntOffset {
        return IntOffset(
            (windowSize.width - popupContentSize.width) / 2 + x,
            (windowSize.height - popupContentSize.height) / 2 + y
        )
    }
}