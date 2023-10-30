package com.example.Book_My_Shows.Services;

import com.example.Book_My_Shows.Models.Movie;
import com.example.Book_My_Shows.Repository.MovieRepository;
import com.example.Book_My_Shows.RequestDto.AddMovieRequest;
import com.example.Book_My_Shows.Transformers.MovieTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    public String addMovie(AddMovieRequest addMovieRequest) {

        Movie movie = MovieTransformer.convertEntity(addMovieRequest);


        movieRepository.save(movie);
        return "Movie has been added to the DB successfully";


    }
}
