package org.example.Characters;

public class Spider extends Monster {
    public Spider(String name) {
        super(name);
    }

    @Override
    int givenExp() {
        return 50; //return 100 for Boss-class
    }

    @Override
    public void takeDamage(int damage) {
        currentHP -= damage;
        if(!isAlive()){
            currentHP = 0;
        }
        System.out.println(name + " took " + damage + "damage! Remaining health is: " + currentHP + "/" + maxHP + "HP.");
    }
}
