package org.example.Character.Monster;

public abstract class Monster extends org.example.Character.Character {
    public Monster(String name) {
        super(name);
    }

    public abstract int givenExp();
}
