package com.urbina.isaac.jetpackcompose.ui.composable

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.urbina.isaac.jetpackcompose.model.ItemViewState

@Composable
fun MyComposeList(
    dataList: List<ItemViewState>
) {
    LazyColumn() {
        items(dataList) { data->
            Greeting(name = data.text)
        }
    }
}