package com.rayaisse.healthcareapp.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.rayaisse.healthcareapp.data.model.Rdv
import kotlinx.coroutines.flow.Flow

@Dao
interface RdvDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRdv(rdv: Rdv)

    @Query("SELECT * FROM rdv ")
    fun getAllRdvs(): Flow<List<Rdv>>


}