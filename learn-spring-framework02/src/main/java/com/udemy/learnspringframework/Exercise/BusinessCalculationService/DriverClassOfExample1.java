package com.udemy.learnspringframework.Exercise.BusinessCalculationService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import java.util.Arrays;

@Configuration
@ComponentScan
public class DriverClassOfExample1 {
        public static void main(String[] args){
        ApplicationContext context=
                new AnnotationConfigApplicationContext(DriverClassOfExample1.class);
        Arrays.stream(
                context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(
                context.getBean(businessCalculationService.class).findMax());
    }
}
