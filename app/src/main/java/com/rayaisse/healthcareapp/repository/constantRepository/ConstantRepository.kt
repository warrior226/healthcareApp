package com.rayaisse.healthcareapp.repository.constantRepository

import com.rayaisse.healthcareapp.data.dao.ConstanteDao
import com.rayaisse.healthcareapp.data.model.Constante
import javax.inject.Inject

class ConstantRepository @Inject constructor(
    private val constantDao: ConstanteDao
) {
    suspend fun insertConstant(constante: Constante)=constantDao.insertConstante(constante)
    fun getConstantById(id:Int)=constantDao.getConstantesByPatientId(id)

}