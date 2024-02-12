package com.hasan.imseducation.navigation

sealed class Screens(val route:String) {


object Splash : Screens ("splash_Screen")
object Regist : Screens("regist_screen")
object Login : Screens("regist_screen")
object Home : Screens("home_screen")
object Hometech : Screens("hometech_screen")
object Chat : Screens("chat")}
object Chat: Screens("chat_screen" + "/{key}")
object ChangePassword: Screens("changepasswor_screen")