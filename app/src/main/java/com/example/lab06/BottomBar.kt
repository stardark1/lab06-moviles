package com.example.lab06

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun CustomBottomBar(navController: NavHostController) {
    BottomAppBar {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            IconButton(onClick = {
                navController.navigate("home") { launchSingleTop = true }
            }) {
                Icon(Icons.Filled.Home, contentDescription = "Home")
            }
            IconButton(onClick = {
                navController.navigate("settings") { launchSingleTop = true }
            }) {
                Icon(Icons.Filled.Settings, contentDescription = "Settings")
            }
            IconButton(onClick = {
                navController.navigate("favorite") { launchSingleTop = true }
            }) {
                Icon(Icons.Filled.Favorite, contentDescription = "Favorite")
            }
            IconButton(onClick = {
                navController.navigate("info") { launchSingleTop = true }
            }) {
                Icon(Icons.Filled.Info, contentDescription = "Info")
            }
        }
    }
}
