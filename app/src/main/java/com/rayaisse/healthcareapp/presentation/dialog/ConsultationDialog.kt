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
import com.rayaisse.healthcareapp.data.Rdv
import com.rayaisse.healthcareapp.design_component.AppButton
import com.rayaisse.healthcareapp.design_component.ConstanteForm
import com.rayaisse.healthcareapp.design_component.ConsultationForm
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ConsultationDialog(
    modifier: Modifier = Modifier,
    rdv: Rdv,
    onDismiss:()->Unit
) {
    var poids by remember { mutableStateOf("") }
    var temperature by remember { mutableStateOf("") }
    var taille by remember { mutableStateOf("") }
    var tensionSystolique by remember { mutableStateOf("") }
    var tensionDiastolique by remember { mutableStateOf("") }
    var frequenceCardiaque by remember { mutableStateOf("") }
    var frequenceRespiratoire by remember { mutableStateOf("") }
    var groupeSanguin by remember { mutableStateOf("") }

    var motif by remember { mutableStateOf("") }
    var antecedentMedicaux by remember { mutableStateOf("") }
    var antecedentFamiliaux by remember { mutableStateOf("") }
    var allergies by remember { mutableStateOf("") }
    var symptomes by remember { mutableStateOf("") }
    var traitementEnCours by remember { mutableStateOf("") }
    var observation by remember { mutableStateOf("") }
    var recommandation by remember { mutableStateOf("") }
    var dateProchaineVisite by remember { mutableStateOf("") }
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
                text = "FICHE DE CONSULTATION",
                color = MaterialTheme.colorScheme.primary,
                fontWeight = FontWeight.Bold
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
                            text = "IDENTITE DU PATIENT",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Nom: RAYAISSE ",
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Start
                        )
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Prenom(s): Patrick",
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Start
                        )
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Genre: Masculin",
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Start
                        )
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = "Contact: 65272164",
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Start
                        )
                        Text(
                            modifier = Modifier.fillMaxWidth().background(color = MaterialTheme.colorScheme.primary),
                            text = "CONSTANTES MEDICALES DU PATIENT",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        ConstanteForm(
                            temperature = temperature,
                            onTemperatureChange = {temperature=it},
                            poids = poids,
                            onPoidsChange = {poids=it},
                            taille = taille,
                            onTailleChange = {taille=it},
                            tensionsystolique = tensionSystolique,
                            onTensionSystoliqueChange = {tensionSystolique=it},
                            tensionDiastolique =tensionDiastolique,
                            onTensionDiastoliqueChange = {tensionDiastolique=it},
                            frequenceCardiaque = frequenceCardiaque,
                            onFrequenceCardiaqueChange = {frequenceCardiaque=it},
                            frequenceRespiratoire = frequenceRespiratoire,
                            onFrequenceRespiratoireChange = {frequenceRespiratoire},
                            groupeSanguin = groupeSanguin,
                            onGroupeSanguinChange = {groupeSanguin=it}
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            modifier = Modifier.fillMaxWidth().background(color = MaterialTheme.colorScheme.primary),
                            text = "INFORMATIONS MEDICALES DU PATIENT",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        ConsultationForm(
                            motif=motif,
                            onMotifChange = {motif=it},
                            antecedentMedicaux = antecedentMedicaux,
                            onAntecedentMedicauxChange = {antecedentMedicaux=it},
                            antecedentFamiliaux = antecedentFamiliaux,
                            onAntecedentFamiliauxChange = {antecedentFamiliaux=it},
                            allergies = allergies,
                            onAllergiesChange = {allergies=it},
                            symptomes = symptomes,
                            onSymptomesChange = {symptomes=it},
                            traitementEnCours = traitementEnCours,
                            onTraitementEnCoursChange ={traitementEnCours=it},
                            observation = observation,
                            onObservationChange = {observation=it},
                            recommandation = recommandation,
                            onRecommandationChange = {recommandation=it},
                            dateProchaineVisite = dateProchaineVisite,
                            onDateProchaieVisite = {dateProchaineVisite=it}
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
fun ConsultationDialogPreview(modifier: Modifier = Modifier) {
    Column {
        ConsultationDialog(rdv =Rdv(dateRdv = LocalDate.now().format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", Locale.FRENCH)), heureRdv = "9h10", motifRdv = "Maux de tête")) { }
    }
}