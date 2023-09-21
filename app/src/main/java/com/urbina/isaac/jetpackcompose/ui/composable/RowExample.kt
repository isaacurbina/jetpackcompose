package com.urbina.isaac.jetpackcompose.ui.composable

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun RowExample() {
    Row {
        Text(text = "Hello World!")
        Text(text = "Hello World!2")
    }
}