package com.hasan.imseducation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.hasan.imseducation.navigation.Screens
import com.hasan.imseducation.ui.theme.ButtonColor

@Preview
@Composable
fun RegistSplash() {
    RegistScreen(navController = rememberNavController())
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegistScreen(navController: NavController) {
    val firstName = remember { mutableStateOf("") }
    val context = LocalContext.current
    var pressed = false
    val userName = remember { mutableStateOf("") }
    val lastName = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
    Column ( modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        TextField(
            modifier = Modifier.padding(12.dp),
            shape = RoundedCornerShape(16.dp),
            //shape Card viyuv ni vazifasini bajarmoqa
            value = firstName.value,
            onValueChange = { firstName.value = it.trim() },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(android.graphics.Color.parseColor("#ECFEFF")),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
            ),
            label = { Text("Ism") },
            leadingIcon ={
                Icon(
                    imageVector = Icons.Rounded.Person, contentDescription = "", tint = Color.Black
                )
            }
        )
        TextField(modifier = Modifier.padding(12.dp),
            shape = RoundedCornerShape(16.dp),
            colors = TextFieldDefaults.textFieldColors(

                containerColor = Color(android.graphics.Color.parseColor("#ECFEFF")),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
            ),
            value = lastName.value,

            onValueChange = { lastName.value = it.trim() },
            label = { Text("Familiya")},
            leadingIcon ={
                Icon(
                    imageVector = Icons.Rounded.Person, contentDescription = "", tint = Color.Black
                )
            })
        TextField(modifier = Modifier.padding(12.dp),
            colors = TextFieldDefaults.run {
                textFieldColors(

                        containerColor = Color(android.graphics.Color.parseColor("#ECFEFF")),
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                    )
            },
            textStyle = TextStyle(color = Color.Black),
            value = password.value,
            shape = RoundedCornerShape(16.dp),
            onValueChange = { password.value = it.trim()},
            label = { Text("Parol") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Rounded.Lock, contentDescription = "", tint = Color.Black
                )
            },
        )
        Button(
            onClick = {}, modifier = Modifier .fillMaxWidth()
                .padding(horizontal = 100.dp, vertical = 6.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = ButtonColor)

        ) {
            Text(
                text = "Ro'yhatdan o'tish",
                modifier = Modifier .padding(6.dp),
                color = Color.Black,
                fontSize = 14.sp
            )
        }

        Button(
            onClick = {
                navController.navigate(Screens.Login.route)
            }, modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 100.dp, vertical = 10.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White)

        ) {
            Text(
                text = "Tizimga kirish",
                modifier = Modifier .padding(6.dp),
                color = Color.Black,
                fontSize = 14.sp
            )
        }

    }

}


