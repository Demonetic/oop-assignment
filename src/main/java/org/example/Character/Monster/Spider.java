package org.example.Character.Monster;

import org.example.Character.Character;
import org.example.Helpers.Helper;

public class Spider extends Monster {
    private final int EXP_REWARD = 50; // Makes it easier to change when needed
    private final Helper helper = new Helper();

    public Spider(String name) {
        super(name);
    }

    @Override
    public int givenExp() {
        return EXP_REWARD;
    }

    @Override
    public void attack(Character character) {
        int damage = helper.randomAttackMonster();
        character.setCurrentHP(character.getCurrentHP() - damage);
        if (!character.isAlive()) {
            character.setCurrentHP(0);
        }
        System.out.println(getName() + " dealt " + damage + " damage to " + character.getName() + "!");
    }
}
