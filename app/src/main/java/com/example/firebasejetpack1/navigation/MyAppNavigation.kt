package com.example.firebasejetpack1.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firebasejetpack1.ui.presentation.model.AuthViewModel
import com.example.firebasejetpack1.ui.presentation.screen.HomePage
import com.example.firebasejetpack1.ui.presentation.screen.LoginPage
import com.example.firebasejetpack1.ui.presentation.screen.SignUpPage

@Composable
fun MyAppNavigation(modifier: Modifier,authViewModel:AuthViewModel){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login", builder = {
        composable("login"){LoginPage(navController,authViewModel
        )
        }
        composable("signup"){
            SignUpPage(navController,authViewModel
        )
        }
        composable("login"){
            LoginPage(navController,authViewModel
        )
        }
        composable("home"){
            HomePage(navController,authViewModel
        )
        }
    })

    }
