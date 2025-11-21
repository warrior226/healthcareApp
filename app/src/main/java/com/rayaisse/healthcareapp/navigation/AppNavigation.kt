package com.rayaisse.healthcareapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.rememberSaveableStateHolderNavEntryDecorator
import androidx.navigation3.ui.NavDisplay
import com.rayaisse.healthcareapp.presentation.DashBoardScreen
import com.rayaisse.healthcareapp.presentation.LoginScreen
import kotlin.compareTo

@Composable
fun AppNavigation(modifier: Modifier = Modifier) {

    val viewModel = viewModel<NavViewModel>()
    val backStack = viewModel.backStack

    NavDisplay(
        backStack = backStack,
        onBack = {
            if (backStack.size > 1) {
                backStack.removeLastOrNull()
            }
        },
        entryDecorators = listOf(
            rememberSaveableStateHolderNavEntryDecorator(),
            rememberViewModelStoreNavEntryDecorator()
        )
    ) { key ->
        when (key) {
            is AppRoutes.LoginScreenRoute-> NavEntry(key) {
                LoginScreen(onNavigateToDashboardScreen = {
                    backStack.add(AppRoutes.DashboardScreenRoute)
                })
            }

            is AppRoutes.DashboardScreenRoute -> NavEntry(key){
                DashBoardScreen()
            }

        }
    }

}