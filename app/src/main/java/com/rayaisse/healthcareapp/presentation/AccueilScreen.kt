package com.example.jetpackcomposetutorial.BottomNavigation

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowDownward
import androidx.compose.material.icons.filled.ArrowUpward
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rayaisse.healthcareapp.R
import com.rayaisse.healthcareapp.data.Disponibilite
import com.rayaisse.healthcareapp.design_component.DisponibiliteItem
import com.rayaisse.healthcareapp.utils.DeviceConfiguration
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale

@Composable
fun AccueilScreen(modifier: Modifier = Modifier) {

    var todayDate by remember { mutableStateOf(LocalDate.now().format( DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", Locale.FRENCH))) }
    var listDisponibilite = ArrayList<Disponibilite>()
    val listState = rememberLazyListState()
    val items= listOf(
        Disponibilite(dateDisponibilite = LocalDate.now().format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", Locale.FRENCH)), heureDebut = "9h10", heureFin = "10h10"),
        Disponibilite(dateDisponibilite = LocalDate.now().format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", Locale.FRENCH)), heureDebut = "9h10", heureFin = "10h10"),
        Disponibilite(dateDisponibilite = LocalDate.now().format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", Locale.FRENCH)), heureDebut = "9h10", heureFin = "10h10"),
        Disponibilite(dateDisponibilite = LocalDate.now().format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", Locale.FRENCH)), heureDebut = "9h10", heureFin = "10h10"),
        Disponibilite(dateDisponibilite = LocalDate.now().format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", Locale.FRENCH)), heureDebut = "9h10", heureFin = "10h10"),
        Disponibilite(dateDisponibilite = LocalDate.now().format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", Locale.FRENCH)), heureDebut = "9h10", heureFin = "10h10")
    )

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        contentWindowInsets = WindowInsets.systemBars,
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Action */ },
                containerColor =MaterialTheme.colorScheme.primary,
                contentColor = Color.White
            ) {
                Icon(Icons.Filled.Add, contentDescription = "Add")
            }

        }
    ) {
            innerPadding->

        val rootModifier=Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(MaterialTheme.colorScheme.surfaceContainerLowest)
            .padding(
                horizontal = 2.dp,
                vertical = 15.dp
            )
            .consumeWindowInsets(WindowInsets.navigationBars)

        val windowSizeClass= currentWindowAdaptiveInfo().windowSizeClass
        val deviceConfiguration= DeviceConfiguration.fromWindowSizeClass(windowSizeClass)

        when(deviceConfiguration){
            DeviceConfiguration.MOBILE_PORTRAIT -> {
                Log.d("TAG", "LoginScreen: mobile portrait ")

                Column(
                    modifier=rootModifier
                ){
                    Card(
                        modifier= Modifier.fillMaxWidth(),
                        elevation = CardDefaults.cardElevation(5.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.primary
                        )

                    ){
                        Row(
                            modifier= Modifier.fillMaxWidth().padding( 5.dp)
                        ) {
                            Column(
                                modifier= Modifier.weight(1f)
                            ) {
                                Text(
                                    text ="Dr "+"RAYAISSE Patrick",
                                    maxLines = 1,
                                    style = MaterialTheme.typography.bodyMedium,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    text ="Contact: "+"65272174",
                                    maxLines = 1,
                                    style = MaterialTheme.typography.bodyMedium,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    text ="Cardiologie",
                                    maxLines = 1,
                                    style = MaterialTheme.typography.bodyMedium,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                            Image(
                                modifier = Modifier.size(60.dp).clip(CircleShape),
                                painter = painterResource(R.drawable.logo),
                                contentDescription ="Profile Avatar",
                                contentScale = ContentScale.Crop
                            )

                        }

                    }

                    Spacer(modifier = Modifier.size(10.dp))
                    Text(
                        text = "Date : $todayDate",
                        maxLines = 1,
                        style = MaterialTheme.typography.bodySmall,
                        fontWeight = FontWeight.Normal
                    )
                    Spacer(modifier = Modifier.size(15.dp))
                    Text(
                        modifier= Modifier.fillMaxWidth(),
                        text = "Programme de disponibilité",
                        maxLines = 1,
                        style = MaterialTheme.typography.bodyLarge,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        color = MaterialTheme.colorScheme.primary
                    )

                    Spacer(modifier = Modifier.size(10.dp))

                    Box(
                        modifier = Modifier.fillMaxWidth()
                            .fillMaxHeight(0.75f),
                      contentAlignment = Alignment.Center
                    ) {
                        LazyColumn(state = listState){
                            itemsIndexed(items) { index,item->
                                DisponibiliteItem(disponibilite =item,onDeleteClick={},onEditClick={}, textSize =5.sp)

                                if(index<items.lastIndex){
                                    Spacer(modifier = Modifier.height(10.dp))
                                }


                            }

                        }
                        // Scrollbar
                        // Show "scroll up to top" indicator
                        if (listState.canScrollBackward) {
                            Icon(
                                imageVector = Icons.Default.ArrowUpward,
                                contentDescription = "Scroll up",
                                modifier = Modifier
                                    .align(Alignment.TopCenter)
                                    .padding(16.dp),
                                tint = MaterialTheme.colorScheme.primary
                            )
                        }
                        // Show "more content below" indicator
                        if (listState.canScrollForward) {
                            Icon(
                                imageVector = Icons.Default.ArrowDownward,
                                contentDescription = "Scroll down",
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .padding(16.dp),
                                tint = MaterialTheme.colorScheme.primary
                            )
                        }

                    }

                }


            }

            DeviceConfiguration.MOBILE_LANDSCAPE ->{
                Log.d("TAG", "LoginScreen: mobile lanfscape ")

                Column(
                    modifier=rootModifier
                ){
                    Card(
                       modifier= Modifier.fillMaxWidth()
                    ){

                    }

                }

            }
            DeviceConfiguration.TABLET_PORTRAIT,
            DeviceConfiguration.TABLET_LANDSCAPE,
            DeviceConfiguration.DESKTOP ->{

                Column(
                    modifier=rootModifier
                ){

                }

            }
        }

    }

}

@Composable
@Preview(showBackground = true)
fun AccueilScreenPreview() {
    AccueilScreen()
}
