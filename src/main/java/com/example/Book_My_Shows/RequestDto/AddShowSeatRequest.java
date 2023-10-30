package com.example.Book_My_Shows.RequestDto;

import lombok.Data;

@Data
public class AddShowSeatRequest {
    private Integer showId;

    private Integer priceOfClassicSeats;

    private Integer priceOfPremiumSeats;
}
