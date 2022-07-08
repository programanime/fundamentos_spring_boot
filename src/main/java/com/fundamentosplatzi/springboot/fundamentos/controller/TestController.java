package com.fundamentosplatzi.springboot.fundamentos.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Component;

@Controller
public class TestController{
    @RequestMapping("/other")
    @ResponseBody
    public String function(){
        return "Hello from the controller yeah";
    }
}