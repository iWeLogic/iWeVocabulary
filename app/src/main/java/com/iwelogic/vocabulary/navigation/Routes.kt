package com.iwelogic.vocabulary.navigation

sealed class Routes(val route: String) {
    object Onboarding : Routes("onboarding")
    object Main : Routes("main")
}
