package com.iwelogic.vocabulary.navigation

sealed class Routes(val route: String) {
    object Onboarding : Routes("onboarding")
    object Login : Routes("login")
    object SignUp : Routes("sign up")
    object Main : Routes("main")
}
