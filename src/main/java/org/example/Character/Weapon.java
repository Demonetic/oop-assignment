package org.example.Character;

import org.example.Helpers.Helper;

public class Weapon {
    private final String name;
    private int attack = 5;
    private final Helper helper = new Helper();

    public Weapon(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAttack(){
        return attack;
    }

    // Generates total attack damage with base attack and random attack
    public int getTotalAttack(){
        return attack + helper.randomAttackHero();
    }

    // Method used to upgrade weapon after every level up
    public void weaponUpgrade(){
        attack += 10;
    }
}
