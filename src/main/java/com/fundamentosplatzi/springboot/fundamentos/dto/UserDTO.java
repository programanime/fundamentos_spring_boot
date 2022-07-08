package com.fundamentosplatzi.springboot.fundamentos.dto;
import java.util.List;
import lombok.Data;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.time.LocalDate;

public @Data class UserDTO{
    private Long id;
    private String name;
    private String email;
    private Integer age;
    private LocalDate birthDate;
    
    public UserDTO(){}
    public UserDTO(Long id, String name, String email, LocalDate birthDate){
        this.id=id;
        this.name=name;
        this.email=email;
        this.birthDate=birthDate;
    }
}