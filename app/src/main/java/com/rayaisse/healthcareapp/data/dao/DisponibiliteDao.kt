package com.rayaisse.healthcareapp.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.rayaisse.healthcareapp.data.model.Disponibilite
import kotlinx.coroutines.flow.Flow

@Dao
interface DisponibiliteDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDisponibilite(disponibilite: Disponibilite)

    @Query("SELECT * FROM disponibilite")
    fun getAllDisponibilites(): Flow<List<Disponibilite>>

}