package com.example.Book_My_Shows.Controllers;

import com.example.Book_My_Shows.RequestDto.BookTicketRequest;
import com.example.Book_My_Shows.Services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ticket")
public class TicketController {

@Autowired
private TicketService ticketService;

@PostMapping("/ticketBook")
    public String bookTicket(@RequestBody BookTicketRequest bookTicketRequest){

        String result = ticketService.bookTicket(bookTicketRequest);
        return result;
    }
}
