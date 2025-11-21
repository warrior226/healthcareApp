package com.rayaisse.healthcareapp.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "user")
data class User(
    @PrimaryKey
    val id:Int=0,
    var userId:Int=0,
    var patientId:Int=0,
    var medecinId:Int=0,
    var dateCreation:String=""
): Parcelable