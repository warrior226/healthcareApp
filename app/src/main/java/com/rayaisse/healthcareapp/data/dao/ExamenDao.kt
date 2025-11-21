package com.rayaisse.healthcareapp.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.rayaisse.healthcareapp.data.model.Constante
import com.rayaisse.healthcareapp.data.model.Examen
import com.rayaisse.healthcareapp.data.model.Medecin
import kotlinx.coroutines.flow.Flow

@Dao
interface ExamenDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertExamen(examen: Examen)

    @Query("SELECT * FROM examen")
    fun getAllExamen(): Flow<List<Examen>>



}