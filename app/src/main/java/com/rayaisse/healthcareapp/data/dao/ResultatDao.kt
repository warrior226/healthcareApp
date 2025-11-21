package com.rayaisse.healthcareapp.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.rayaisse.healthcareapp.data.model.Constante
import com.rayaisse.healthcareapp.data.model.Medecin
import com.rayaisse.healthcareapp.data.model.Resultat
import kotlinx.coroutines.flow.Flow

@Dao
interface ResultatDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertResultat(resultat: Resultat)

    @Query("SELECT * FROM resultat")
    fun getAllResultat(): Flow<List<Resultat>>



}