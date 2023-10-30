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
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
    private Shows shows;
}
