package com.example.Book_My_Shows.Repository;


import com.example.Book_My_Shows.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
