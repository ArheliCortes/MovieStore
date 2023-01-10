package com.arhelicortes.moviestore.domain.definitions

import com.arhelicortes.moviestore.BuildConfig

object AppConstants {
    var tmdbApiKey = BuildConfig.TMDB_API_KEY
    const val JSON_PLACEHOLDER_BASE_URL = "https://jsonplaceholder.typicode.com"
    const val TMDB_BASE_URL = "https://api.themoviedb.org/3/"
    const val TMDB_PHOTO_URL = " http://image.tmdb.org/t/p/w185"
}