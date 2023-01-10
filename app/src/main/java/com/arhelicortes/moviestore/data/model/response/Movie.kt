package com.arhelicortes.moviestore.data.model.response

data class Movie(
    val id: Int,
    val vote_average: Double,
    val title: String,
    val overview: String,
    val adult: Boolean
)


