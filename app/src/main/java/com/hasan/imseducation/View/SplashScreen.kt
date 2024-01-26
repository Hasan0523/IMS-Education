package com.hasan.imseducation.View

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Preview
@Composable
fun PreviewSplash() {
    SplashScreen(navController = rememberNavController())
}


@Composable
fun SplashScreen(navController: NavController) {

}
