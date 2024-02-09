package com.hasan.imseducation.screens

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.hasan.imseducation.R
import com.hasan.imseducation.navigation.Screens
import com.hasan.imseducation.ui.theme.ButtonColor
import com.hasan.imseducation.ui.theme.background

@Preview
@Composable
fun loginprw() {
    LoginScreen(navController = rememberNavController())
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController) {
    val context = LocalContext.current
    val username = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(background),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
    ) {

        TextField(modifier = Modifier.padding(12.dp),
            shape = RoundedCornerShape(16.dp),
            colors = TextFieldDefaults.textFieldColors(

                containerColor = Color(android.graphics.Color.parseColor("#ECFEFF")),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
            ),
            textStyle = TextStyle(color = Color.Black),
            value = username.value,

            onValueChange = { username.value = it },
            label = { Text("Username") })

        TextField(modifier = Modifier.padding(12.dp),
            colors = TextFieldDefaults.textFieldColors(

                containerColor = Color(android.graphics.Color.parseColor("#ECFEFF")),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
            ),
            textStyle = TextStyle(color = Color.Black),
            value = password.value,
            shape = RoundedCornerShape(16.dp),
            onValueChange = { password.value = it },
            label = { Text("Parol") })

        Button(
            onClick = {}, modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 100.dp, vertical = 10.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = ButtonColor)

        ) {
            Text(
                text = "Tizimga kirish",
                modifier = Modifier.padding(6.dp),
                color = Color.Black,
                fontSize = 14.sp
            )
        }
        Button(
            onClick = { navController.navigate(Screens.Regist.route) }, modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 100.dp, vertical = 6.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White)

        ) {
            Text(
                text = "Ro'yhatdan o'tish",
                modifier = Modifier.padding(6.dp),
                color = Color.Black,
                fontSize = 14.sp
            )
        }
    }
}
