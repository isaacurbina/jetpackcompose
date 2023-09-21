package com.urbina.isaac.jetpackcompose.ui.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun ColumnExample() {
    Column {
        Text(text = "Hello World!")
        Text(text = "Hello World!2")
    }
}