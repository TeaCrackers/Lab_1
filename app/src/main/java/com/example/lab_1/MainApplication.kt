package com.example.lab_1

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.lab_1.ui.theme.Lab_1Theme

import android.app.Application
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController


class MainApplication : Application() {
    @Composable
    fun MyApp() {
        val navController = rememberNavController()
        Lab_1Theme {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                NavGraph(navController = navController)
            }
        }
    }
}
