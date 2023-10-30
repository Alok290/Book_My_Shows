package com.example.Book_My_Shows.Models;

import ch.qos.logback.core.boolex.EvaluationException;
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
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer userId;

    private String name;

    @Column(unique = true)
    private String emailId;

    private String mobileNo;

    private Integer age;

}
