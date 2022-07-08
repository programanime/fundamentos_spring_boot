package com.fundamentosplatzi.springboot.fundamentos.bean;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

public class MyBeanWithDependencyImpl implements MyBeanWithDependency{
    MyOperation myOperation;
    
    private final Log LOGGER = LogFactory.getLog(MyBeanWithDependencyImpl.class);
    
    public MyBeanWithDependencyImpl(MyOperation myOperation){
        this.myOperation=myOperation;
    }
    
    public void printWithDependencies(){
        int numero = 1;
        System.out.println(myOperation.sum(numero));
        LOGGER.info("this is a general level");
    }
}