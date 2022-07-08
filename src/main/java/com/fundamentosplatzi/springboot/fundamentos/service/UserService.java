package com.fundamentosplatzi.springboot.fundamentos.service;
import org.apache.commons.logging.LogFactory;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import com.fundamentosplatzi.springboot.fundamentos.repository.*;
import com.fundamentosplatzi.springboot.fundamentos.entity.*;
import com.fundamentosplatzi.springboot.fundamentos.dto.*;
import com.fundamentosplatzi.springboot.fundamentos.pojo.*;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
import org.apache.commons.logging.Log;
import org.springframework.data.domain.PageRequest;

@Service
public class UserService{
    private final Log LOGGER = LogFactory .getLog(UserService.class);
    
    private UserRepository userRepository;
    
    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    
    @Transactional
    public void saveTransactional(List<User> users){
        users.stream()
        .peek((user)->LOGGER.info("use saved "+user))
        .forEach(userRepository::save);
    }
    
    public List<User> getAllUsers(){
        return this.userRepository.findAll();
    }
    
    @Transactional
    public User save(User newUser){
        return this.userRepository.save(newUser);
    }
    
    public void delete(Long id){
        userRepository.delete(new User(id));
    }
    
    public User update(User newUser, Long id){
        return this.userRepository.findById(id).map(
            (user)->{
                user.setEmail(newUser.getEmail());
                user.setBirthDate(newUser.getBirthDate());
                user.setName(newUser.getName());
                return userRepository.save(user);
            }
        ).get();
    }
    
    public List<User> findAllPag(int page, int size){
        return this.userRepository.findAll(PageRequest.of(page, size))
        .getContent();
    }
}
