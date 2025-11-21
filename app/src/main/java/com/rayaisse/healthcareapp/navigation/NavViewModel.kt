package com.rayaisse.healthcareapp.navigation

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel

class NavViewModel: ViewModel() {

    val backStack =mutableStateListOf<AppRoutes>(AppRoutes.LoginScreenRoute)
   // val backStack =mutableStateListOf<AppRoutes>(AppRoutes.OfflineHomeRoute)

}