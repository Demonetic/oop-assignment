package org.example.Helpers;

import java.util.Scanner;

// Used to make methods for user input with Strings and Int
public class InputReader {
    private final Scanner scanner; // Disallows reassignment of scanner

    public InputReader(){
        this.scanner = new Scanner(System.in);
    }

    public int readInt(String prompt){
        System.out.print(prompt + ": ");
        while(!scanner.hasNextInt()){
            System.out.println("Invalid input. Enter an integer.");
            scanner.next(); // Jump to next input if input is not int
            System.out.print(prompt + ": ");
        }
        int value = scanner.nextInt(); // Saves int input to variable
        scanner.nextLine(); // Makes sure the whole input is read
        return value;
    }

    public String readString(String prompt){
        System.out.print(prompt + ": ");
        return scanner.nextLine();
    }

    public void close(){
        scanner.close();
    }
}
