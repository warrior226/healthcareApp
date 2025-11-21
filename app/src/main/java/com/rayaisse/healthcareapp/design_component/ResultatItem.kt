package com.rayaisse.healthcareapp.design_component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.RemoveRedEye
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rayaisse.healthcareapp.data.model.Examen
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale

@Composable
fun ResultatItem(modifier: Modifier = Modifier,examen: Examen,onViewClick:()->Unit,textSize: TextUnit) {
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
                    text =examen.dateExamen
                )
                Text(
                    text = "Nom de l'examen: ${examen.nomExamen}"
                )
                Text(
                    text="type d'examen:${examen.typeExamen}"
                )
            }
            Row(
                horizontalArrangement = Arrangement.End
            ) {
                Spacer(modifier = Modifier.width(10.dp))
                IconButton(
                    onClick = {onViewClick()}
                ) {
                    Icon(
                        imageVector = Icons.Default.RemoveRedEye,
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
fun ResultatItemPreview() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        ResultatItem(
            examen = Examen(dateExamen = LocalDate.now().format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", Locale.FRENCH)), nomExamen = "Examen", typeExamen = "Type d'examen"),
            onViewClick = {},
            textSize = 5.sp
        )
    }
}