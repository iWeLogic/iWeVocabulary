package com.iwelogic.vocabulary.ui.onboarding

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.iwelogic.vocabulary.navigation.Routes

@Composable
fun OnboardingScreen(navHostController: NavHostController) {
    Button(onClick = {
        navHostController.navigate(Routes.Main.route)
    }) {
        Text(text = "OPEN MAIN")
    }
}