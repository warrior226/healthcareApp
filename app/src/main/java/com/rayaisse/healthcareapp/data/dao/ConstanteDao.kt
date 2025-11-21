package com.rayaisse.healthcareapp.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.rayaisse.healthcareapp.data.model.Constante

@Dao
interface ConstanteDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertConstante(constante: Constante)

    @Query("SELECT * FROM constante WHERE patientId = :patientId")
    fun getConstantesByPatientId(patientId: Int):Constante

}