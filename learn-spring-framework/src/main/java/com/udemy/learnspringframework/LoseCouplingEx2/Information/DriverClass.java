package com.udemy.learnspringframework.LoseCouplingEx2.Information;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class DriverClass  {

    public static void main(String args[]){
        //Launch a Spring Context
        var context= new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        //configure the thing
        //i-HelloworldnConfig=@configuration
        //ii-name=@Bean
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("your age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));
        System.out.println(context.getBean(Person.class));
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBeanDefinitionCount());
        System.out.println(context.getBean("person4Qualifier"));

    }
}
