package com.fundamentosplatzi.springboot.fundamentos.entity;
import java.util.List;
import lombok.Data;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.time.LocalDate;

import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Table(name="user")
public @Data class User{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_user", nullable=false, unique=true)
    private Long id;
    
    @Column(name="name")
    private String name;
    
    @Column(name="email")
    private String email;
    
    @Column(name="age")
    private Integer age;
    
    @Column(name="id_post")
    private LocalDate birthDate;
    
    @OneToMany(mappedBy="usuario", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    private List<Post> posts = new ArrayList<>();
    public User(){}
    public User(Long id){
        this.id=id;
    }
    public User(String name, String email, LocalDate birthDate){
        this.name=name;
        this.email=email;
        this.birthDate=birthDate;
    }
}