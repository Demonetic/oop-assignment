package org.example.Game;

import org.example.Helpers.InputReader;

public class GameMenu {
    private InputReader input;
    boolean gameIsRunning;

    public GameMenu() {
        this.input = new InputReader();
        this.gameIsRunning = true;
    }

    public void start(){
        System.out.println(">>> Welcome to Sunfield Village <<<");
        while(gameIsRunning){
            displayMenu();
            int choice = input.readInt("Enter a menu-option");
            handleChoice(choice);
            if(choice == 0){
                gameIsRunning = false;
            }

        }
        input.close();
        System.out.println("You have quit the game.\nGame over.");
    }

    private void displayMenu(){
        System.out.println("\n--- Game Menu ---");
        System.out.println("1. Explore the Forest");
        System.out.println("2. Explore the Desert");
        System.out.println("3. Explore the Cave");
        System.out.println("0. Quit Game");
        System.out.println("-----------------");
    }

    private void handleChoice(int choice){
        System.out.println(); // Improve visibility after menu choice

        switch(choice){
            case 1:
                Game.forest();
                break;
            case 2:
                Game.desert();
                break;
            case 3:
                Game.cave();
                break;
            case 0:
                gameIsRunning = false;
                break;
            default:
                System.out.println("Invalid input. Enter a menu choice.");
        }

    }

    
}
