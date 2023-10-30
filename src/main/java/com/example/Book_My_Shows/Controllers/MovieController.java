package com.example.Book_My_Shows.Controllers;


import com.example.Book_My_Shows.RequestDto.AddMovieRequest;
import com.example.Book_My_Shows.Services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/add")
    public ResponseEntity addMovie(@RequestBody AddMovieRequest addMovieRequest){

        try{

            String result = movieService.addMovie(addMovieRequest);
            return new ResponseEntity(result,HttpStatus.OK);

        }
        catch(Exception e){

            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
