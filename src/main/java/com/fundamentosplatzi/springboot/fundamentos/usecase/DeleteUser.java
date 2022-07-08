package com.fundamentosplatzi.springboot.fundamentos.usecase;
import com.fundamentosplatzi.springboot.fundamentos.service.*;
import org.springframework.stereotype.Component;

@Component
public class DeleteUser{
    private UserService userService;
    public DeleteUser(UserService userService){
        this.userService=userService;
    }
    
    public void delete(Long id){
        this.userService.delete(id);
    }
}