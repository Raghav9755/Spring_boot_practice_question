package com.udemy.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacMan implements GamingConsole {
    public void up(){System.out.println("go upwards");}
    public void down(){
        System.out.println("go downward");
    }
    public void left(){
        System.out.println("go backward");
    }
    public void right(){
        System.out.println("eat food");
    }
}
