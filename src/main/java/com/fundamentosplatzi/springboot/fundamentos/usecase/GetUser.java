package com.fundamentosplatzi.springboot.fundamentos.usecase;
import com.fundamentosplatzi.springboot.fundamentos.pojo.*;
import com.fundamentosplatzi.springboot.fundamentos.entity.*;
import java.util.List;

public interface GetUser{
    List<User> getAll();
}
