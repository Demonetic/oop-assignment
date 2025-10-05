package org.example.Character.Monster;

public class Boss extends Monster {
    public Boss(String name) {
        super(name);
    }

    @Override
    int givenExp() {
        return 70;
    }

    @Override
    protected void takeDamage(int damage) {
        setCurrentHP(getCurrentHP() - damage);
        if(!isAlive()){
            setCurrentHP(0);
        }
        System.out.println(getName() + " took " + damage + "damage! Remaining health is: " + getCurrentHP() + "/" + getMaxHP() + "HP.");
    }
}
