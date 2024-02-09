package com.hasan.imseducation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.hasan.imseducation.screens.HomeScreen
import com.hasan.imseducation.screens.LoginScreen
import com.hasan.imseducation.screens.RegistScreen
import com.hasan.imseducation.screens.SplashScreen

@Composable
fun NavGraph (){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.Splash.route)
    {
        composable(route = Screens.Splash.route){
            SplashScreen(navController)
        }
        composable(route = Screens.Home.route) {
            HomeScreen(navController)
        }
        composable(route = Screens.Regist.route) {
            RegistScreen(navController)
        }
       composable(route=Screens.Login.route){
           LoginScreen(navController)
       }
    }
}