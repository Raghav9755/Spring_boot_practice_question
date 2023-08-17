package com.udemy.learnspringframework.example.BeansScopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass{

}

@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypesClass{

}
@Configuration
@ComponentScan("com.udemy.learnspringframework.example.BeansScopes")
public class BeansScopeLauncherApp {

    public static void main (String[] args){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BeansScopeLauncherApp.class);
        System.out.println(context.getBean(NormalClass.class));
        System.out.println(context.getBean(NormalClass.class));
        System.out.println(context.getBean(NormalClass.class));
        System.out.println(context.getBean(PrototypesClass.class));
        System.out.println(context.getBean(PrototypesClass.class));
        System.out.println(context.getBean(PrototypesClass.class));

//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
