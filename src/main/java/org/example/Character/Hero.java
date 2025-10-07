package org.example.Character;

import org.example.Helpers.Helper;

public class Hero extends Character{
    private int level = 1;
    private int exp = 0;
    private Weapon weapon; // Connects Weapon to the Hero

    public Hero(String name) {
        super(name);
    }

    @Override
    public void attack(Character character) {
        int damage = weapon.getTotalAttack();
        character.setCurrentHP(character.getCurrentHP() - damage);
        if(!character.isAlive()){
            character.setCurrentHP(0);
        }
        System.out.println(getName() + " dealt " + damage + " damage to " + character.getName() + "!");
    }

    public int getLevel(){
        return level;
    }

    // Method that adds exp from fights and makes sure you level up after 100 exp
    public void gainedExp(int givenExp){
        exp += givenExp;
        if(exp >= 100){
            levelUp();
        }
    }

    public void levelUp(){
        level++;
        exp -= 100; // Resets exp to make counting easier
        increaseMaxHP();
        setCurrentHP(getMaxHP()); // Gives Hero the new max hp as current hp
        weapon.weaponUpgrade();
        System.out.println("You ranked up to level " + level +
                " and gained 20 extra HP! Your HP was refilled to " + getCurrentHP() + ".");
        System.out.println("Your weapon has gained 10 extra base damage. Your base damage is now "
                + weapon.getAttack() + ".");
    }

    // Makes sure exp prints as 0 when creating Hero
    public int getExp(){
        return ((getLevel() -1) * 100) + exp;
    }

    // Allows Hero to be created first and adds weapon to Hero
    public void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    // Allows equipped Weapon information to be accessed through Hero
    public Weapon getWeapon(){
        return weapon;
    }
}
