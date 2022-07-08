package com.fundamentosplatzi.springboot.fundamentos.usecase;
import com.fundamentosplatzi.springboot.fundamentos.bean.*;
import com.fundamentosplatzi.springboot.fundamentos.entity.*;
import com.fundamentosplatzi.springboot.fundamentos.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class UseCaseConfiguration{
    
    @Bean
    public GetUser getUser(UserService userService){
        return new GetUserImplement(userService);
    }
}