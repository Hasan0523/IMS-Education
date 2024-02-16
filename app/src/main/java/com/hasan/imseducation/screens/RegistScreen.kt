package com.hasan.imseducation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.hasan.imseducation.ui.theme.background


@Preview
@Composable
fun PreviewRegist() {
    RegistScreen(navController = rememberNavController())
}
@Composable
fun RegistScreen(navController: NavController){

    Column (modifier = Modifier
        .fillMaxSize()
        .background(background)) {
        val text = remember { mutableStateOf("Hello") }
          Text(modifier = Modifier
              .fillMaxWidth()
              .padding(vertical = 15.dp), fontSize = 22.sp, text = "IMS Education \n Ro'yxatdan o'ting")
        OutlinedTextField(modifier=Modifier.padding(10.dp),value = text.value, onValueChange = { text.value = it }, label = {Text("Gmail kiriting")}, shape = RoundedCornerShape(16.dp))
        OutlinedTextField(modifier=Modifier.padding(10.dp),value = text.value, onValueChange = { text.value = it }, label = {Text("Kodni kiriting")}, shape = RoundedCornerShape(16.dp))
        Button(onClick = { /*TODO*/ }, modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 60.dp, vertical = 30.dp)) {
            Text(text = "Ro'yxatdan o'tish")
        }

    }

}

