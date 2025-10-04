package org.example.Character.Monster;

public class Spider extends Monster {
    public Spider(String name) {
        super(name);
    }

    @Override
    int givenExp() {
        return 50;
    }

    @Override
    public void takeDamage(int damage) {
        setCurrentHP(getCurrentHP() - damage);
        if(!isAlive()){
            setCurrentHP(0);
        }
        System.out.println(getName() + " took " + damage + "damage! Remaining health is: " + getCurrentHP() + "/" + getMaxHP() + "HP.");
    }
}
