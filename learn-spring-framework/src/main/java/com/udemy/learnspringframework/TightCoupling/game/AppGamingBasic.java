package com.udemy.learnspringframework.TightCoupling.game;

import com.udemy.learnspringframework.TightCoupling.game.game.GameRunner;
import com.udemy.learnspringframework.TightCoupling.game.game.MarioGame;
import com.udemy.learnspringframework.TightCoupling.game.game.SuperContra;

public class AppGamingBasic {
    public static void main(String args[]){
        var marioGame=new MarioGame();
        var superContra=new SuperContra();
        var gameRunner=new GameRunner(marioGame);
        gameRunner.run();

    }
}
