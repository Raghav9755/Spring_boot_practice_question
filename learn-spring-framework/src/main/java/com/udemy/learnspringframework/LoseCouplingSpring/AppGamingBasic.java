package com.udemy.learnspringframework.LoseCouplingSpring;

import com.udemy.learnspringframework.LoseCouplingSpring.game.GameRunner;
import com.udemy.learnspringframework.LoseCouplingSpring.game.GamingConfiguration;
import com.udemy.learnspringframework.LoseCouplingSpring.game.GamingConsole;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingBasic {
    public static void main (String[] args){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(GamingConfiguration.class);
        context.getBean(GamingConsole.class).down();
        context.getBean(GameRunner.class).run();
    }
}
