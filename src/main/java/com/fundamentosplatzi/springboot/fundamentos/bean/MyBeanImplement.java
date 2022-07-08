package com.fundamentosplatzi.springboot.fundamentos.bean;
import org.springframework.stereotype.Component;

public class MyBeanImplement implements MyBean{
    @Override
    public void print(){
        System.out.println("hola mundito");
    }
}