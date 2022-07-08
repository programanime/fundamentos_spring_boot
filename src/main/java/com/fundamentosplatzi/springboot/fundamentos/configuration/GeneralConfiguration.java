package com.fundamentosplatzi.springboot.fundamentos.configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Primary;
import org.springframework.boot.jdbc.DataSourceBuilder;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import com.fundamentosplatzi.springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class GeneralConfiguration{
    @Value("${value.name}")
    public String name;
    
    @Value("${value.apellido}")
    public String apellido;
    
    @Value("${value.random}")
    public String random;
    
    private DatabaseConnectionProperties databaseConnectionProperties;
    
    public GeneralConfiguration(DatabaseConnectionProperties databaseConnectionProperties){
        this.databaseConnectionProperties=databaseConnectionProperties;
    }
    
    @Bean
    public MyBeanWithProperties getProperties(){
        return new MyBeanWithPropertiesImpl(name, apellido, random);
    }
    
    @Primary
    @Bean
    public DataSource h2(){
        DataSourceBuilder dataSourceBuilder=DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(databaseConnectionProperties.driver);
        dataSourceBuilder.url(databaseConnectionProperties.url);
        dataSourceBuilder.username(databaseConnectionProperties.username);
        dataSourceBuilder.password(databaseConnectionProperties.password);
        return dataSourceBuilder.build();
    }
    
    @Bean
    public DataSource h2Server(){
        DataSourceBuilder dataSourceBuilder=DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.h2.Driver");
        dataSourceBuilder.url("jdbc:h2:mem:testdb");
        dataSourceBuilder.username("sa");
        dataSourceBuilder.password("");
        return dataSourceBuilder.build();
    }
}