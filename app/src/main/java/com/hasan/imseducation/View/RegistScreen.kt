package com.hasan.imseducation.View

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Preview
@Composable
fun RegistSplash() {
    RegistScreen(navController = rememberNavController())
}

@Composable
fun RegistScreen(navController: NavController) {
    Column {

    }
}