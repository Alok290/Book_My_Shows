package com.example.Book_My_Shows.Repository;

import com.example.Book_My_Shows.Models.Movie;
import com.example.Book_My_Shows.Models.Show;
import com.example.Book_My_Shows.Models.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalTime;

public interface ShowRepository extends JpaRepository<Show,Integer> {

    Show findShowByShowDateAndShowTimeAndMovieAndTheater(LocalDate showDate, LocalTime showTime, Movie movie, Theater theater);

}
