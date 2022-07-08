package com.fundamentosplatzi.springboot.fundamentos.usecase;
import com.fundamentosplatzi.springboot.fundamentos.service.*;
import com.fundamentosplatzi.springboot.fundamentos.entity.*;
import org.springframework.stereotype.Component;

@Component
public class UpdateUser{
    private UserService userService;
    public UpdateUser(UserService userService){
        this.userService=userService;
    }
    
    public User update(User user, Long id){
        return this.userService.update(user, id);
    }
}