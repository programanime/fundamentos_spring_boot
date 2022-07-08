package com.fundamentosplatzi.springboot.fundamentos.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.fundamentosplatzi.springboot.fundamentos.entity.*;
import com.fundamentosplatzi.springboot.fundamentos.pojo.*;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}