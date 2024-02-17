package com.santi.bdroomtrabajo.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.santi.bdroomtrabajo.database.dao.SuperHeroListDao
import com.santi.bdroomtrabajo.database.dao.SuperheroDetailDao
import com.santi.bdroomtrabajo.database.entities.SuperHeroListEntity
import com.santi.bdroomtrabajo.database.entities.SuperheroDetailEntity

@Database(entities = [SuperheroDetailEntity::class,SuperHeroListEntity::class], version = 1)
abstract class SuperHeroDB : RoomDatabase(){
    abstract fun getSHDetail(): SuperheroDetailDao;
    abstract fun getSHList(): SuperHeroListDao;
}