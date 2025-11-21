package com.rayaisse.healthcareapp.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "medecin")
data class Medecin(
    @PrimaryKey
    val medecinId:Int=0,
    var matricule:String="",
    var nom:String="",
    var prenom:String="",
    var email:String="",
    var adresse:String="",
    var contact: String="",
    var dateNaissance:String="",
    var genre:String="",
    var specialite:String="",
    var profession:String="",
    var password:String="",
    var status: Boolean=true,
    var dateCreation:String=""
): Parcelable