package com.example.lab06

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SettingsScreen() {
    FeatureScreenContent("Pantalla Settings", "Aquí puedes configurar la aplicación")
}

@Composable
fun FavoriteScreen() {
    FeatureScreenContent("Pantalla Favoritos", "Estos son tus elementos favoritos")
}

@Composable
fun InfoScreen() {
    FeatureScreenContent("Pantalla Info", "Información de la aplicación")
}

@Composable
private fun FeatureScreenContent(title: String, subtitle: String) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = title,
                fontSize = 22.sp,
                style = MaterialTheme.typography.headlineMedium
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = subtitle,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}
