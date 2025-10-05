package org.example.Game;

import org.example.Character.Hero;
import org.example.Character.Monster.Boss;
import org.example.Character.Monster.Monster;
import org.example.Character.Monster.Spider;
import org.example.Helpers.Helper;

public class Game {
    int turn = 1;
    int maxTurns = 100;
    Helper helper = new Helper();
    Hero hero = new Hero("Lotus");

    public static void forest() {
        Spider forestSpider = new Spider("Forest Spider");
        Boss forestBoss = new Boss("Tree Golem");

        System.out.println("You stumbled upon an empty cabin. After some rest you walk back to your farm");
        System.out.println("You have entered the forest.");
    }

    public static void desert() {
        Spider desertSpider = new Spider("Sand Spider");
        Boss desertBoss = new Boss("Sand Golem");

        System.out.println("You stumbled upon an oasis. After refilling your water bottle you walk back to your farm.");
        System.out.println("You have entered the desert.");
    }

    public static void cave() {
        Spider caveSpider = new Spider("Cave Spider");
        Boss caveBoss = new Boss("Stone Golem");

        System.out.println("You stumbled upon a stillwater lake. After some fishing you walk back to your farm.");
        System.out.println("You have entered the cave.");
    }

    private void decideEncounter(String safeZone, Spider spider, Boss boss){
        int percentage = helper.randomPercentage();
        if(percentage <= 10){
            System.out.println(safeZone);
        } else if(percentage <= 30){
             while(spider.isAlive() && hero.isAlive()){
                 System.out.println("Turn " + turn);
             }
        } else{
            //Return choice 3
        }


    }

//    public void start(){
//        System.out.println("You have encountered a " + caveSpider.getName() + ". The fight begins!");
//
//        while(hero.isAlive() && caveSpider.isAlive()){
//            System.out.println("Turn " + turn);
//            hero.takeDamage(helper.randomInt());
//            caveSpider.takeDamage(helper.randomInt());
//            turn++;
//            if(turn > maxTurns){
//                break;
//            }
//            helper.sleepForMilliSeconds(500);
//        }
//        if(!hero.isAlive() && !caveSpider.isAlive()){
//            System.out.println("Both you and your opponent died. You lose the game!");
//        } else if(!hero.isAlive()){
//            System.out.println("The " + caveSpider.getName() + " killed you. You lose the game!");
//        } else if(!caveSpider.isAlive()){
//            System.out.println(hero.getName() + " has slain the " + caveSpider.getName() + ". You win!");
//        } else {
//            System.out.println("Sorry, something went wrong!");
//        }
//    }
}
