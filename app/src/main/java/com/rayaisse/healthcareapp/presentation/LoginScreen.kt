package com.rayaisse.healthcareapp.presentation

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.displayCutout
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rayaisse.healthcareapp.R
import com.rayaisse.healthcareapp.design_component.AppButton
import com.rayaisse.healthcareapp.design_component.AppTextField
import com.rayaisse.healthcareapp.design_component.BasicDropdown
import com.rayaisse.healthcareapp.utils.DeviceConfiguration

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    var nom by remember { mutableStateOf("") }
    var prenom by remember { mutableStateOf("") }
    var contact by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var addresse by remember { mutableStateOf("") }
    var dateNaissance by remember { mutableStateOf("") }
    var genre by remember { mutableStateOf("Masculin") }
    var specialite by remember { mutableStateOf("") }
    var motDePasse by remember { mutableStateOf("") }

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
                horizontal = 16.dp,
                vertical = 24.dp
            )
            .consumeWindowInsets(WindowInsets.navigationBars)

        val windowSizeClass= currentWindowAdaptiveInfo().windowSizeClass
        val deviceConfiguration= DeviceConfiguration.fromWindowSizeClass(windowSizeClass)

        when(deviceConfiguration){
            DeviceConfiguration.MOBILE_PORTRAIT -> {
                Log.d("TAG", "LoginScreen: mobile portrait ")
                Column(
                    modifier=rootModifier,
                    verticalArrangement = Arrangement.spacedBy(32.dp),


                ) {
                    LoginHeaderSection(modifier = Modifier.fillMaxWidth())
                    LoginFormSection(
                        nom = nom,
                        onNomChange = { nom = it },
                        prenom = prenom,
                        onPrenomChange = { prenom = it },
                        contact = contact,
                        onContactChange = { contact = it },
                        email = email,
                        onEmailChange = { email = it },
                        addresse = addresse,
                        onAddresseChange = { addresse = it },
                        dateNaissance = dateNaissance,
                        onDateNaissanceChange = { dateNaissance = it },
                        genre = genre,
                        onGenreChange = { genre = it },
                        specialite = specialite,
                        onSpecialiteChange = { specialite = it },
                        motDePasse = motDePasse,
                        onMotDePasseChange = { motDePasse = it },
                        modifier = Modifier.verticalScroll(rememberScrollState())
                    )
                }

            }
            DeviceConfiguration.MOBILE_LANDSCAPE ->{
                Log.d("TAG", "LoginScreen: mobile lanfscape ")
                Row(
                    modifier=rootModifier
                        .padding(
                            horizontal = 32.dp
                        ),
                    horizontalArrangement = Arrangement.spacedBy(32.dp)

                ) {
                }

            }
            DeviceConfiguration.TABLET_PORTRAIT,
            DeviceConfiguration.TABLET_LANDSCAPE,
            DeviceConfiguration.DESKTOP ->{

                Log.d("TAG", "LoginScreen: mobile portrait ")
                Column(
                    modifier=rootModifier,
                    verticalArrangement = Arrangement.spacedBy(32.dp),

                    ) {
                    LoginHeaderSection(modifier = Modifier.fillMaxWidth())
                    LoginFormSection(
                        nom = nom,
                        onNomChange = { nom = it },
                        prenom = prenom,
                        onPrenomChange = { prenom = it },
                        contact = contact,
                        onContactChange = { contact = it },
                        email = email,
                        onEmailChange = { email = it },
                        addresse = addresse,
                        onAddresseChange = { addresse = it },
                        dateNaissance = dateNaissance,
                        onDateNaissanceChange = { dateNaissance = it },
                        genre = genre,
                        onGenreChange = { genre = it },
                        specialite = specialite,
                        onSpecialiteChange = { specialite = it },
                        motDePasse = motDePasse,
                        onMotDePasseChange = { motDePasse = it },
                        modifier = Modifier.verticalScroll(rememberScrollState())
                    )
                }

            }
        }

    }


}


@Composable
fun LoginFormSection(
    modifier: Modifier = Modifier,
    nom: String,
    onNomChange: (String) -> Unit,
    prenom: String,
    onPrenomChange: (String) -> Unit,
    contact: String,
    onContactChange: (String) -> Unit,
    email: String,
    onEmailChange: (String) -> Unit,
    addresse: String,
    onAddresseChange: (String) -> Unit,
    dateNaissance: String,
    onDateNaissanceChange: (String) -> Unit,
    genre: String,
    onGenreChange: (String) -> Unit,
    specialite: String,
    onSpecialiteChange: (String) -> Unit,
    motDePasse: String,
    onMotDePasseChange: (String) -> Unit,

    ) {

    Column(
        modifier = modifier
    ) {
        AppTextField(
            text=nom,
            onValueChange = onNomChange,
            label = "Nom",
            hint = "RAYAISSE",
            isInputSecret = false,
            modifier = Modifier.fillMaxWidth(),
            keyboardType = KeyboardType.Text
        )
        Spacer(modifier = Modifier.height(16.dp))
        AppTextField(
            text=prenom,
            onValueChange = onPrenomChange,
            label = "Prenom(s)",
            hint = "Patrick Renaud Wendyam",
            isInputSecret = false,
            modifier = Modifier.fillMaxWidth(),
            keyboardType = KeyboardType.Text
        )
        Spacer(modifier = Modifier.height(16.dp))
        AppTextField(
            text=contact,
            onValueChange = onContactChange,
            label = "Contact",
            hint = "65272174",
            isInputSecret = false,
            modifier = Modifier.fillMaxWidth(),
            keyboardType = KeyboardType.Phone
        )
        Spacer(modifier = Modifier.height(16.dp))
        AppTextField(
            text=email,
            onValueChange = onEmailChange,
            label = "Email",
            hint = "rayaissewendyam@gmail.com",
            isInputSecret = false,
            modifier = Modifier.fillMaxWidth(),
            keyboardType = KeyboardType.Email
        )
        Spacer(modifier = Modifier.height(16.dp))
        AppTextField(
            text=addresse,
            onValueChange = onAddresseChange,
            label = "Addresse",
            hint = "Karpala",
            isInputSecret = false,
            modifier = Modifier.fillMaxWidth(),
            keyboardType = KeyboardType.Text
        )
        Spacer(modifier = Modifier.height(16.dp))
        BasicDropdown(
            items = listOf("Masculin", "Feminin"),
            selectedItem =genre,
            onItemSelected =onGenreChange ,
            label = "Genre",
            modifier = Modifier.fillMaxWidth(),
            enabled = true,
        )
        Spacer(modifier = Modifier.height(16.dp))
        BasicDropdown(
            items = listOf("Généraliste", ""),
            selectedItem =specialite,
            onItemSelected =onSpecialiteChange ,
            label = "Spécialité",
            modifier = Modifier.fillMaxWidth(),
            enabled = true,
        )
        Spacer(modifier = Modifier.height(16.dp))
        AppTextField(
            text=motDePasse,
            onValueChange = onMotDePasseChange,
            label = "Mot de passe",
            hint = "Mot de passe",
            isInputSecret = true,
            modifier = Modifier.fillMaxWidth(),
            keyboardType = KeyboardType.Email
        )

        Spacer(modifier = Modifier.height(24.dp))
        AppButton(
            text = "Créer un compte",
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        )

    }

}

@Composable
fun LoginHeaderSection(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "App Logo",
            modifier = Modifier.size(150.dp)
                .padding(bottom =16.dp),
            contentScale = ContentScale.Fit
        )
        Text(
            text = "Bienvenue sur HealthcareSys",
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.primary,
            fontWeight = FontWeight.Bold
        )
    }
}


@Composable
@Preview(showBackground = true)
fun LoginScreenPreview(modifier: Modifier = Modifier) {
    LoginScreen()
}