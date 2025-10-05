package org.example.Character.Monster;

import org.example.Character.Character;
import org.example.Helpers.Helper;

public class Spider extends Monster {
    public Spider(String name) {
        super(name);
    }

    Helper helper = new Helper();

    @Override
    int givenExp() {
        return 50;
    }

    @Override
    public void attack(Character character) {
        int damage = helper.randomAttack();
        character.setCurrentHP(character.getCurrentHP() - damage);
        if (!character.isAlive()) {
            character.setCurrentHP(0);
        }
        System.out.println(getName() + "dealt " + damage + " damage to" + character.getName() + "!");
//        helper.sleepForMilliSeconds(500);
    }
}
