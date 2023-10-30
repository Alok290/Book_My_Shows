package com.example.Book_My_Shows.Repository;

import com.example.Book_My_Shows.Models.Shows;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<Shows,Integer> {

}
