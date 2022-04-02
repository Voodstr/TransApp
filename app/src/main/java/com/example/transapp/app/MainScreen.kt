package com.example.transapp.app

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.transapp.TransViewModel

@Composable
fun MainScreen(transViewModel: TransViewModel){
    Column(Modifier.fillMaxSize().padding(10.dp), verticalArrangement = Arrangement.SpaceEvenly) {
        Button(onClick = { /*TODO*/ },Modifier.fillMaxWidth()) {
            Text(text = "Update table")
        }
        Button(onClick = { transViewModel.createTable() },Modifier.fillMaxWidth()) {
            Text(text = "Create table")
        }
    }
}