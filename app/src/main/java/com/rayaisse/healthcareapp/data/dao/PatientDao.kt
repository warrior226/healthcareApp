package com.rayaisse.healthcareapp.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.rayaisse.healthcareapp.data.model.Constante
import com.rayaisse.healthcareapp.data.model.Medecin
import com.rayaisse.healthcareapp.data.model.Patient
import kotlinx.coroutines.flow.Flow

@Dao
interface PatientDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPatient(patient: Patient)

    @Query("SELECT * FROM patient")
    fun getAllPatients(): Flow<List<Patient>>

}


