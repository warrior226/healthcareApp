package com.rayaisse.healthcareapp.repository.consultationRepository

import com.rayaisse.healthcareapp.data.dao.ConsultationDao
import com.rayaisse.healthcareapp.data.model.Consultation
import jakarta.inject.Inject

class ConsultationRepository @Inject constructor(
    private val consultationDao: ConsultationDao

) {
    suspend fun insertConsultation(consultation: Consultation) = consultationDao.insertConsultation(consultation)
    fun getConsultationById()= consultationDao.getAllConsultations()
}