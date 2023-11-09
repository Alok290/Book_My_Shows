package com.example.Book_My_Shows.Services;

import com.example.Book_My_Shows.Enum.SeatType;
import com.example.Book_My_Shows.Models.*;
import com.example.Book_My_Shows.Repository.MovieRepository;
import com.example.Book_My_Shows.Repository.ShowRepository;
import com.example.Book_My_Shows.Repository.TheaterRepository;
import com.example.Book_My_Shows.RequestDto.AddShowRequest;
import com.example.Book_My_Shows.RequestDto.AddShowSeatRequest;
import com.example.Book_My_Shows.Transformers.ShowTransformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class ShowService {

    @Autowired
    private ShowRepository showRepository;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private TheaterRepository theaterRepository;
    public String addShow(AddShowRequest addShowRequest) {

        Show show = ShowTransformers.convertAddShowRequestToEntity(addShowRequest);

        Movie movie = movieRepository.findMovieByMovieName(addShowRequest.getMovieName());

        Optional<Theater> optionalTheatre = theaterRepository.findById(addShowRequest.getTheaterId());
        Theater theater = optionalTheatre.get();


        show.setMovie(movie);
        show.setTheater(theater);

        theater.getShowList().add(show);
        movie.getShowList().add(show);


       show = showRepository.save(show);

        return "Show has been saved to the DB with showId "+ show.getShowId();


    }

    public String createShowSeat(AddShowSeatRequest showSeatsRequest) {

        Show show = showRepository.findById(showSeatsRequest.getShowId()).get();

        Theater theater = show.getTheater();

        List<TheaterSeat> theaterSeatList = theater.getTheaterSeatList();

        List<ShowSeat> showSeatList = new ArrayList<>();


        for(TheaterSeat theaterSeat:theaterSeatList) {

            ShowSeat showSeat = ShowSeat.builder()
                    .seatNo(theaterSeat.getSeatNo())
                    .seatType(theaterSeat.getSeatType())
                    .isAvailable(true)
                    .isFoodAttached(false)
                    .show(show)
                    .build();

            if(theaterSeat.getSeatType().equals(SeatType.CLASSIC)){
                showSeat.setCost(showSeatsRequest.getPriceOfClassicSeats());
            }
            else{
                showSeat.setCost(showSeatsRequest.getPriceOfPremiumSeats());
            }

            showSeatList.add(showSeat);
        }

        show.setShowSeatList(showSeatList);

        //Either save parent or save child

        //child is alot of seats (you need to save that list)

        showRepository.save(show);
        return "The show seats have been added";

    }




}