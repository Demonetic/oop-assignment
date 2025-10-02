package org.example.Characters;

import org.example.Helpers.Helper;

abstract class Character {
    String name;
    int attack;
    int maxHP;
    int currentHP;


    public Character(String name) {
        this.name = name;
        this.attack = 0;
        this.maxHP = 100;
        this.currentHP = 100;
    }

    protected boolean isAlive(){
        return currentHP > 0;
    }

    abstract void takeDamage();

}
