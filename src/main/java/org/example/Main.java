package org.example;

import org.example.Helpers.Helper;
import org.example.Helpers.Helpers;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Sunfield Village");
        Helper helper = new Helper();
        System.out.println(helper.randomInt());
        System.out.println("Before sleep");
        helper.sleepForMilliSeconds(1000);
        System.out.println("After sleep");
    }
}