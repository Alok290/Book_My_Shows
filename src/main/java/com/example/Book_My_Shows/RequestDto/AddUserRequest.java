package com.example.Book_My_Shows.RequestDto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddUserRequest {

    private String name;

    private String emailId;

    private String mobNo;

    private Integer age;
}
