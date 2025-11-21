package com.rayaisse.healthcareapp.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.rayaisse.healthcareapp.data.model.Constante
import com.rayaisse.healthcareapp.data.model.Medecin
import kotlinx.coroutines.flow.Flow

@Dao
interface MedecinDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMedecin(medecin: Medecin)

    @Query("SELECT * FROM medecin")
    fun getAllMedecins(): Flow<List<Medecin>>

}