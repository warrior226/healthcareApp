package com.example.jetpackcomposetutorial.BottomNavigation

import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector

data class NavItemState(
    val title: String,
    val selectedIcon: Painter,
    val unselectedIcon: Painter
)