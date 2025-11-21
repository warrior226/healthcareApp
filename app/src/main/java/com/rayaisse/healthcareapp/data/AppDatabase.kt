package com.rayaisse.healthcareapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rayaisse.healthcareapp.data.dao.ConstanteDao
import com.rayaisse.healthcareapp.data.dao.ConsultationDao
import com.rayaisse.healthcareapp.data.dao.DisponibiliteDao
import com.rayaisse.healthcareapp.data.dao.ExamenDao
import com.rayaisse.healthcareapp.data.dao.MedecinDao
import com.rayaisse.healthcareapp.data.dao.PatientDao
import com.rayaisse.healthcareapp.data.dao.PrescriptionDao
import com.rayaisse.healthcareapp.data.dao.RdvDao
import com.rayaisse.healthcareapp.data.dao.ResultatDao
import com.rayaisse.healthcareapp.data.dao.UserDao
import com.rayaisse.healthcareapp.data.model.Constante
import com.rayaisse.healthcareapp.data.model.Consultation
import com.rayaisse.healthcareapp.data.model.Disponibilite
import com.rayaisse.healthcareapp.data.model.Examen
import com.rayaisse.healthcareapp.data.model.Medecin
import com.rayaisse.healthcareapp.data.model.Patient
import com.rayaisse.healthcareapp.data.model.Prescription
import com.rayaisse.healthcareapp.data.model.Rdv
import com.rayaisse.healthcareapp.data.model.Resultat
import com.rayaisse.healthcareapp.data.model.User

@Database(entities = [Consultation::class, Examen::class, Constante::class, Disponibilite::class, Medecin::class, Patient::class, Rdv::class, Resultat::class, Prescription::class, User::class],
    version = 1)

abstract class AppDatabase : RoomDatabase() {
    abstract fun constanteDao(): ConstanteDao
    abstract fun consultationDao(): ConsultationDao
    abstract fun examenDao(): ExamenDao
    abstract fun medecinDao(): MedecinDao
    abstract fun patientDao(): PatientDao
    abstract fun rdvDao(): RdvDao
    abstract fun userDao(): UserDao
    abstract fun resultatDao(): ResultatDao
    abstract fun prescriptionDao(): PrescriptionDao
    abstract fun disponibiliteDao(): DisponibiliteDao







}