package com.example.Book_My_Shows.Models;


import com.example.Book_My_Shows.Enum.SeatType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "show_seats")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShowSeat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer showSeatId;

    private String seatNo;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    private Integer cost;

    private boolean isAvailable;

    private boolean isFoodAttached;


    @JoinColumn
    @ManyToOne
    private Show show;

}