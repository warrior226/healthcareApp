package com.rayaisse.healthcareapp.presentation

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDownward
import androidx.compose.material.icons.filled.ArrowUpward
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rayaisse.healthcareapp.data.model.Examen
import com.rayaisse.healthcareapp.data.model.Rdv
import com.rayaisse.healthcareapp.design_component.ResultatItem
import com.rayaisse.healthcareapp.presentation.dialog.ExamenDialog
import com.rayaisse.healthcareapp.utils.DeviceConfiguration
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale

@Composable
fun ResultatScreen(modifier: Modifier = Modifier) {
    var todayDate by remember { mutableStateOf(LocalDate.now().format( DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", Locale.FRENCH))) }
    var listRdv = ArrayList<Rdv>()
    val listState = rememberLazyListState()
    var showDialog by remember { mutableStateOf(false) }
    var selectedItem by remember { mutableStateOf<Examen?>(null) }

    val items= listOf(
        Examen(dateExamen = LocalDate.now().format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", Locale.FRENCH)), nomExamen = "Bilan lipidique", typeExamen = "Laboratoire"),
        Examen(dateExamen = LocalDate.now().plusDays(1).format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", Locale.FRENCH)), nomExamen = "Scanner cérébral", typeExamen = "Imagerie"),
        Examen(dateExamen = LocalDate.now().plusDays(2).format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", Locale.FRENCH)), nomExamen = "ECBU", typeExamen = "Laboratoire"),
        Examen(dateExamen = LocalDate.now().plusDays(3).format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", Locale.FRENCH)), nomExamen = "Échographie cardiaque", typeExamen = "Imagerie"),
        Examen(dateExamen = LocalDate.now().plusDays(4).format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", Locale.FRENCH)), nomExamen = "Créatinine", typeExamen = "Laboratoire"),
    )
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        contentWindowInsets = WindowInsets.systemBars
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
                        modifier = Modifier.fillMaxWidth(),
                        elevation = CardDefaults.cardElevation(5.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.primary
                        )
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth().padding(5.dp)
                        ) {
                            Column(
                                modifier = Modifier.weight(1f)
                            ) {
                                Text(
                                    text = "Dr " + "RAYAISSE Patrick",
                                    maxLines = 1,
                                    style = MaterialTheme.typography.bodyMedium,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    text = "Contact: " + "65272174",
                                    maxLines = 1,
                                    style = MaterialTheme.typography.bodyMedium,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    text = "Cardiologie",
                                    maxLines = 1,
                                    style = MaterialTheme.typography.bodyMedium,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                            Box(
                                modifier = Modifier.size(60.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Notifications,
                                    contentDescription = "Appointments",
                                    modifier = Modifier.size(40.dp),
                                    tint = MaterialTheme.colorScheme.onPrimary
                                )

                                // Badge with number of appointments
                                Box(
                                    modifier = Modifier
                                        .align(Alignment.TopEnd)
                                        .offset(x = (-3).dp, y = (-2).dp)
                                        .size(25.dp)
                                        .background(
                                            color = MaterialTheme.colorScheme.error,
                                            shape = CircleShape
                                        ),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = "7", // Replace with your actual rdv count
                                        style = MaterialTheme.typography.labelSmall,
                                        color = MaterialTheme.colorScheme.onError,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                            }
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
                        text = "Liste des Examens",
                        maxLines = 1,
                        style = MaterialTheme.typography.bodyLarge,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        color = MaterialTheme.colorScheme.primary
                    )

                    Spacer(modifier = Modifier.size(10.dp))

                    Box(
                        modifier = Modifier.fillMaxWidth()
                            .fillMaxHeight()
                    ) {
                        LazyColumn(state = listState){
                            itemsIndexed(items) { index,item->
                                ResultatItem(
                                    examen =item,
                                    onViewClick={showDialog=true
                                        selectedItem=item},
                                    textSize =5.sp)

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

    if(showDialog && selectedItem!=null){
        Log.d("TAG", "LigneDeVieScreen:Modal dialog is openned")
        ExamenDialog(examen=selectedItem!!, onDismiss ={
            showDialog=false
            selectedItem=null
        }
        )
    }else{
        Log.d("TAG", "LigneDeVieScreen:Modal dialog is openned")
    }

}

@Composable
@Preview(showBackground = true)
fun ResultatScreenPreview() {
    ResultatScreen()
}