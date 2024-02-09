package com.hasan.imseducation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.hasan.imseducation.R
import com.hasan.imseducation.ui.theme.ButtonColor

@Preview
@Composable
fun PreviewSplash() {
    SplashScreen(navController = rememberNavController())
}


@Composable
fun SplashScreen(navController: NavController) {
    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color.White)){
        Row (horizontalArrangement = Arrangement.Center, modifier = Modifier
            .fillMaxWidth()
            .padding(top = 25.dp)){
            Text(text = "IMS Education", fontSize = 26.sp )
        }
        Row (horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Platformamizga xush kelibsiz", fontSize = 24.sp)
        }
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        //    verticalArrangement = Arrangement.SpaceBetween
        ) {
          //  Spacer(modifier = Modifier.height(0.dp))
            Image(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp), contentScale = ContentScale.Fit, painter = painterResource(R.drawable.ims_img), contentDescription ="Splash Img" )

        }


    }

}
