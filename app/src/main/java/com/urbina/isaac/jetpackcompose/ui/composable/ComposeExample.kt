package com.urbina.isaac.jetpackcompose.ui.composable

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.urbina.isaac.jetpackcompose.ui.theme.JetpackComposeTheme

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