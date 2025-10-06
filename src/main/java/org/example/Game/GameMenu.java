package org.example.Game;

import org.example.Character.Hero;
import org.example.Helpers.InputReader;

public class GameMenu {
    private InputReader input;
    boolean gameIsRunning;
    Game game = new Game();


    public GameMenu() {
        this.input = new InputReader();
        this.gameIsRunning = true;
    }

    public void start() {
        System.out.println(">>> Welcome to Sunfield Village <<<");
        game.addName();
        Hero hero = game.getHero();
        while (gameIsRunning && hero.isAlive() && hero.getLevel() < 10) {
            displayMenu();
            int choice = input.readInt("Enter a menu-option");
            handleChoice(choice);
            if (choice == 0) {
                gameIsRunning = false;
            }
        }
        input.close();
        if (!gameIsRunning) {
            System.out.println("You have quit your adventure.");
        } else if(!hero.isAlive()){
            System.out.println("Game over.");
        } else {
            System.out.println("Congratulations! You reached level 10 and have won the game!");
        }
    }

    private void displayMenu() {
        System.out.println("\n--- Game Menu ---");
        System.out.println("1. Print Character Status");
        System.out.println("2. Explore the Forest");
        System.out.println("3. Explore the Desert");
        System.out.println("4. Explore the Cave");
        System.out.println("0. Quit Game");
        System.out.println("-----------------");
    }

    private void handleChoice(int choice) {
        System.out.println(); // Improve visibility after menu choice

        switch (choice) {
            case 1:
                game.printInfo();
                break;
            case 2:
                game.forest();
                break;
            case 3:
                game.desert();
                break;
            case 4:
                game.cave();
                break;
            case 0:
                gameIsRunning = false;
                break;
            default:
                System.out.println("Invalid input. Enter a menu choice.");
        }

    }

}
