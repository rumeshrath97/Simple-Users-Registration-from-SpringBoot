package com.example.restapi.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

/*Create all variables*/
public class UserDTO {
    private int id;
    private String name;
    private String address;
}
