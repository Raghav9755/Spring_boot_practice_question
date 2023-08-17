package com.udemy.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GamingConsole game1;
    public GameRunner(GamingConsole game1)
    {
        this.game1=game1;
    }
    public void run(){
        game1.up();
        game1.down();
        game1.left();
        game1.right();
    }
}
