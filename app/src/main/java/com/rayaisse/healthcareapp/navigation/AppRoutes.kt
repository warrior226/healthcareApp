package com.rayaisse.healthcareapp.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
sealed class AppRoutes : NavKey {
    @Serializable
    data object LoginScreenRoute:AppRoutes()
    @Serializable
    data object DashboardScreenRoute:AppRoutes()

}

