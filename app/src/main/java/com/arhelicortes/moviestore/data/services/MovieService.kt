package com.arhelicortes.moviestore.data.services

import com.arhelicortes.moviestore.data.model.response.Movie
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface MovieService {
    @GET("movie/popular")
    suspend fun getPopularMovie(): Deferred<Response<List<Movie>>>

    @GET("movie/{id}")
    suspend fun getMovieById(@Path("id") id:Int): Deferred<Response<Movie>>
}