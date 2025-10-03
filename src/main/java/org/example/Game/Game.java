package org.example.Game;

import org.example.Characters.Hero;
import org.example.Characters.Spider;
import org.example.Helpers.Helper;

public class Game {
    int turn = 1;
    int maxTurns = 100;
    Helper helper = new Helper();
    Hero hero = new Hero("Lotus");
    Spider caveSpider = new Spider("Cave Spider");

    public void start(){
        System.out.println("You have encountered a " + caveSpider.getName() + ". The fight begins!");

        while(hero.isAlive() && caveSpider.isAlive()){
            System.out.println("Turn " + turn);
            hero.takeDamage(helper.randomInt());
            caveSpider.takeDamage(helper.randomInt());
            turn++;
            if(turn > maxTurns){
                break;
            }
            helper.sleepForMilliSeconds(500);
        }
        if(!hero.isAlive() && !caveSpider.isAlive()){
            System.out.println("Both you and your opponent died. You lose the game!");
        } else if(!hero.isAlive()){
            System.out.println("The " + caveSpider.getName() + " killed you. You lose the game!");
        } else if(!caveSpider.isAlive()){
            System.out.println(hero.getName() + " has slain the " + caveSpider.getName() + ". You win!");
        } else {
            System.out.println("Sorry, something went wrong!");
        }
    }
}
