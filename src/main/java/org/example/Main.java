package org.example;

import org.example.Character.Hero;
import org.example.Game.Game;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Sunfield Village");
        Hero hero = new Hero("Brutus");
        hero.levelUp();
        hero.status();
        hero.takeDamage(5);
        System.out.println(hero.isAlive());
        Game game = new Game();
        game.start();
    }

}