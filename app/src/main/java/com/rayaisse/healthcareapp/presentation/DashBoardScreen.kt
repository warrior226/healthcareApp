package com.rayaisse.healthcareapp.presentation

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposetutorial.BottomNavigation.Accueil
import com.example.jetpackcomposetutorial.BottomNavigation.Consultation
import com.example.jetpackcomposetutorial.BottomNavigation.MyNavGraph
import com.example.jetpackcomposetutorial.BottomNavigation.NavItemState
import com.example.jetpackcomposetutorial.BottomNavigation.Rdv
import com.example.jetpackcomposetutorial.BottomNavigation.Resultat
import com.rayaisse.healthcareapp.R
import com.rayaisse.healthcareapp.utils.DeviceConfiguration

@Composable
fun DashBoardScreen(modifier: Modifier = Modifier) {

    val items = listOf(
        NavItemState(
            title = "Accueil",
            selectedIcon = painterResource(R.drawable.home_filled),
            unselectedIcon = painterResource(R.drawable.home_default),
        ),
        NavItemState(
            title = "Rendez-vous",
            selectedIcon = painterResource(R.drawable.calendar_filled),
            unselectedIcon =  painterResource(R.drawable.calendar_default)
        ),
        NavItemState(
            title = "Consultations",
            selectedIcon = painterResource(R.drawable.stetoscope_filled),
            unselectedIcon = painterResource(R.drawable.stetoscope_filled)
        ),
        NavItemState(
            title = "Resultats",
            selectedIcon = painterResource(R.drawable.resultat_filled),
            unselectedIcon = painterResource(R.drawable.resultat_filled)
        )
    )

    val navController = rememberNavController()
    val currentBackStackEntry by navController.currentBackStackEntryFlow.collectAsStateWithLifecycle(null)
    var navBarState = when(currentBackStackEntry?.destination?.route){
        Accueil::class.qualifiedName->0
        Rdv::class.qualifiedName->1
        Consultation::class.qualifiedName->2
        Resultat::class.qualifiedName->3
        else->0
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                items.forEachIndexed { index,item ->
                    NavigationBarItem(
                        selected =navBarState==index ,
                        onClick = {
                            val route = when(index) {
                                0 -> Accueil
                                1 -> Rdv
                                2 -> Consultation
                                3 -> Resultat
                                else -> Accueil
                            }

                            navController.navigate(route) {
                                // Pop up to the start destination
                                popUpTo(Accueil) {
                                    saveState = true
                                }
                                // Avoid multiple copies of the same destination
                                launchSingleTop = true
                                // Restore state when reselecting a previously selected item
                                restoreState = true
                            }                                    },
                        icon = {
                            Icon(
                                painter =if(navBarState==index) item.selectedIcon else item.unselectedIcon,
                                contentDescription = item.title,
                                tint = if(navBarState==index) MaterialTheme.colorScheme.primary else Color.Unspecified
                            )
                        },
                        label = {
                            Text(text = item.title)
                        }
                    )
                }
            }
        }
        ,
        contentWindowInsets = WindowInsets.systemBars
    ) {
            innerPadding->

        val rootModifier=Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(MaterialTheme.colorScheme.surfaceContainerLowest)
            .padding(
                horizontal = 16.dp,
                vertical = 24.dp
            )
            .consumeWindowInsets(WindowInsets.navigationBars)

        val windowSizeClass= currentWindowAdaptiveInfo().windowSizeClass
        val deviceConfiguration= DeviceConfiguration.fromWindowSizeClass(windowSizeClass)

        when(deviceConfiguration){
            DeviceConfiguration.MOBILE_PORTRAIT -> {
                Log.d("TAG", "LoginScreen: mobile portrait ")

                Box(
                    modifier =rootModifier,
                    contentAlignment = Alignment.Center
                ){
                    MyNavGraph(navController = navController)
                }


            }
            DeviceConfiguration.MOBILE_LANDSCAPE ->{
                Log.d("TAG", "LoginScreen: mobile lanfscape ")

                Box(
                    modifier = rootModifier,
                    contentAlignment = Alignment.Center
                ){
                    MyNavGraph(navController = navController)
                }


            }
            DeviceConfiguration.TABLET_PORTRAIT,
            DeviceConfiguration.TABLET_LANDSCAPE,
            DeviceConfiguration.DESKTOP ->{

                Box(
                    modifier = rootModifier,
                    contentAlignment = Alignment.Center
                ){
                    MyNavGraph(navController = navController)
                }

            }
        }

    }

}