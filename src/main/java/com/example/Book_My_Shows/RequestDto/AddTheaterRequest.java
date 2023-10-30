package com.example.Book_My_Shows.RequestDto;

import com.example.Book_My_Shows.Enum.City;
import lombok.Data;


@Data
public class AddTheaterRequest {
    private String name;

    private String address;

    private City city;

    private Integer noOfClassicSeats;

    private Integer noOfPremiumSeats;

    private Integer noOfSeatsPerRow;
}
