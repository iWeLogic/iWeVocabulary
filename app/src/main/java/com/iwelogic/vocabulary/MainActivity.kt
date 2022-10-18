package com.iwelogic.vocabulary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.iwelogic.vocabulary.navigation.AppNavigation
import com.iwelogic.vocabulary.navigation.Routes
import com.iwelogic.vocabulary.theme.IWeVocabularyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IWeVocabularyTheme {
                AppNavigation(navController = rememberNavController(), Routes.Main)
            }
        }
    }
}

