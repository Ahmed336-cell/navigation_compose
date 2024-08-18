package com.example.myapplication



sealed class AppDataSeald(val route:String){
    data object FIRSTSCREEN :AppDataSeald("screen1")
    data object SECONDSCREEN :AppDataSeald("screen2")
    data object THIRDSCREEN :AppDataSeald("screen3")

}