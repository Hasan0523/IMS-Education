package com.hasan.imseducation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Preview
@Composable
fun HomeSplash() {
    HomeScreen(navController = rememberNavController())
}

@Composable
fun HomeScreen(navController: NavController) {
    Column {

    }
}