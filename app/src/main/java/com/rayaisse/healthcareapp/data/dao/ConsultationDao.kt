package com.rayaisse.healthcareapp.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.rayaisse.healthcareapp.data.model.Consultation
import kotlinx.coroutines.flow.Flow

@Dao
interface ConsultationDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertConsultation(constante: Consultation)

    @Query("SELECT * FROM consultation ")
    fun getAllConsultations(): Flow<List<Consultation>>

}