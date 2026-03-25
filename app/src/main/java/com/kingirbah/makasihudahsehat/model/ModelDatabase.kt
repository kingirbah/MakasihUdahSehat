package com.kingirbah.makasihudahsehat.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize


@Entity(tableName = "tbl_makasihudahsehat")
@Parcelize
data class ModelDatabase(
    @PrimaryKey(autoGenerate = true)
    var uid: Int? = null,
    @ColumnInfo(name = "nama_pengguna")
    var namaPengguna: String = "",
    @ColumnInfo(name = "jenis_keluhan")
    var jenisKeluhan: String = "",
    @ColumnInfo(name = "usia")
    var usia: Int = 0,
    @ColumnInfo(name = "no_telp")
    var noTelp: String = "",
    @ColumnInfo(name = "keluhan")
    var keluhan: String = "",
    @ColumnInfo(name = "tanggal")
    var tanggal: String = "",
    @ColumnInfo(name = "alamat")
    var alamat: String = "",
    @ColumnInfo(name = "catatan")
    var catatan: String = "",
    var someField: String? = null // Provide a default value or set it when creating an instance
) : Parcelable

