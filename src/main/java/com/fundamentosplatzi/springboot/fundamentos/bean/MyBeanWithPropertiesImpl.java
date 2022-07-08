package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanWithPropertiesImpl implements MyBeanWithProperties{
    private String nombre;
    private String apellido;
    private String random;
    
    public MyBeanWithPropertiesImpl(String nombre, String apellido, String random){
        this.nombre=nombre;
        this.apellido=apellido;
        this.random=random;
    }
    
    @Override
    public void show(){
        System.out.println(nombre+"-"+apellido+"  : "+random);
    }
}