package com.santi.bdroomtrabajo.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.santi.bdroomtrabajo.database.entities.SuperheroDetailEntity

@Dao
interface SuperheroDetailDao {
    @Query("SELECT * FROM hero_detail WHERE id Like :ID")
    suspend fun getAllSHData(ID: Int):List<SuperheroDetailEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllData(quotes:List<SuperheroDetailEntity>)

    @Query("DELETE FROM hero_detail")
    suspend fun deleteAllData()
}