package org.example.Game;

import org.example.Character.Hero;
import org.example.Helpers.InputReader;

// Used to implement game logic from Game and shows menu to player
public class GameMenu {
    private final InputReader scanner;
    private final Game game;
    private boolean gameIsRunning;

    public GameMenu() {
        this.scanner = new InputReader();
        this.game = new Game();
        this.gameIsRunning = true;
    }

    public void start() {
        System.out.println(">>> Welcome to Sunfield Village <<<");
        game.addName(); // Let player choose Hero- and Weapon name
        Hero hero = game.getHero(); // Creates variable for created Hero
        while (gameIsRunning && hero.isAlive() && hero.getLevel() < 10) { // Leaves loop if player quits, dies or reaches level 10
            displayMenu();
            int choice = scanner.readInt("Enter a menu-option");
            handleChoice(choice);
        }
        scanner.close();
        if (!gameIsRunning) {
            System.out.println("You have quit your adventure.");
        } else if(!hero.isAlive()){
            System.out.println("Game over.");
        } else {
            System.out.println("Congratulations! You reached level 10 and have won the game!");
        }
    }

    private void displayMenu() {
        System.out.println("\n------- Game Menu -------");
        System.out.println("1. Print Character Status");
        System.out.println("2. Explore the Forest");
        System.out.println("3. Explore the Desert");
        System.out.println("4. Explore the Cave");
        System.out.println("0. Quit Game");
        System.out.println("-------------------------");
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
