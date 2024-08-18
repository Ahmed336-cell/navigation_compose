package com.example.myapplication.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.AppDataSeald
import com.example.myapplication.R


@Composable
fun Screen2(navHost: NavController,name:String?) {
    Column(modifier = Modifier
        .statusBarsPadding()
        .fillMaxSize()) {

        Image(
            painter = painterResource(R.drawable.image),
            contentDescription = "",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.weight(1f)
        )

        Card(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
        ) {
            Column {
                Text(text = "Hello $name from First Screen",textAlign = TextAlign.Center,

                    modifier = Modifier.fillMaxWidth()
                        .padding()
                        .size(30.dp)
                        .background(color = Color.LightGray),
                    fontSize = 30.sp
                )

                Button(onClick = {
                    navHost.navigate(AppDataSeald.THIRDSCREEN.route)
                }) {
                    Text(text = "Go to third Screen")
                }
            }
        }
    }
}
