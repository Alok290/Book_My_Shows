package com.example.Book_My_Shows.RequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookTicketRequest {

    private String movieName;

    private Integer theaterId;

    private LocalDate showDate;

    private LocalTime showTime;

    private List<String> requestedSeatNos;

    private Integer userId;


}
