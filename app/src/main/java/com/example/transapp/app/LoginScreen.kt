package com.example.transapp.app

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.transapp.TransViewModel

@Composable
fun LoginScreen(transViewModel: TransViewModel,onSignInSuccess:()->Unit){

Column(modifier = Modifier.fillMaxSize().padding(10.dp), verticalArrangement = Arrangement.SpaceEvenly) {
    var login by remember { mutableStateOf("")}
    var pwd by remember{ mutableStateOf("")}
        Text(text = "Enter SuperDispatch",Modifier.fillMaxWidth())
        TextField(value = login, onValueChange = {login=it},Modifier.fillMaxWidth())
        TextField(value = pwd, onValueChange = {pwd=it},Modifier.fillMaxWidth())
        Button(modifier = Modifier.fillMaxWidth(),onClick = {
          if (transViewModel.login(pwd,login)){
              onSignInSuccess()
          }
        } ) {
            Text(text = "Sign In")
        }
    }
}

