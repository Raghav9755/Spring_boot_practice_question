package com.udemy.learnspringframework.LoseCouplingInterface.game.game;

public class MarioGame implements GamingConsole {
    public void up(){
        System.out.println("jump");
    }
    public void down(){
        System.out.println("go in a hole");
    }
    public void left(){
        System.out.println("go back");
    }
    public void right(){
        System.out.println("go front");
    }


}
