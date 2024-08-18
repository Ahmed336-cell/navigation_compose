package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.myapplication.screens.Screen1
import com.example.myapplication.screens.Screen2
import com.example.myapplication.screens.Screen3

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            
          Navigation()
        }
    }

     @Composable
     fun Navigation() {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = AppDataSeald.FIRSTSCREEN.route ){
           composable(AppDataSeald.FIRSTSCREEN.route) {
               Screen1(navHost = navController)
           }
            composable("${AppDataSeald.SECONDSCREEN.route}/{name}",
                arguments = listOf(navArgument("name"){
                    type=NavType.StringType
                })
                ){enteryBackStack->
                Screen2(navHost = navController,enteryBackStack.arguments?.getString("name"))
            }
            composable(AppDataSeald.THIRDSCREEN.route){
                Screen3(navController)
            }
        }


    }


}



