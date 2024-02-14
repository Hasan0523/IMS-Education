package com.hasan.imseducation.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Preview
@Composable
fun PreviewLogin() {
    SplashScreen(navController = rememberNavController())
}
@Composable
fun LoginScreen(navController: NavController){

}