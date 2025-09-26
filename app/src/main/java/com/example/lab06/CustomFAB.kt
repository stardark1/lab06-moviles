package com.example.lab06

import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun CustomFAB(onClick: () -> Unit) {
    FloatingActionButton(onClick = onClick) {
        Text(
            fontSize = 24.sp,
            text = "+"
        )
    }
}
