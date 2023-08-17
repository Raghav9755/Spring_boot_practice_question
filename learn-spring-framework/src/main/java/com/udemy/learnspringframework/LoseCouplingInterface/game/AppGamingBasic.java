package com.udemy.learnspringframework.LoseCouplingInterface.game;

import com.udemy.learnspringframework.LoseCouplingInterface.game.game.GameRunner;
import com.udemy.learnspringframework.LoseCouplingInterface.game.game.PacMan;

public class  AppGamingBasic {
    public static void main(String args[]){
        //var game=new MarioGame();
        //var game=new SuperContra();
        var game =new PacMan();
        var gameRunner=new GameRunner(game);
        gameRunner.run();
    }
}
