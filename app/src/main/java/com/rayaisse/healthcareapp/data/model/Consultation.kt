package com.rayaisse.healthcareapp.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "consultation")
data class Consultation(
    @PrimaryKey
    val id:Int=0,
    var userId:Int=0,
    var dateConsultation: String="",
    var heureConsultation: String="",
    var motifConsultation: String="",
    var antecedentMedicaux:String="",
    var antecedentFamiliaux:String="",
    var allergies:String="",
    var symptomes:String="",
    var traitementEnCours:String="",
    var observation:String="",
    var recommandation:String="",
    var dateProchaineVisite:String="",
    var dateCreation:String=""
): Parcelable
