package com.urbina.isaac.jetpackcompose.ui.composable

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.urbina.isaac.jetpackcompose.ui.theme.JetpackComposeTheme

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeTheme {
        Greeting("Android")
    }
}