package org.example;

import org.example.Characters.Hero;
import org.example.Helpers.Helper;
import org.example.Helpers.Helpers;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Sunfield Village");

        Hero hero = new Hero("Willhelm");
        hero.status();
    }
}