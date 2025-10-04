package org.example.Character;

import org.example.Helpers.Helper;

public class Hero extends Character{
    private int level = 1;
    private int exp = 0;

    Helper helper = new Helper();

    public Hero(String name) {
        super(name);
    }

    @Override
    public void takeDamage(int damage) {
        setCurrentHP(getCurrentHP() - damage);
        if(!isAlive()){
            setCurrentHP(0);
        }
        System.out.println(getName() + " took " + damage + "damage! Remaining health is: "
                + getCurrentHP() + "/" + getMaxHP() + "HP.");
        helper.sleepForMilliSeconds(500);
    }

    public void status(){
        System.out.println(getName() + " has " + getCurrentHP() + " HP left and is level " + level + "!");
    }

    public void levelUp(){
        System.out.println("You leveled up to level " + level + " and now have " + getMaxHP() + " HP!");
    }

    public void gainedExp(int givenExp){
        exp += givenExp;
        if(exp >= 100){
            level++;
        }
    }
}
