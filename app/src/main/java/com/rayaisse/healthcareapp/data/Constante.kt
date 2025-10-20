package com.rayaisse.healthcareapp.data

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "constante")
data class Constante(
    @PrimaryKey
    val id:Int=0,
    var patientId:Int=0,
    var poids: String="",
    var taille: String="",
    var temperature: String="",
    var tensionSystolique:String="",
    var tensionDiastolique:String="",
    var frequenceCardiaque:String="",
    var frequenceRespiratoire:String="",
    var groupeSanguin:String=""

): Parcelable
