package org.example.Helpers;

import java.util.Scanner;

public class InputReader {
    private Scanner userInput;

    public InputReader(){
        this.userInput = new Scanner(System.in);
    }

    public int readInt(String prompt){
        System.out.print(prompt + ": ");

        while(!userInput.hasNextInt()){
            System.out.println("Invalid input. Enter a integer.");
            userInput.next();
            System.out.println(prompt + ": ");
        }
        int value = userInput.nextInt();
        userInput.nextLine();
        return value;
    }

    public String readString(String prompt){
        System.out.println(prompt + ": ");
        return userInput.nextLine();
    }

//    public String readWord(String prompt){
//        System.out.println(prompt + ": ");
//        String word = userInput.next();
//        userInput.nextLine();
//        return word;
//    }

    public void close(){
        userInput.close();
    }
}
