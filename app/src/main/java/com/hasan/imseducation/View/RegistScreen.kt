package com.hasan.imseducation.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.hasan.imseducation.R
import androidx.compose.material3.Icon as Icon1

@Preview
@Composable
fun RegistSplash() {
    RegistScreen(navController = rememberNavController())
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegistScreen(navController: NavController) {
    val firstName = remember { mutableStateOf("") }
    Column ( modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){

        Image(painter = painterResource(id = R.drawable.ims_img), contentDescription = "", Modifier.padding(16.dp)
        )

        TextField(value = firstName.value , onValueChange = {firstName.value=it.trim()},
            colors=TextFieldDefaults.textFieldColors(
          textColor=Color.Black
                  containerColor = Color(android.graphics.Color.parseColor("#ECFEFF")),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
            ),
            label =  { Text("Ism") },
        leadingIcon = {
            Icon(
                imageVector = Icons.Rounded.Person, contentDescription = "", tint = Color.Black
            )
        })
    }
}