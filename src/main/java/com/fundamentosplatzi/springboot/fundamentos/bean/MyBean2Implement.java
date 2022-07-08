package com.fundamentosplatzi.springboot.fundamentos.bean;
import org.springframework.stereotype.Component;

public class MyBean2Implement implements MyBean{
    @Override
    public void print(){
        System.out.println("hola mundito dos");
    }
}