package com.example.Book_My_Shows.Transformers;

import com.example.Book_My_Shows.Models.Shows;
import com.example.Book_My_Shows.RequestDto.AddShowRequest;

public class ShowTransformers {


    public static Shows convertAddShowRequestToEntity(AddShowRequest addShowRequest) {

        Shows shows = Shows.builder()
                .showTime(addShowRequest.getShowTime())
                .showTime(addShowRequest.getShowTime())
                .build();
        return shows;
    }
}
