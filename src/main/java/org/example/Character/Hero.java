package org.example.Character;

import org.example.Character.Monster.Monster;
import org.example.Helpers.Helper;

public class Hero extends Character{
    private int level = 1;
    private int exp = 0;
    private Weapon weapon;

    Helper helper = new Helper();

    public Hero(String name) {
        super(name);
    }

    @Override
    public void attack(Character character) {
        int damage = weapon.getAttack();
        character.setCurrentHP(character.getCurrentHP() - damage);
        if(!character.isAlive()){
            character.setCurrentHP(0);
        }
        System.out.println(getName() + "dealt " + damage + " damage to" + character.getName() + "!");
//        helper.sleepForMilliSeconds(500);
    }

    public void levelUp(){
        level++;
        exp -= 100;
        setMaxHP();
        setCurrentHP(getMaxHP());
        System.out.println("You ranked up to level " + level +
                " and gained 20 extra HP! Your HP was refilled to " + getCurrentHP());
    }

    public void gainedExp(int givenExp){
        exp += givenExp;
        if(exp >= 100){
            levelUp();
        }
    }

    public void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }
}
