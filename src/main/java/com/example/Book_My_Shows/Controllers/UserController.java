package com.example.Book_My_Shows.Controllers;

import com.example.Book_My_Shows.RequestDto.AddUserRequest;
import com.example.Book_My_Shows.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public ResponseEntity addUser(@RequestBody  AddUserRequest addUserRequest){

        String result = userService.addUser(addUserRequest);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
