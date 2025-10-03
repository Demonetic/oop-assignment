package org.example.Characters;

abstract class Monster extends Character{
    public Monster(String name) {
        super(name);
    }

    abstract int givenExp();

}
