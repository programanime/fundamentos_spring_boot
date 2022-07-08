package com.fundamentosplatzi.springboot.fundamentos.pojo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import lombok.Data;

@ConstructorBinding
@ConfigurationProperties(prefix="user")
public @Data class UserPojo{
    private String email;
    private String password;
    private int age;
}