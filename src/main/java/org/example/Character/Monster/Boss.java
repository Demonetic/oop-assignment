package org.example.Character.Monster;

import org.example.Character.Character;
import org.example.Helpers.Helper;

public class Boss extends Monster {
    private final int EXP = 70; // Makes it easier to change when needed
    private final Helper helper = new Helper();

    public Boss(String name) {
        super(name);
    }

    @Override
    public int givenExp() {
        return EXP;
    }

    @Override
    public void attack(Character character) {
        int damage = helper.randomAttackMonster();
        boolean isDoubleDamage = false;
        if(helper.randomPercentage() <=30) { // Gives 30% chance to deal double damage
            damage *= 2;
            isDoubleDamage = true;
        }
        character.setCurrentHP(character.getCurrentHP() - damage);
        if(!character.isAlive()){
            character.setCurrentHP(0);
        }
        if(isDoubleDamage){ // Prints different options if Boss deals double damage or not
            System.out.println(getName() + " dealt Critical Damage! " + character.getName() + " took " + damage + " damage.");
        } else {
            System.out.println(getName() + " dealt " + damage + " damage to " + character.getName() + "!");
        }
    }
}
