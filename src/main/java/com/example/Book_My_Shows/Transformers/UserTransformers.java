package com.example.Book_My_Shows.Transformers;

import com.example.Book_My_Shows.Models.User;
import com.example.Book_My_Shows.RequestDto.AddUserRequest;

public class UserTransformers {


    public static User convertAddUserReqToUserEntity(AddUserRequest addUserRequest){


        User user = User.builder()
                .name(addUserRequest.getName())
                .age(addUserRequest.getAge())
                .emailId(addUserRequest.getEmailId())
                .mobNo(addUserRequest.getMobNo())
                .age(addUserRequest.getAge())
                .build();
        return user;
    }
}
