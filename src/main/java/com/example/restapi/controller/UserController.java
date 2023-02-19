package com.example.restapi.controller;

import com.example.restapi.dto.UserDTO;
import com.example.restapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user/")
@CrossOrigin

/*Create Http methods to enter,fetch,update and delete users */
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/getUsers")
    public List<UserDTO> getUser(){
        return userService.getAllUsers();
    }

    @PostMapping (value="/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }

    @PutMapping (value="/updateUser")
    public UserDTO putUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }


    @DeleteMapping(value="/deleteUser")
    public boolean deleteUser(@RequestBody UserDTO userDTO){
        return userService.deleteUser(userDTO);
    }
}

