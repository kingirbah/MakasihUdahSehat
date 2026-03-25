package com.kingirbah.makasihudahsehat.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.kingirbah.makasihudahsehat.database.DatabaseClient.Companion.getInstance
import com.kingirbah.makasihudahsehat.database.dao.DatabaseDao
import com.kingirbah.makasihudahsehat.model.ModelDatabase
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.schedulers.Schedulers


class InputDataViewModel(application: Application) : AndroidViewModel(application) {

    var databaseDao: DatabaseDao?

    fun addDataSampah(
        nama_pengguna: String,
        jenis_keluhan: String,
        usia: Int,
        no_telp: String,
        keluhan: String,
        tanggal: String,
        alamat: String,
        catatan: String
    ) {
        Completable.fromAction {
            val modelDatabase = ModelDatabase(
                namaPengguna = nama_pengguna,
                jenisKeluhan = jenis_keluhan,
                usia = usia,
                noTelp = no_telp,
                keluhan = keluhan,
                tanggal = tanggal,
                alamat = alamat,
                catatan = catatan
            )
            databaseDao?.insertData(modelDatabase)
        }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe()
    }

    init {
        databaseDao = getInstance(application)?.appDatabase?.databaseDao()
    }

}
