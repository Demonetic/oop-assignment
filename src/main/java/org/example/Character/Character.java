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

    public void setMaxHP(){
        maxHP += 20;
    }

    public int getCurrentHP(){
        return currentHP;
    }

    public void setCurrentHP(int hp){
        currentHP = hp;
    }

    public boolean isAlive(){
        return currentHP > 0;
    }

    protected abstract void takeDamage(int damage);
}
