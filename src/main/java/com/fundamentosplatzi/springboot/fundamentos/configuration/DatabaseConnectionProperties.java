package com.fundamentosplatzi.springboot.fundamentos.configuration;
import com.fundamentosplatzi.springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:connection.properties")
@Component
public class DatabaseConnectionProperties{
    @Value("${driver}")
    public String driver;
    
    @Value("${username}")
    public String username;
    
    @Value("${password}")
    public String password;
    
    @Value("${url}")
    public String url;
}