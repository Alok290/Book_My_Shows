package com.example.Book_My_Shows.Services;


import com.example.Book_My_Shows.Models.*;
import com.example.Book_My_Shows.Repository.*;
import com.example.Book_My_Shows.RequestDto.BookTicketRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    TheaterRepository theaterRepository;

    @Autowired
    ShowRepository showRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    TicketRepository ticketRepository;
    public  String bookTicket(BookTicketRequest bookTicketRequest) {

        Show show  = findRightShow(bookTicketRequest);

        List<ShowSeat>  showSeats = show.getShowSeatList();

        int totalPrice = 0;
        for(ShowSeat showSeat: showSeats){
            if(bookTicketRequest.getRequestedSeatNos().contains(showSeat.getSeatNo())){
                showSeat.setAvailable(false);
                totalPrice = totalPrice+showSeat.getCost();
            }
        }

        User user = userRepository.findById(bookTicketRequest.getUserId()).get();
        Ticket ticket = Ticket.builder()
                .movieName(show.getMovie().getMovieName())
                .showTime(show.getShowTime())
                .showDate(show.getShowDate())
                .theaterAddress(show.getTheater().getAddress())
                .bookedSeats(bookTicketRequest.getRequestedSeatNos().toString())
                .show(show)
                .user(user)
                .totalPrice(totalPrice)
                .build();


        show.getTicketList().add(ticket);
        user.getTicketList().add(ticket);

      ticket=   ticketRepository.save(ticket);

        return "ticket has been booked"+ticket.getTicketId();

    }


    public  Show findRightShow(BookTicketRequest bookTicketRequest){

        Movie movie = movieRepository.findMovieByMovieName(bookTicketRequest.getMovieName());

        Theater theater = theaterRepository.findById(bookTicketRequest.getTheaterId()).get();

        Show show = showRepository.findShowByShowDateAndShowTimeAndMovieAndTheater(bookTicketRequest.getShowDate(),bookTicketRequest.getShowTime(),movie,theater);

        return show;

    }
}
