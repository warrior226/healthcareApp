package com.rayaisse.healthcareapp.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "patient")
data class Patient(
    @PrimaryKey
    val patientId:Int=0,
    var matricule:String="",
    var nom:String="",
    var prenom:String="",
    var email:String="",
    var adresse:String="",
    var contact: String="",
    var dateNaissance:String="",
    var genre:String="",
    var profession:String="",
    var password:String="",
    var dateCreation:String=""
): Parcelable