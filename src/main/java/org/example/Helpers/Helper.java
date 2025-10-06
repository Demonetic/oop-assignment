package org.example.Helpers;

public class Helper implements Helpers {
    @Override
    public int randomAttackMonster() {
        return (int) Math.round(Math.random() * 15);
    }

    public int randomAttackHero(){
        return (int) Math.round(Math.random() * 20);
    }

    public int randomPercentage(){
        return (int) Math.round(Math.random() * 99) + 1;
    }

    @Override
    public void sleepForMilliSeconds(int time) {
        try{
            Thread.sleep(time);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
