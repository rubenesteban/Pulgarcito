package com.example.pulgarcito

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch


@ExperimentalFoundationApi
@Composable
fun GameScreen(
    modifier: Modifier = Modifier,
    viewModel: GameViewModel = androidx.lifecycle.viewmodel.compose.viewModel(),

    ) {

    val gameUiState by viewModel.punto.collectAsState()
    val context = LocalContext.current
    // scope
    val scope = rememberCoroutineScope()
    // datastore Email
   // val dataStore = StoreUserEmail(context)
    // get saved email
   // val savedEmail = dataStore.getEmail.collectAsState(initial = "")

   // var email = gameUiState.usedCards

    //var UserGuess = gameUiState.currentCards

    Column( modifier = modifier
        .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Button(
            modifier = modifier
                .width(151.dp)
                .height(70.dp)
                .padding(start = 8.dp),
            onClick = { scope.launch {

                viewModel.hola()

            } }
        ) {
            Text(text = "Hulk", fontSize = 18.sp)
        }
        Row(modifier = modifier
            .padding(16.dp),
        ){

            // MasTaskList(list = email)
            //MasTaskList(list = UserGuess)


            WellnesTaskList(list = viewModel.tasks,
                onCloseTask = {gol -> viewModel.remove(gol)},
                onAddTask = {gol -> viewModel.gult(gol)})

        }

    }
}

