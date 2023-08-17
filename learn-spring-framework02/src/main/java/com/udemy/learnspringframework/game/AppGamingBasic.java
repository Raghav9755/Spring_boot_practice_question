package com.udemy.learnspringframework.game;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.udemy.learnspringframework.game")
public class AppGamingBasic {

    public static void main (String[] args){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppGamingBasic.class);
        context.getBean(GameRunner.class).run();
    }
}
