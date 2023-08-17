package com.udemy.learnspringframework.LoseCouplingEx2.Information;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name,int age,Address address){};
record Address(String place,String area){};

@Configuration
public class HelloWorldConfig {
    @Bean
    public String name(){
        return "Raghav";
    }
    @Bean
    public String surname(){
        return "Agarwal";
    }
    @Bean(name="your age")
    public int age(){
        return 21;
    }
    @Bean
    public Person person(){
        var person=new Person("mohit",23,new Address("punjab","Amritsar"));
        return person;
    }
    @Bean
    @Primary
    public Person person2MethodCall(){
        return new Person(name(),age(),address());
    }

    @Bean
    public Person person3Parameters(String name,Address address,int age){//name //age // address
        return new Person(name,age,address);
    }
    @Bean
    public Person person4Qualifier(String name, @Qualifier("personQualifier")Address address,int age){//name //age // address
        return new Person(name,age,address);
    }
    @Bean
    @Qualifier("personQualifier")
    public Address address(){
        return new Address("jaipur","Kumbha marg");
    }


}
