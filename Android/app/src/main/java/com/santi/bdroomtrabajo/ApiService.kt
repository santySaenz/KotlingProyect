package com.santi.bdroomtrabajo


import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path


interface ApiService {
    @GET("/api/10229233666327556/search/sp")
    suspend fun getSuperheroes(): Response<SuperHeroDataResponse>


    @GET("/api/10229233666327556/search/sp")
    suspend fun getSuperheroDetail(): Response<SuperHeroDetailResponse>
}
