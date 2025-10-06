package org.example.Character.Monster;

public abstract class Monster extends org.example.Character.Character {
    public Monster(String name) {
        super(name);
    }
    // Method for how much exp Hero gets when killing a monster
    public abstract int givenExp();
}
