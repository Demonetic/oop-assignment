package org.example.Character;

public abstract class Character {
    private final String name;
    private int maxHP;
    private int currentHP;

    public Character(String name) {
        this.name = name;
        this.maxHP = 100;
        this.currentHP = 100;
    }

    public String getName(){
        return name;
    }

    public int getMaxHP(){
        return maxHP;
    }

    public void increaseMaxHP(){
        maxHP += 20;
    }

    public int getCurrentHP(){
        return currentHP;
    }

    public void setCurrentHP(int hp){
        if(currentHP + hp > getMaxHP()){ // Makes sure we can't set HP greater than Max HP
            currentHP = getMaxHP();
        } else {
            currentHP = hp;
        }
    }

    public boolean isAlive(){
        return currentHP > 0;
    }

    public abstract void attack(Character character);

    public void status(){
        System.out.println(getName() + " has " + getCurrentHP() + "/" + getMaxHP() + " HP left!");
    }
}

