package com.example.terminal.data

import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("aggs/ticker/AAPL/range/{timeFrame}/2022-01-09/2023-02-10?adjusted=true&sort=desc&limit=50000&apiKey=Mvek3LiJGtTjEFbiGFed96OGvG5r3oqZ")
    suspend fun loadBars(
        @Path("timeFrame") timeFrame : String
    ) : Result
}
