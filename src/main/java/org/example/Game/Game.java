package org.example.Game;

import org.example.Characters.Hero;
import org.example.Helpers.Helper;

public class Game {
    int turn = 1;
    int maxTurns = 100;
    Helper helper = new Helper();
    Hero hero = new Hero("Lotus");

    public void start(){
        System.out.println("You have encountered a " + ". The fight begins!");

        while(true){
            System.out.println("Turn " + turn);
            hero.takeDamage(helper.randomInt());
            turn++;
            if(turn > maxTurns){
                break;
            }
            helper.sleepForMilliSeconds(500);
        }
        System.out.println("Game over!");
    }
}
