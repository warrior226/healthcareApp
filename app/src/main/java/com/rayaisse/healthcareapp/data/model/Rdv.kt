package com.rayaisse.healthcareapp.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "rdv")
data class Rdv(
    @PrimaryKey
    val id:Int=0,
    var userId:Int=0,
    var dateRdv:String="",
    var heureRdv:String="",
    var motifRdv:String="",
    var dateCreation:String="",
    var status: String=""
): Parcelable