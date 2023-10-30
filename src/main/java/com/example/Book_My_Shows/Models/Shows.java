package com.example.Book_My_Shows.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Shows {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer showId;

    private LocalDate showDate;

    private LocalTime showTime;


    @ManyToOne
    @JoinColumn
    private Theater theater;


    @ManyToOne
    @JoinColumn
    private Movie movie;


    @OneToMany (mappedBy = "shows",cascade = CascadeType.ALL)
    private List<ShowSeat> showSeatList = new ArrayList<>();


}
