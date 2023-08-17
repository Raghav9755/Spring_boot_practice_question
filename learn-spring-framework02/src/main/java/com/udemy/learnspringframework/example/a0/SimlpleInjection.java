package com.udemy.learnspringframework.example.a0;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("com.udemy.learnspringframework.example.a0")
public class SimlpleInjection {

    public static void main (String[] args){
        ApplicationContext context =new AnnotationConfigApplicationContext(SimlpleInjection.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
