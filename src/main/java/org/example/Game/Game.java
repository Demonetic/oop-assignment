package org.example.Game;

import org.example.Character.Hero;
import org.example.Character.Monster.Boss;
import org.example.Character.Monster.Monster;
import org.example.Character.Monster.Spider;
import org.example.Character.Weapon;
import org.example.Helpers.Helper;
import org.example.Helpers.InputReader;

public class Game {
    int turn = 1;
    int maxTurns = 100;
    Helper helper = new Helper();
    private Hero hero;
    InputReader input = new InputReader();

    private void decideEncounter(String safeZone, Spider spider, Boss boss) {
        int percentage = helper.randomPercentage();
        if (percentage <= 10) {
            System.out.println(safeZone);
        } else //(percentage <= 30)
        {
            while (hero.isAlive() && spider.isAlive()) {
                System.out.println("Turn " + turn);
                hero.attack(spider);
                spider.attack(hero);
                hero.status();
                spider.status();
                turn++;

                if(turn > maxTurns){
                    break;
                }
                //  helper.sleepForMilliSeconds(500);
            }
            if(!hero.isAlive() && !spider.isAlive()){
                System.out.println("You both died. Game over.");
            } else if(!hero.isAlive()){
                System.out.println("The " + spider.getName() + " killed you. Game over.");
            } else if(!spider.isAlive()){
                System.out.println("You killed the " + spider.getName() + "!. You earned " + spider.givenExp() + " EXP.");
                hero.gainedExp(spider.givenExp());
            } else{
                System.out.println("Something went wrong.");
            }
            // } else {
            //Return choice 3
        }
    }

    public void forest() {
        Spider forestSpider = new Spider("Forest Spider");
        Boss forestBoss = new Boss("Tree Golem");
        decideEncounter("You stumbled upon an empty cabin. After some rest you walk back to your farm", forestSpider, forestBoss);
    }

    public void desert() {
        Spider desertSpider = new Spider("Sand Spider");
        Boss desertBoss = new Boss("Sand Golem");

        System.out.println("You stumbled upon an oasis. After refilling your water bottle you walk back to your farm.");
        System.out.println("You have entered the desert.");
    }

    public void cave() {
        Spider caveSpider = new Spider("Cave Spider");
        Boss caveBoss = new Boss("Stone Golem");

        System.out.println("You stumbled upon a stillwater lake. After some fishing you walk back to your farm.");
        System.out.println("You have entered the cave.");
    }

    public void addName(){
        String heroName = input.readString("Enter your preferred Hero name");
        hero = new Hero(heroName);
        String weaponName = input.readString("Enter your preferred Weapon name");
        hero.equipWeapon(new Weapon(weaponName));
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
