package com.rayaisse.healthcareapp.presentation.dialog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rayaisse.healthcareapp.data.Constante
import com.rayaisse.healthcareapp.data.Consultation
import com.rayaisse.healthcareapp.design_component.AppButton
import com.rayaisse.healthcareapp.design_component.PresciptionForm

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PrescriptionExamenDialog(
    modifier: Modifier = Modifier,
    consultation: Consultation,
    onDismiss:()->Unit
) {

    var medicament by remember { mutableStateOf("") }
    var posologie by remember { mutableStateOf("") }
    var examen by remember { mutableStateOf("") }
    var typeExamen by remember { mutableStateOf("") }

    ModalBottomSheet(
        modifier = modifier.fillMaxSize(),
        sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true),
        onDismissRequest = onDismiss
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp, 0.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = "EXAMENS ET PRESCRIPTIONS",
                color = MaterialTheme.colorScheme.primary,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                item {
                    Column {
                        // Votre contenu scrollable ici
                        Text(
                            modifier = Modifier.fillMaxWidth().background(color = MaterialTheme.colorScheme.primary),
                            text = "INFORMATIONS DE LA CONSULTATION",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Motif consultation: ${consultation.motifConsultation}",
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Start
                        )
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Antécédents médicaux: ${consultation.antecedentMedicaux}",
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Start
                        )
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Antécédents familiaux: ${consultation.antecedentFamiliaux}",
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Start
                        )
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Allergies : ${consultation.allergies}",
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Start
                        )
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Symptômes : ${consultation.symptomes}",
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Start
                        )
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Traitement en cours : ${consultation.traitementEnCours}",
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Start
                        )
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Observations : ${consultation.observation}",
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Start
                        )
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Recommandation : ${consultation.recommandation}",
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Start
                        )
                        Text(
                            modifier = Modifier.fillMaxWidth().background(color = MaterialTheme.colorScheme.primary),
                            text = "PRESCRIPTION ET EXAMEN",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        PresciptionForm(
                            medicament = medicament,
                            posologie = posologie,
                            nomExamen = examen,
                            typeExamen = typeExamen,
                            onNomExamenChange = {examen=it},
                            onTypeExamen = {typeExamen=it},
                            onMedicamentChange = { medicament = it },
                            onPosologieChange = { posologie = it }
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        AppButton(
                            text = "Envoyer",
                            onClick = {},
                            modifier = Modifier.fillMaxWidth()
                        )


                    }
                }
            }
        }
    }

}

@Composable
@Preview(showBackground = true)
fun PrescriptionExamenDialogPreview(modifier: Modifier = Modifier) {
    Column {
        PrescriptionExamenDialog(
            consultation = Consultation()
        ){}
    }
}