package com.example.Book_My_Shows.Services;

import com.example.Book_My_Shows.Models.User;
import com.example.Book_My_Shows.Repository.UserRepository;
import com.example.Book_My_Shows.RequestDto.AddUserRequest;
import com.example.Book_My_Shows.Transformers.UserTransformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public String addUser(AddUserRequest addUserRequest) {


        User user = UserTransformers.convertAddUserReqToUserEntity(addUserRequest);

        userRepository.save(user);

        return "User added successfully";

    }
}
