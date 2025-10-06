package org.example.Character.Monster;

import org.example.Character.Character;
import org.example.Helpers.Helper;

public class Boss extends Monster {
    public Boss(String name) {
        super(name);
    }
    Helper helper = new Helper();

    @Override
    public int givenExp() {
        return 70;
    }

    @Override
    public void attack(Character character) {
        int damage = helper.randomAttackMonster();
        boolean isDoubleDamage = false;
        if(helper.randomPercentage() <=30) {
            damage *= 2;
            isDoubleDamage = true;
        }

        character.setCurrentHP(character.getCurrentHP() - damage);
        if(!character.isAlive()){
            character.setCurrentHP(0);
        }
        if(isDoubleDamage){
            System.out.println(getName() + " dealt Critical Damage! " + character.getName() + " took " + damage + " damage.");
        } else {
            System.out.println(getName() + " dealt " + damage + " damage to " + character.getName() + "!");
        }
//        helper.sleepForMilliSeconds(500);
    }
}
