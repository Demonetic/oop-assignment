package org.example.Characters;

import org.example.Helpers.Helper;

public class Hero extends Character{
    int level = 1;
    int exp = 0;

    Helper helper = new Helper();

    public Hero(String name) {
        super(name);
    }

    @Override
    public void takeDamage(int damage) {
        currentHP -= damage;
        if(!isAlive()){
            currentHP = 0;
        }
        System.out.println(name + " took " + damage + "damage! Remaining health is: " + currentHP + "/" + maxHP + "HP.");
        helper.sleepForMilliSeconds(500);
    }

    public void status(){
        System.out.println(name + " has " + currentHP + " HP left and is level " + level + "!");
    }

    public void levelUp(){
        System.out.println("You leveled up to level " + level + "!");
    }

    public void gainedExp(int givenExp){
        exp += givenExp;
        if(exp >= 100){
            level++;
        }
    }
}
