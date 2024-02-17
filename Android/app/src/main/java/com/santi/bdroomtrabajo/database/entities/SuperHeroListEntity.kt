package com.santi.bdroomtrabajo.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.santi.bdroomtrabajo.SuperHeroDataResponse

@Entity(tableName = "super_list")
data class SuperHeroListEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int = 0,
    @ColumnInfo(name = "name") val name: String ,
    @ColumnInfo(name = "image") val image: String,
)
fun SuperHeroDataResponse.toDatabase() = SuperHeroListEntity(name = superheroes.get(0).name, image =  superheroes.get(1).superheroImage.url)

