package com.rayaisse.healthcareapp.data

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize


@Parcelize
@Entity(tableName = "disponibilite")
data class Disponibilite(
    @PrimaryKey
    val id:Int=0,
    var medecinId:Int=0,
    var dateDisponibilite:String="",
    var heureDebut:String="",
    var heureFin:String=""
): Parcelable
