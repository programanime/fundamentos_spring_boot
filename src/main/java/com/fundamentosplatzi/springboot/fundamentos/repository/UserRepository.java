package com.fundamentosplatzi.springboot.fundamentos.repository;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.fundamentosplatzi.springboot.fundamentos.entity.*;
import com.fundamentosplatzi.springboot.fundamentos.dto.*;
import com.fundamentosplatzi.springboot.fundamentos.pojo.*;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    @Query("select u from User u where u.email=?1")
    User findByUserEmail(String email);
    @Query("select u from User u where u.name like ?1%")
    List<User> findAndSort(String name, Sort sort);
    
    
    List<User> findByName(String name);
    List<User> findByEmail(String email);
    User findByNameAndEmail(String name, String email);
    
    @Query("select new com.fundamentosplatzi.springboot.fundamentos.dto.UserDTO(u.id, u.name, u.email, u.birthDate) from User u where u.birthDate = :date and u.email = :email")
    Optional<UserDTO> getAllByBirthDateAndEmail(@Param("date") LocalDate date,@Param("email") String email);
    
    List<User> findByNameLike(String name);
    List<User> findByNameIs(String name);
    List<User> findByNameEquals(String name);
    List<User> findByNameOrEmail(String name, String email);
    List<User> findByNameAndEmailLike(String name, String email);
    List<User> findDistinctByEmail(String email);
    List<User> findByNameNot(String name);
    List<User> findByNameIn(List list);
    List<User> findByIdLessThan(Number name);
    List<User> findByNameLessThanEqual(Number name);
    List<User> findByNameNotIn(List list);
    List<User> findDistinctByNameContainingAndEmailContainingOrAgeLessThanAndBirthDateBetween(
        String name, 
        String email, 
        Integer age,
        LocalDate start, LocalDate end);
    List<User> findByNameFalse();
    List<User> findByNameNotNull();
    List<User> findByNameIsNull();
    List<User> findByNameNull();
    List<User> findByNameGreaterThan(Number name);
    List<User> findByNameGreaterThanEqual(Number name);
    List<User> findByNameIgnoreCase(String name);
    List<User> findByNameNotLike(String name);
    List<User> findByNameStartingWith(String name);
    List<User> findByNameEndingWith(String name);
    List<User> findByNameContaining(String name);
    List<User> findByNameOrderByIdDesc(String name);
    
    
}
