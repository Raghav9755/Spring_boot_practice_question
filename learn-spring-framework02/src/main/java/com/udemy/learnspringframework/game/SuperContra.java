package com.udemy.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContra implements GamingConsole {
    public void up(){System.out.println("Fire upwards");}
    public void down(){
        System.out.println("Fire downward");
    }
    public void left(){
        System.out.println("Fire backward");
    }
    public void right(){
        System.out.println("Fire in front");
    }
}
