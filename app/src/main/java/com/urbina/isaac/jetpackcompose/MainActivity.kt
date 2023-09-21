package com.urbina.isaac.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.urbina.isaac.jetpackcompose.model.ItemViewState
import com.urbina.isaac.jetpackcompose.ui.composable.MyComposeList

class MainActivity : ComponentActivity() {

    private val dataList = listOf(
        ItemViewState("Hello world!"),
        ItemViewState("Hola mundo!"),
        ItemViewState("Bonjour monde!")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeList(
                dataList = dataList
            )
        }
    }
}
