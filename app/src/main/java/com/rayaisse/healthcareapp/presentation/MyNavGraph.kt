package com.example.jetpackcomposetutorial.BottomNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import kotlinx.serialization.Serializable
import androidx.navigation.compose.composable
import com.rayaisse.healthcareapp.presentation.ConsultationScreen

@Composable
fun MyNavGraph(navController: NavHostController){

    NavHost(navController = navController, startDestination =Accueil){
        composable<Accueil>{
            AccueilScreen()
        }

        composable<Rdv>{
            RdvScreen()
        }
        composable<Consultation>{
            ConsultationScreen()
        }
        composable<Resultat>{
            ResultatScreen()
        }

    }
}

@Serializable
object Accueil

@Serializable
object Rdv

@Serializable
object Consultation

@Serializable
object Resultat
