package com.example.Book_My_Shows.Repository;

import com.example.Book_My_Shows.Models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Integer> {

    Movie findMovieByMovieName(String movieName);
}
