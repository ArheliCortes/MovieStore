package com.arhelicortes.moviestore.data.services

import com.arhelicortes.moviestore.data.model.response.Photos
import com.arhelicortes.moviestore.data.model.response.Posts
import com.arhelicortes.moviestore.data.model.response.Users
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET

interface UserService {
    @GET("/posts")
    suspend fun getPosts(): Deferred<Response<List<Posts>>>

    @GET("/users")
    suspend fun getUsers(): Deferred<Response<List<Users>>>

    @GET("/photos")
    suspend fun getPhotos(): Deferred<Response<List<Photos>>>
}