package com.rayaisse.healthcareapp.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "resultat")
data class Resultat(
    @PrimaryKey
    val patientId:Int=0,
    var examenId:Int=0,
    var resultat:String="",
    var interpretation:String="",
    var resultatFilePath:String="",
    var dateCreation:String=""
): Parcelable