package com.udemy.learnspringframework.example.PrePostConstructor;

import jakarta.annotation.PostConstruct;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
class someClass{
    private SomeDependency someDependency;
    public someClass(SomeDependency someDependency){
        super();
        this.someDependency=someDependency;
        System.out.println("All dependency arr ready!");
    }
    @PostConstruct
    public void initialize(){
        someDependency.getReady();
    }
    public void cleanup(){
        System.out.println("CleanUp");
    }
}
@Component
class SomeDependency{
    public void getReady(){
        System.out.println("Using some Dependency!");
    }
}
@Configuration
@ComponentScan("com.udemy.learnspringframework.example.PrePostConstructor")
public class PrePostAnnotationContext {
    public static void main (String[] args){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(com.udemy.learnspringframework.example.PrePostConstructor.PrePostAnnotationContext.class);
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}