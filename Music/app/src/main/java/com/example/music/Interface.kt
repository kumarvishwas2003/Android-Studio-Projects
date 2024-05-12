package com.example.music

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface Interface {
    @Headers("X-RapidAPI-Key", "9af1cd48a3mshf7267a4ea8849d5p165220jsnd37550cd9f53","X-RapidAPI-Host:deezerdevs-deezer.p.rapidapi.com")
    @GET("search")
    fun getData(@Query("q")query:String): Call<MyData>
}