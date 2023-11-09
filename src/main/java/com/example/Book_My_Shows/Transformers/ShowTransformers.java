package com.example.Book_My_Shows.Transformers;

import com.example.Book_My_Shows.Models.Show;
import com.example.Book_My_Shows.RequestDto.AddShowRequest;

public class ShowTransformers {


    public static Show convertAddShowRequestToEntity(AddShowRequest addShowRequest) {

        Show show = Show.builder()
                .showTime(addShowRequest.getShowTime())
                .showDate(addShowRequest.getShowDate())
                .build();
        return show;
    }
}
