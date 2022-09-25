package com.iwelogic.vocabulary.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.iwelogic.vocabulary.ui.main.MainScreen
import com.iwelogic.vocabulary.ui.onboarding.OnboardingScreen

@Composable
fun AppNavigation(navController: NavHostController) {

    NavHost(navController = navController, startDestination = Routes.Onboarding.route) {
        composable(Routes.Onboarding.route) {
            OnboardingScreen(navController)
        }
        composable(Routes.Main.route) {
            MainScreen()
        }
    }
}