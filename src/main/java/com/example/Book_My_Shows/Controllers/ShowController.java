package com.example.Book_My_Shows.Controllers;

import com.example.Book_My_Shows.RequestDto.AddShowRequest;
import com.example.Book_My_Shows.RequestDto.AddShowSeatRequest;
import com.example.Book_My_Shows.Services.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("show")
public class ShowController {


    @Autowired
    private ShowService showService;

    @PostMapping("/addShow")
    public ResponseEntity addShow(@RequestBody AddShowRequest addShowRequest){

        String result = showService.addShow(addShowRequest);
        return new ResponseEntity(result, HttpStatus.OK);
    }


    @PostMapping("/createShowSeat")
    public ResponseEntity createShowSeat(@RequestBody AddShowSeatRequest addShowSeatRequest){

        String result = showService.createShowSeat(addShowSeatRequest);
        return new ResponseEntity(result,HttpStatus.OK);
    }

}
