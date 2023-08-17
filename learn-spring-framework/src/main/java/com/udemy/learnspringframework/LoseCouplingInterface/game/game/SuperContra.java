package com.udemy.learnspringframework.LoseCouplingInterface.game.game;

public class SuperContra implements GamingConsole {
    public void up(){
        System.out.println("go up");
    }
    public void down(){
        System.out.println("sit down");
    }
    public void left(){
        System.out.println("turn back");
    }
    public void right(){
        System.out.println("run fast");
    }

}
