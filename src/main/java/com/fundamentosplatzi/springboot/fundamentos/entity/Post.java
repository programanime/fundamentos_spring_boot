package com.fundamentosplatzi.springboot.fundamentos.entity;
import lombok.Data;
import javax.persistence.ManyToOne;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Table(name="post")
public @Data class Post{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_post", nullable=false, unique=true)
    private Long id;
    
    @Column(name="description")
    private String description;
    
    @ManyToOne    
    private User usuario;
}