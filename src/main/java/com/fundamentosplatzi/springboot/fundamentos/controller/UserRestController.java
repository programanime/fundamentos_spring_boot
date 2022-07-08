package com.fundamentosplatzi.springboot.fundamentos.controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import com.fundamentosplatzi.springboot.fundamentos.entity.*;
import com.fundamentosplatzi.springboot.fundamentos.usecase.*;
import com.fundamentosplatzi.springboot.fundamentos.service.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Component;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserRestController{
    private GetUser getUser;
    private UpdateUser updateUser;
    private CreateUser createUser;
    private DeleteUser deleteUser;
    private UserService userService;
    
    public UserRestController(
        GetUser getUser,
        CreateUser createUser,
        UpdateUser updateUser,
        DeleteUser deleteUser,
        UserService userService
        
    ){
        this.getUser=getUser;
        this.createUser=createUser;
        this.updateUser=updateUser;
        this.deleteUser=deleteUser;
        this.userService=userService;
    }
    
    @GetMapping
    List<User> get(){
        return getUser.getAll();
    }
    
    @PostMapping
    ResponseEntity<User> newUser(@RequestBody User newUser){
        return new ResponseEntity<>(this.createUser.save(newUser), HttpStatus.CREATED);
    }
    
    @DeleteMapping("/{id}")
    ResponseEntity deleteUser(@PathVariable Long id){
        this.deleteUser.delete(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    
    @PutMapping("/{id}")
    ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable Long id){
        return new ResponseEntity<>(this.updateUser.update(user, id), HttpStatus.OK);
    }
    
    @GetMapping("/pageable")
    List<User> getUsersPag(@RequestParam int page, @RequestParam int size){
        return userService.findAllPag(page, size);
    }
}
