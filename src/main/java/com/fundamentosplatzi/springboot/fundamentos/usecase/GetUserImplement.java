package com.fundamentosplatzi.springboot.fundamentos.usecase;
import com.fundamentosplatzi.springboot.fundamentos.pojo.*;
import com.fundamentosplatzi.springboot.fundamentos.entity.*;
import com.fundamentosplatzi.springboot.fundamentos.service.*;
import java.util.List;

public class GetUserImplement implements GetUser{
    private UserService userService;
    
    public GetUserImplement(UserService userService){
        this.userService=userService;
    }
    
    @Override
    public List<User> getAll(){
        return userService.getAllUsers();
    }
}
