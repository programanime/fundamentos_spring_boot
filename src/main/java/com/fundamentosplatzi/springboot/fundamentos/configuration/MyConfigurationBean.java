package com.fundamentosplatzi.springboot.fundamentos.configuration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import com.fundamentosplatzi.springboot.fundamentos.bean.*;
import com.fundamentosplatzi.springboot.fundamentos.pojo.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(UserPojo.class)
public class MyConfigurationBean{
    
    @Bean
    public MyBean beanOperation(){
        return new MyBeanImplement();
    }
    
    @Bean
    public MyOperation buildMyOperation(){
        return new MyOperationImplement();
    }
    
    @Bean
    public MyBeanWithDependency buildMyBeanWithDependency(MyOperation myOperation){
        return new MyBeanWithDependencyImpl(myOperation);
    }
}