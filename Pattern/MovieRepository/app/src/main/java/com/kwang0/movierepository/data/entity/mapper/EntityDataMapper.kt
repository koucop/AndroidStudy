package com.kwang0.movierepository.data.entity.mapper

import com.kwang0.movierepository.data.entity.MovieEntity
import com.kwang0.movierepository.domain.Movie
import javax.inject.Inject

class EntityDataMapper @Inject constructor() {

    fun transform(movieEntity: MovieEntity?): Movie? {
        var movie: Movie? = null
        if (movieEntity != null) {
            movie = Movie(movieEntity.id,
                movieEntity.voteAverage,
                movieEntity.title,
                movieEntity.posterPath,
                movieEntity.backdropPath,
                movieEntity.overview,
                movieEntity.releaseDate)
        }
        return movie
    }

    fun transform(movieEntityList: List<MovieEntity>): List<Movie> {
        val movieList = mutableListOf<Movie>()
        for (movieEntity in movieEntityList) {
            val movie = transform(movieEntity)
            if (movie != null) {
                movieList.add(movie)
            }
        }
        return movieList
    }

}
