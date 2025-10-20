package com.rayaisse.healthcareapp.design_component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ConsultationForm(
    modifier: Modifier = Modifier,
    motif:String="",
    onMotifChange:(String)->Unit={},
    antecedentMedicaux:String="",
    onAntecedentMedicauxChange:(String)->Unit={},
    antecedentFamiliaux:String="",
    onAntecedentFamiliauxChange:(String)->Unit={},
    allergies:String="",
    onAllergiesChange:(String)->Unit={},
    symptomes:String="",
    onSymptomesChange:(String)->Unit={},
    traitementEnCours:String="",
    onTraitementEnCoursChange:(String)->Unit={},
    observation:String="",
    onObservationChange:(String)->Unit={},
    recommandation:String="",
    onRecommandationChange:(String)->Unit={},
    dateProchaineVisite:String="",
    onDateProchaieVisite:(String)->Unit={}

) {

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text ="Motif de consultation",
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            value =motif,
            onValueChange = onMotifChange,
            modifier = modifier.fillMaxWidth(),
            colors= OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = MaterialTheme.colorScheme.surface,
                cursorColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = Color.Transparent
            ),
            placeholder = {
                Text(
                    text ="Entrer le Motif de consultation" ,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray
                )
            },
            textStyle = MaterialTheme.typography.bodyLarge,
            shape = RoundedCornerShape(10.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text ="Antécédents médicaux",
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            value =antecedentMedicaux,
            onValueChange = onAntecedentMedicauxChange,
            modifier = modifier.fillMaxWidth(),
            colors= OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = MaterialTheme.colorScheme.surface,
                cursorColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = Color.Transparent
            ),
            placeholder = {
                Text(
                    text ="Renseigner les antécédents médicaux" ,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray
                )
            },
            textStyle = MaterialTheme.typography.bodyLarge,
            shape = RoundedCornerShape(10.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            )
        )
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text ="Antécédents familiaux",
            style = MaterialTheme.typography.bodyMedium
        )
        OutlinedTextField(
            value =antecedentFamiliaux,
            onValueChange = onAntecedentFamiliauxChange,
            modifier = modifier.fillMaxWidth(),
            colors= OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = MaterialTheme.colorScheme.surface,
                cursorColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = Color.Transparent
            ),
            placeholder = {
                Text(
                    text ="Renseigner les antécédents familiaux" ,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray
                )
            },
            textStyle = MaterialTheme.typography.bodyLarge,
            shape = RoundedCornerShape(10.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            )
        )
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text ="Allergies",
            style = MaterialTheme.typography.bodyMedium
        )
        OutlinedTextField(
            value =allergies,
            onValueChange = onAllergiesChange,
            modifier = modifier.fillMaxWidth(),
            colors= OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = MaterialTheme.colorScheme.surface,
                cursorColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = Color.Transparent
            ),
            placeholder = {
                Text(
                    text ="Renseigner les allergies du patient" ,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray
                )
            },
            textStyle = MaterialTheme.typography.bodyLarge,
            shape = RoundedCornerShape(10.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            )
        )

        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text ="symptomes",
            style = MaterialTheme.typography.bodyMedium
        )
        OutlinedTextField(
            value =symptomes,
            onValueChange = onSymptomesChange,
            modifier = modifier.fillMaxWidth(),
            colors= OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = MaterialTheme.colorScheme.surface,
                cursorColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = Color.Transparent
            ),
            placeholder = {
                Text(
                    text ="Renseigner les symptomes du patient" ,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray
                )
            },
            textStyle = MaterialTheme.typography.bodyLarge,
            shape = RoundedCornerShape(10.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            )
        )

        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text ="Traitement(s) en cours",
            style = MaterialTheme.typography.bodyMedium
        )
        OutlinedTextField(
            value =traitementEnCours,
            onValueChange = onTraitementEnCoursChange,
            modifier = modifier.fillMaxWidth(),
            colors= OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = MaterialTheme.colorScheme.surface,
                cursorColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = Color.Transparent
            ),
            placeholder = {
                Text(
                    text ="Renseigner les traitements en cours du patient" ,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray
                )
            },
            textStyle = MaterialTheme.typography.bodyLarge,
            shape = RoundedCornerShape(10.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            )
        )

        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text ="Observations",
            style = MaterialTheme.typography.bodyMedium
        )
        OutlinedTextField(
            value =observation,
            onValueChange = onObservationChange,
            modifier = modifier.fillMaxWidth(),
            colors= OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = MaterialTheme.colorScheme.surface,
                cursorColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = Color.Transparent
            ),
            placeholder = {
                Text(
                    text ="Renseigner vos observations" ,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray
                )
            },
            textStyle = MaterialTheme.typography.bodyLarge,
            shape = RoundedCornerShape(10.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            )
        )

        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text ="Recommandations",
            style = MaterialTheme.typography.bodyMedium
        )
        OutlinedTextField(
            value =recommandation,
            onValueChange = onRecommandationChange,
            modifier = modifier.fillMaxWidth(),
            colors= OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = MaterialTheme.colorScheme.surface,
                cursorColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = Color.Transparent
            ),
            placeholder = {
                Text(
                    text ="Renseigner vos recommandations" ,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray
                )
            },
            textStyle = MaterialTheme.typography.bodyLarge,
            shape = RoundedCornerShape(10.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            )
        )

        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text ="Date de la prochaine visite",
            style = MaterialTheme.typography.bodyMedium
        )
        OutlinedTextField(
            value =dateProchaineVisite,
            onValueChange = onDateProchaieVisite,
            modifier = modifier.fillMaxWidth(),
            colors= OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = MaterialTheme.colorScheme.surface,
                cursorColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = Color.Transparent
            ),
            placeholder = {
                Text(
                    text ="Renseigner la date de la prochaine visite" ,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray
                )
            },
            textStyle = MaterialTheme.typography.bodyLarge,
            shape = RoundedCornerShape(10.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            )
        )


    }


}

@Composable
@Preview(showBackground = true)
fun ConsultationFormPreview(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        ConsultationForm()
    }

}