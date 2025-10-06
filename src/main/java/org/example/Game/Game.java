package org.example.Game;

import org.example.Character.Hero;
import org.example.Character.Monster.Boss;
import org.example.Character.Monster.Monster;
import org.example.Character.Monster.Spider;
import org.example.Character.Weapon;
import org.example.Helpers.Helper;
import org.example.Helpers.InputReader;

public class Game {
    int turn = 1;
    int maxTurns = 100;
    Helper helper = new Helper();
    private Hero hero;
    InputReader input = new InputReader();

    public Hero getHero() {
        return hero;
    }

    private void decideEncounter(String safeZone, Spider spider, Boss boss) {
        int percentage = helper.randomPercentage();
        if (percentage <= 10) {
            System.out.println(safeZone);
            if (hero.getCurrentHP() + 20 > hero.getMaxHP()) {
                hero.setCurrentHP(hero.getMaxHP());
                System.out.println("Your HP is full after the rest.");
            } else {
                hero.setCurrentHP(hero.getCurrentHP() + 20);
                System.out.println("You have regained 20HP. You now have " + hero.getCurrentHP() + "HP.");
            }
        } else if (percentage <= 30) {
            System.out.println("You have encountered a " + boss.getName());
            monsterCombat(boss);
        } else {
            System.out.println("You have encountered a " + spider.getName());
            monsterCombat(spider);
        }
}

public void printInfo(){
    System.out.println(hero.getName() + " has " + hero.getCurrentHP() + " HP and is level " +
            hero.getLevel() + " with " + hero.getExp() + " total EXP.");
    System.out.println(hero.getWeapon().getName() + " deals a total base damage of " +
            hero.getWeapon().getAttack() + ".");
}

public void forest() {
    Spider forestSpider = new Spider("Forest Spider");
    Boss forestBoss = new Boss("Tree Golem");
    decideEncounter("You stumbled upon an empty cabin. After some rest you walk back to your farm", forestSpider, forestBoss);
}

public void desert() {
    Spider desertSpider = new Spider("Sand Spider");
    Boss desertBoss = new Boss("Sand Golem");
    decideEncounter("You stumbled upon an oasis. After refilling your water bottle you walk back to your farm.", desertSpider, desertBoss);
}

public void cave() {
    Spider caveSpider = new Spider("Cave Spider");
    Boss caveBoss = new Boss("Stone Golem");
    decideEncounter("You stumbled upon a stillwater lake. After some fishing you walk back to your farm.", caveSpider, caveBoss);
}

public void addName() {
    String heroName = input.readString("Enter your preferred Hero name");
    hero = new Hero(heroName);
    String weaponName = input.readString("Enter your preferred Weapon name");
    hero.equipWeapon(new Weapon(weaponName));
}

public void monsterCombat(Monster monster) {
    while (hero.isAlive() && monster.isAlive()) {
        System.out.println("Turn " + turn);
        hero.attack(monster);
        monster.attack(hero);
        hero.status();
        monster.status();
        turn++;
        if (turn > maxTurns) {
            break;
        }
    }
    if (!hero.isAlive() && !monster.isAlive()) {
        System.out.println("Both " + hero.getName() + " and the " + monster.getName() + " have died.");
    } else if (!hero.isAlive()) {
        System.out.println("The " + monster.getName() + " killed you.");
    } else if (!monster.isAlive()) {
        System.out.println("You killed the " + monster.getName() + "!. You earned " + monster.givenExp() + " EXP.");
        hero.gainedExp(monster.givenExp());
    } else {
        System.out.println("Something went wrong.");
    }
    helper.sleepForMilliSeconds(500);
}
}
