package com.example.firebasejetpack1.ui.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.firebasejetpack1.ui.presentation.model.AuthViewModel
import com.example.firebasejetpack1.ui.theme.FirebaseJetpack1Theme

@Composable
fun LoginPage(navController: NavController, authViewModel: AuthViewModel){
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Scaffold {
        paddingValues ->
        Column(modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize()) {
        }
        Box(modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFE9E3CB),
                        Color(0xFF5A7C76)
                    )
                )
            )){
//            start filled
            Column (modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = "Login page" , fontSize = 32.sp)
                Spacer(modifier = Modifier.height(16.dp))
                OutlinedTextField(
                    value = email,
                    onValueChange = {
                        email =it },
                    modifier =Modifier,
                    label = { Text(text = "Email")},
                    shape = CircleShape,
                )
                Spacer(modifier = Modifier.height(16.dp))
                OutlinedTextField(
                    value = password,
                    onValueChange = {
                        password =it },
                    modifier =Modifier,
                    label = { Text(text = "Password")},
                    shape = CircleShape,
                )
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "LOGIN")
                }
                Spacer(modifier = Modifier.height(16.dp))
                TextButton(onClick = { navController.navigate("signup")}) {
                    Text(text = "Don't have an account , Signup")
                }
            }
        }

    }
}
