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
fun ConstanteForm(
    modifier: Modifier = Modifier,
    temperature:String="",
    onTemperatureChange:(String)->Unit={},
    poids:String="",
    onPoidsChange:(String)->Unit={},
    taille:String="",
    onTailleChange:(String)->Unit={},
    tensionsystolique:String="",
    onTensionSystoliqueChange:(String)->Unit={},
    tensionDiastolique:String="",
    onTensionDiastoliqueChange:(String)->Unit={},
    frequenceCardiaque:String="",
    onFrequenceCardiaqueChange:(String)->Unit={},
    frequenceRespiratoire:String="",
    onFrequenceRespiratoireChange:(String)->Unit={},
    groupeSanguin:String="",
    onGroupeSanguinChange:(String)->Unit={}

) {

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text ="Température",
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            value =temperature,
            onValueChange = onTemperatureChange,
            modifier = modifier.fillMaxWidth(),
            colors= OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = MaterialTheme.colorScheme.surface,
                cursorColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = Color.Transparent
            ),
            placeholder = {
                Text(
                    text ="Entrer la température" ,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray
                )
            },
            textStyle = MaterialTheme.typography.bodyLarge,
            shape = RoundedCornerShape(10.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Decimal,
                imeAction = ImeAction.Done
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text ="Poids",
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            value =poids,
            onValueChange = onPoidsChange,
            modifier = modifier.fillMaxWidth(),
            colors= OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = MaterialTheme.colorScheme.surface,
                cursorColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = Color.Transparent
            ),
            placeholder = {
                Text(
                    text ="Entrer le poids du patient" ,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray
                )
            },
            textStyle = MaterialTheme.typography.bodyLarge,
            shape = RoundedCornerShape(10.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Decimal,
                imeAction = ImeAction.Done
            )
        )
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text ="Taille",
            style = MaterialTheme.typography.bodyMedium
        )
        OutlinedTextField(
            value =taille,
            onValueChange = onTailleChange,
            modifier = modifier.fillMaxWidth(),
            colors= OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = MaterialTheme.colorScheme.surface,
                cursorColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = Color.Transparent
            ),
            placeholder = {
                Text(
                    text ="Entrer la taille du patient" ,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray
                )
            },
            textStyle = MaterialTheme.typography.bodyLarge,
            shape = RoundedCornerShape(10.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Decimal,
                imeAction = ImeAction.Done
            )
        )
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text ="Tension systolique",
            style = MaterialTheme.typography.bodyMedium
        )
        OutlinedTextField(
            value =tensionsystolique,
            onValueChange = onTensionSystoliqueChange,
            modifier = modifier.fillMaxWidth(),
            colors= OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = MaterialTheme.colorScheme.surface,
                cursorColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = Color.Transparent
            ),
            placeholder = {
                Text(
                    text ="Entrer la tension systolique du patient" ,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray
                )
            },
            textStyle = MaterialTheme.typography.bodyLarge,
            shape = RoundedCornerShape(10.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            )
        )

        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text ="Tension diastolique",
            style = MaterialTheme.typography.bodyMedium
        )
        OutlinedTextField(
            value =tensionDiastolique,
            onValueChange = onTensionDiastoliqueChange,
            modifier = modifier.fillMaxWidth(),
            colors= OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = MaterialTheme.colorScheme.surface,
                cursorColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = Color.Transparent
            ),
            placeholder = {
                Text(
                    text ="Entrer la tension diastolique du patient" ,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray
                )
            },
            textStyle = MaterialTheme.typography.bodyLarge,
            shape = RoundedCornerShape(10.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            )
        )

        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text ="Fréquence cardiaque",
            style = MaterialTheme.typography.bodyMedium
        )
        OutlinedTextField(
            value =frequenceCardiaque,
            onValueChange = onFrequenceCardiaqueChange,
            modifier = modifier.fillMaxWidth(),
            colors= OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = MaterialTheme.colorScheme.surface,
                cursorColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = Color.Transparent
            ),
            placeholder = {
                Text(
                    text ="Entrer la frequence cardiaque du patient" ,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray
                )
            },
            textStyle = MaterialTheme.typography.bodyLarge,
            shape = RoundedCornerShape(10.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            )
        )

        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text ="Fréquence respiratioire",
            style = MaterialTheme.typography.bodyMedium
        )
        OutlinedTextField(
            value =frequenceRespiratoire,
            onValueChange = onFrequenceRespiratoireChange,
            modifier = modifier.fillMaxWidth(),
            colors= OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = MaterialTheme.colorScheme.surface,
                cursorColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = Color.Transparent
            ),
            placeholder = {
                Text(
                    text ="Entrer la frequence respiratioire du patient" ,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray
                )
            },
            textStyle = MaterialTheme.typography.bodyLarge,
            shape = RoundedCornerShape(10.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            )
        )

        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text ="Groupe sanguin",
            style = MaterialTheme.typography.bodyMedium
        )
        OutlinedTextField(
            value =groupeSanguin,
            onValueChange = onGroupeSanguinChange,
            modifier = modifier.fillMaxWidth(),
            colors= OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = MaterialTheme.colorScheme.surface,
                cursorColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = Color.Transparent
            ),
            placeholder = {
                Text(
                    text ="Entrer le groupe sanguin du patient" ,
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
fun ConstanteFormPreview(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        ConstanteForm()
    }

}