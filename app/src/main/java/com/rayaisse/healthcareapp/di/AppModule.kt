package com.rayaisse.healthcareapp.di

import android.app.Application
import androidx.room.Room
import com.rayaisse.healthcareapp.data.AppDatabase
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
import com.rayaisse.healthcareapp.utils.Constants.APP_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {


    @Provides
    @Singleton
    fun provideAppDatabase(
        application: Application
    ): AppDatabase {
        return Room.databaseBuilder(
            context = application,
            klass = AppDatabase::class.java,
            name = APP_DATABASE_NAME
        ).fallbackToDestructiveMigration(true).build()
    }

    @Provides
    @Singleton
    fun provideConstanteDao(appDatabase: AppDatabase): ConstanteDao = appDatabase.constanteDao()

    @Provides
    @Singleton
    fun provideConsultationDao(appDatabase: AppDatabase): ConsultationDao = appDatabase.consultationDao()

    @Provides
    @Singleton
    fun provideExamenDao(appDatabase: AppDatabase): ExamenDao = appDatabase.examenDao()

    @Provides
    @Singleton
    fun provideMedecinDao(appDatabase: AppDatabase): MedecinDao = appDatabase.medecinDao()

    @Provides
    @Singleton
    fun providePatientDao(appDatabase: AppDatabase): PatientDao = appDatabase.patientDao()

    @Provides
    @Singleton
    fun provideRdvDao(appDatabase: AppDatabase): RdvDao = appDatabase.rdvDao()

    @Provides
    @Singleton
    fun provideUserDao(appDatabase: AppDatabase): UserDao = appDatabase.userDao()

    @Provides
    @Singleton
    fun provideResultatDao(appDatabase: AppDatabase): ResultatDao = appDatabase.resultatDao()

    @Provides
    @Singleton
    fun providePrescriptionDao(appDatabase: AppDatabase): PrescriptionDao = appDatabase.prescriptionDao()

    @Provides
    @Singleton
    fun provideDisponibiliteDao(appDatabase: AppDatabase): DisponibiliteDao = appDatabase.disponibiliteDao()







}