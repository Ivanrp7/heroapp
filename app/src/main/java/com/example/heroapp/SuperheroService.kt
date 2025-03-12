package com.example.heroapp

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryName

interface SuperheroService {

    @GET("search/{name}")
    fun findSuperheroByName(@Path("name") query: String):


    @GET("{id}")
    fun findSuperheroById(@Path("superhero-id") id: String): Superhero





}
