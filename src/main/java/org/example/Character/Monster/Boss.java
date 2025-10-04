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

    }
}
