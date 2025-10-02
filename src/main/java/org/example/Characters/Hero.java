package org.example.Characters;

public class Hero extends Character{
    int level = 1;

    public Hero(String name) {
        super(name);
    }

    @Override
    void takeDamage() {

    }

    public void status(){
        System.out.println(name + " has " + currentHP + " HP left and is level " + level + "!");
    }
}
