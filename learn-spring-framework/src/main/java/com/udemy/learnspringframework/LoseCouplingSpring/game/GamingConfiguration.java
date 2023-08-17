package com.udemy.learnspringframework.LoseCouplingSpring.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game1(){
        GamingConsole game1 =new PacMan();
        return game1;
    }
    @Bean
    public GameRunner gameRunner(){
        var gameRunner=new GameRunner(game1());
        return gameRunner;
    }
}
