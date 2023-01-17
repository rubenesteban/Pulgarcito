package com.example.pulgarcito

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@ExperimentalFoundationApi
@Composable
fun WellnesTaskList(
    list: List<WellnessTask>,
    onCloseTask:(WellnessTask) -> Unit,
    onAddTask:(WellnessTask) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = Modifier) {
        items(items = list, key = { wrap -> wrap.id }) { wrap ->
            wellnessWrapItem(taskName = wrap.label, onClose = { onCloseTask(wrap) },
                onAdd = { onCloseTask(wrap) })
        }
    }
}

@Composable
fun wellnessWrapItem(
    taskName:String,
    onClose: () -> Unit,
    onAdd: () -> Unit,
    modifier: Modifier = Modifier
){
    Card(
        modifier = Modifier
            .width(151.dp)
            .height(190.dp)
            .padding(8.dp)
            .clickable {
                onClose()
                onAdd()
            },
        elevation = 10.dp
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = taskName, fontSize = 18.sp)
        }
    }

}
