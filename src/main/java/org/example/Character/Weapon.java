package org.example.Character;

import org.example.Helpers.Helper;

public class Weapon {
    private final String name;
    private int attack = 5;
    Helper helper = new Helper();

    public Weapon(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAttack(){
        return attack;
    }

    public int getTotalAttack(){
        return attack + helper.randomAttackHero();
    }

    public void weaponUpgrade(){
        attack += 10;
    }
}
