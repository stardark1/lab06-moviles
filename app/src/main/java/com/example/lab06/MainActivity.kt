package com.example.lab06

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab06.ui.theme.Lab06Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab06Theme {
                AppContent()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppContent() {
    val navController = rememberNavController()

    // Estado del contador para el FAB
    var clickCount by remember { mutableStateOf(0) }

    Scaffold(
        topBar = {
            CustomTopBar(
                onNavigationClick = { /* Ejemplo: abrir Drawer */ },
                onSearchClick = { /* Acción búsqueda */ },
                onProfileClick = { navController.navigate("profile") }
            )
        },
        bottomBar = {
            CustomBottomBar(navController)
        },
        floatingActionButton = {
            CustomFAB { clickCount++ }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "home",
            modifier = Modifier.padding(innerPadding)
        ) {
            composable("home") { HomeScreen(clickCount) }
            composable("settings") { SettingsScreen() }
            composable("favorite") { FavoriteScreen() }
            composable("info") { InfoScreen() }
            composable("profile") { ProfileScreen(onBack = { navController.popBackStack() }) }
        }
    }
}




