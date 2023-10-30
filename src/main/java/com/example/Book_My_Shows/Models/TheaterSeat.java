package com.example.Book_My_Shows.Models;


import com.example.Book_My_Shows.Enum.SeatType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TheaterSeat {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer theatreSeatId;

    private String seatNo;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;


    @ManyToOne
    @JoinColumn
    private Theater theater;

}
