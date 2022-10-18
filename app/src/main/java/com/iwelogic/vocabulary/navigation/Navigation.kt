package com.iwelogic.vocabulary.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.iwelogic.login_presentation.LoginScreen
import com.iwelogic.login_presentation.SignUpScreen
import com.iwelogic.main_presentation.MainScreen
import com.iwelogic.onboarding_presentation.OnboardingScreen

@Composable
fun AppNavigation(navController: NavHostController, startDestination: Routes) {

    NavHost(navController = navController, startDestination = startDestination.route) {

        composable(Routes.Onboarding.route) {
            OnboardingScreen {

            }
        }
        composable(Routes.SignUp.route) {
            SignUpScreen()
        }
        composable(Routes.Login.route) {
            LoginScreen({
                navController.navigate(Routes.SignUp.route)
            })
        }
        composable(Routes.Main.route) {
            MainScreen()
        }
    }
}