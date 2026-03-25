package com.kingirbah.makasihudahsehat.database.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.kingirbah.makasihudahsehat.model.ModelDatabase



@Dao
interface DatabaseDao {

    @Query("SELECT * FROM tbl_makasihudahsehat")
    fun getAll(): LiveData<List<ModelDatabase>>

    @Query("SELECT SUM(harga) FROM tbl_makasihudahsehat")
    fun getSaldo(): LiveData<Int>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertData(modelDatabases: ModelDatabase)

    @Query("DELETE FROM tbl_makasihudahsehat WHERE uid= :uid")
    fun deleteSingleData(uid: Int)




}
