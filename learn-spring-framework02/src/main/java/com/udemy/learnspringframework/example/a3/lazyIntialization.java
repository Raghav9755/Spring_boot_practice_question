package com.udemy.learnspringframework.example.a3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component
class ClassA{

}
@Component
@Lazy
class ClassB{
    private ClassA classa;
    public ClassB(ClassA classa) {
        System.out.println("In Class B");
        this.classa = classa;
    }
    public void doSomething(){
        System.out.println("Do something");
    }
}
@Configuration
@ComponentScan("com.udemy.learnspringframework.example.a3")
public class lazyIntialization {

    public static void main (String[] args){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(lazyIntialization.class);
        System.out.println("Intialization of context is completed");
        context.getBean(ClassB.class);

           // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
