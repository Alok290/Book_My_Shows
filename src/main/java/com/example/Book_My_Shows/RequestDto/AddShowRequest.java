package com.example.Book_My_Shows.RequestDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddShowRequest {
    private LocalDate showDate;
    private LocalTime showTime;
    private String movieName; //Movie name is unique : movie Entity is unqiue
    private Integer theaterId;
}
