package com.udemy.learnspringframework.LoseCouplingSpring.game;

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
