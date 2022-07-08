package com.fundamentosplatzi.springboot.fundamentos.usecase;
import com.fundamentosplatzi.springboot.fundamentos.entity.*;
import com.fundamentosplatzi.springboot.fundamentos.service.*;
import org.springframework.stereotype.Component;

@Component
public class CreateUser{
    private UserService userService;
    public CreateUser(UserService userService){
        this.userService=userService;
    }
    
    public User save(User newUser){
        return this.userService.save(newUser);
    }
}