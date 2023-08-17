package com.udemy.learnspringframework.example.a1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
class YourBusinessClass{
    Dependency1 dependency1;
    Dependency2 dependency2;
    public String toString(){
        return "Using " +dependency1+ " and " +dependency2;
    }
//    @Autowired
//    public void setDependency1(Dependency1 dependency1) {
//        System.out.println("Setter Injection");
//        this.dependency1 = dependency1;
//    }
//
//    public void setDependency2(Dependency2 dependency2) {
//        this.dependency2 = dependency2;
//    }
    //@Autowired
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        super();
        System.out.println("Constructor Injection");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }
}
@Component
class Dependency1{

}
@Component
class Dependency2{

}


@Configuration
@ComponentScan("com.udemy.learnspringframework.example.a1")
public class DependencyInjection {

    public static void main (String[] args){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(DependencyInjection.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean(YourBusinessClass.class));
    }
}
