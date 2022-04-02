package com.example.transapp.app

import androidx.annotation.StringRes
import com.example.transapp.R
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.lifecycle.ViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.transapp.TransViewModel

@Composable
fun TransApp(transViewModel: TransViewModel) {
    val navController = rememberNavController()
    val navHost = NavHost(navController = navController, startDestination = NavigationScreens.Login.route) {
        composable(NavigationScreens.Login.route){
            LoginScreen(transViewModel = transViewModel, onSignInSuccess = {navController.navigate(NavigationScreens.Main.route)})
            }
        composable(NavigationScreens.Main.route){
            MainScreen(transViewModel = transViewModel)
        }
    }
}

enum class NavigationScreens(
    val route: String,
    @StringRes val resourceId: Int,
    val icon: ImageVector
) {
    Login("home/current", R.string.Login, Icons.Filled.Done),
    Main("home/Main", R.string.Main, Icons.Filled.Home),
    //SORT("sort", R.string.Sort, Icons.Filled.List)
}