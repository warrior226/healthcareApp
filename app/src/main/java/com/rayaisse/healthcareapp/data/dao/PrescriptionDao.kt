package com.rayaisse.healthcareapp.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.rayaisse.healthcareapp.data.model.Constante
import com.rayaisse.healthcareapp.data.model.Medecin
import com.rayaisse.healthcareapp.data.model.Prescription
import kotlinx.coroutines.flow.Flow

@Dao
interface PrescriptionDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPrescription(prescription: Prescription)

    @Query("SELECT * FROM prescription")
    fun getAllPrescription(): Flow<List<Prescription>>



}