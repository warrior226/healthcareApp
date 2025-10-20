package com.rayaisse.healthcareapp.design_component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetutorial.BottomNavigation.AccueilScreen
import com.rayaisse.healthcareapp.data.Disponibilite
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale

@Composable
fun DisponibiliteItem(modifier: Modifier = Modifier,disponibilite: Disponibilite, onDeleteClick:()->Unit,onEditClick:()->Unit,textSize: TextUnit) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(5.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
        ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            verticalAlignment = Alignment.CenterVertically

        ){
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = disponibilite.dateDisponibilite
                )
                Text(
                    text="De ${disponibilite.heureDebut} à ${disponibilite.heureDebut} "
                )
            }
            Row(
                modifier = Modifier.weight(1f),
                horizontalArrangement = Arrangement.End
            ) {
                IconButton(
                    onClick ={onDeleteClick}
                ) {
                    Icon(
                        imageVector = Icons.Default.Delete,
                        tint = Color.Red,
                        contentDescription = "Delete"
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                IconButton(
                    onClick = {onEditClick}
                ) {
                    Icon(
                        imageVector = Icons.Default.Edit,
                        tint = MaterialTheme.colorScheme.primary,
                        contentDescription = "Edit"
                    )

                }
            }
        }

    }

}

@Composable
@Preview(showBackground = true)
fun DisponibiliteItemPreview() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        DisponibiliteItem(
            disponibilite = Disponibilite(
                dateDisponibilite = LocalDate.now().format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", Locale.FRENCH)),
                heureDebut = "9h10",
                heureFin = "10h10"
            ),
            onEditClick = {},
            onDeleteClick = {},
            textSize = 5.sp
        )

    }
}