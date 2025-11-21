package com.rayaisse.healthcareapp.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "prescription")
data class Prescription(
    @PrimaryKey
    val patientId:Int=0,
    var consultationId:Int=0,
    var medicament:String="",
    var posologie:String="",
    var dateCreation:String=""
): Parcelable