package com.santi.bdroomtrabajo.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.util.query
import com.santi.bdroomtrabajo.database.entities.SuperHeroListEntity

@Dao
interface SuperHeroListDao {
    @Query("SELECT * FROM super_list Where name LIKE :query ORDER BY name DESC")
    suspend fun getAllShList(query: String):List<SuperHeroListEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllShList(quotes:List<SuperHeroListEntity>)

    @Query("DELETE FROM super_list")
    suspend fun deleteAllShList()
}