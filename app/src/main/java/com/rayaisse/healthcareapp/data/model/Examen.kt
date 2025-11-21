package com.rayaisse.healthcareapp.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize


@Parcelize
@Entity(tableName = "examen")
data class Examen(
    @PrimaryKey
    val id:Int=0,
    var consultationId:Int=0,
    var nomExamen:String="",
    var typeExamen:String="",
    var dateExamen:String="",
    var dateCreation:String=""
): Parcelable
