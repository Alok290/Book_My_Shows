package com.example.Book_My_Shows.Models;

import com.example.Book_My_Shows.Enum.City;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Theater {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer theatreId;

    private String name;

    private String address;


    @Enumerated (value = EnumType.STRING)
    private City city;


    @OneToMany (mappedBy = "theatre",cascade = CascadeType.ALL)
    private List<Shows> showsList = new ArrayList<>();

    @OneToMany (mappedBy = "theatre",cascade = CascadeType.ALL)
    private List<TheaterSeat> theaterSeatList = new ArrayList<>();
}
