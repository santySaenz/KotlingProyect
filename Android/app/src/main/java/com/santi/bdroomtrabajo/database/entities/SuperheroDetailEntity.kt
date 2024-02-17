package com.santi.bdroomtrabajo.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.santi.bdroomtrabajo.SuperHeroDetailResponse

@Entity(tableName = "hero_detail")
data class SuperheroDetailEntity (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int = 0,
    @ColumnInfo(name = "intelligence") val intelligence: String,
    @ColumnInfo(name = "strength") val strength: String,
    @ColumnInfo(name = "speed") val speed: String,
    @ColumnInfo(name = "durability") val durability: String,
    @ColumnInfo(name = "power") val power: String,
    @ColumnInfo(name = "fullName") val fullName: String,
    @ColumnInfo(name = "combat") val combat: String,
    @ColumnInfo(name = "publisher") val publisher: String
)
fun SuperHeroDetailResponse.toDatabase() = SuperheroDetailEntity(intelligence = powerstats.intelligence,  strength =  powerstats.strength,speed = powerstats.speed,durability=powerstats.durability,power=powerstats.power, fullName=biography.fullName,combat=powerstats.combat,publisher=biography.publisher )
