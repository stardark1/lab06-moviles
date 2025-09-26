package com.example.lab06

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopBar(
    onNavigationClick: () -> Unit = {},
    onSearchClick: () -> Unit = {},
    onProfileClick: () -> Unit = {}
) {
    TopAppBar(
        navigationIcon = {
            IconButton(onClick = onNavigationClick) {
                Icon(imageVector = Icons.Rounded.Menu, contentDescription = "Menú")
            }
        },
        title = { Text(text = "Mi Aplicación") },
        actions = {
            IconButton(onClick = onSearchClick) {
                Icon(imageVector = Icons.Rounded.Search, contentDescription = "Buscar")
            }
            IconButton(onClick = onProfileClick) {
                Icon(imageVector = Icons.Outlined.AccountCircle, contentDescription = "Perfil")
            }
        }
    )
}
