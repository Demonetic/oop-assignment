package org.example;

import org.example.Character.Hero;
import org.example.Game.Game;
import org.example.Game.GameMenu;
import org.example.Helpers.InputReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Sunfield Village");
        Hero hero = new Hero("Brutus");
        InputReader reader = new InputReader();
        int number = reader.readInt("Enter a number: ");
        System.out.println("Number: " + number);
        reader.close();

        GameMenu game = new GameMenu();
        game.start();
//        hero.levelUp();
//        hero.status();
//        hero.takeDamage(5);
//        System.out.println(hero.isAlive());
//        Game game = new Game();
//        game.start();
    }

}