package com.arhelicortes.moviestore.data.factory

import com.arhelicortes.moviestore.data.services.MovieService
import com.arhelicortes.moviestore.data.services.UserService
import com.arhelicortes.moviestore.domain.definitions.AppConstants.JSON_PLACEHOLDER_BASE_URL
import com.arhelicortes.moviestore.domain.definitions.AppConstants.TMDB_BASE_URL

class ApiFactory {
    val userApi: UserService = RetrofitFactory.retrofit(JSON_PLACEHOLDER_BASE_URL)
        .create(UserService::class.java)

    val movieApi: MovieService = RetrofitFactory.retrofit(TMDB_BASE_URL)
        .create(MovieService::class.java)

}