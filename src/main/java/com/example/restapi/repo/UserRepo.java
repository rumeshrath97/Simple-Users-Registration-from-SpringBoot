package com.example.restapi.repo;


import com.example.restapi.entity.User;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer>{

}

