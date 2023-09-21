package com.urbina.isaac.jetpackcompose.ui.composable

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview
@Composable
fun GreetingPreview() {
    Greeting(name = "Hello world!")
}