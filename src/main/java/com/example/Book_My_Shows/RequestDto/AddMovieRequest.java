package com.example.Book_My_Shows.RequestDto;

import com.example.Book_My_Shows.Enum.Genre;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AddMovieRequest {
    private String movieName;
    private Double rating;
    private Genre genre;
    private LocalDate releaseDate;
}
