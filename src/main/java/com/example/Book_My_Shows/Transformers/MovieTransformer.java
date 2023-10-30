package com.example.Book_My_Shows.Transformers;

import com.example.Book_My_Shows.Models.Movie;
import com.example.Book_My_Shows.RequestDto.AddMovieRequest;

public  class MovieTransformer {

    public static Movie convertEntity(AddMovieRequest addMovieRequest) {

        Movie movie = Movie.builder()
                .movieName(addMovieRequest.getMovieName())
                .genre(addMovieRequest.getGenre())
                .rating(addMovieRequest.getRating())
                .releaseDate(addMovieRequest.getReleaseDate())
                .build();

        return movie;
    }
}
