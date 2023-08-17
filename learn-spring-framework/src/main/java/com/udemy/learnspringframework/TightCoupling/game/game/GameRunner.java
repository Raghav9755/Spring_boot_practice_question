package com.udemy.learnspringframework.TightCoupling.game.game;

public class GameRunner {
   private MarioGame game;
   // in this class if i have to use superconra then i have to change the constructor in this class
   //It is an example to tightly coupling where we have to do changes in the code ;
    public GameRunner(MarioGame game) {
        this.game=game;
    }
    public void run(){
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
