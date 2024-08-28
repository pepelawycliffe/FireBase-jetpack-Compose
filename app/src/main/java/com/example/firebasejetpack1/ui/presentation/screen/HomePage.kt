package com.example.firebasejetpack1.ui.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.firebasejetpack1.ui.presentation.model.AuthState
import com.example.firebasejetpack1.ui.presentation.model.AuthViewModel

@Composable
fun HomePage(navController: NavController,authViewModel: AuthViewModel){
    val authState = authViewModel.authState.observeAsState()
    LaunchedEffect(authState.value) {
        when(authState.value){
            is AuthState.Unauthenticated->navController.navigate("login")
            else->Unit
        }
    }
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Hopepage")
        Spacer(modifier = Modifier.height(20.dp))
        TextButton(onClick = {authViewModel.signOut()}) {
            Text(text = "Sign Out")
        }
    }
}