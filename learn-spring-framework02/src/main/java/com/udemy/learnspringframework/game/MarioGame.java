package com.udemy.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {
    public void up(){System.out.println("jump upwards");}
    public void down(){
        System.out.println("Sit downward");
    }
    public void left(){
        System.out.println("go backward");
    }
    public void right(){
        System.out.println("Run fast");
    }
}
