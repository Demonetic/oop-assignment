package org.example.Helpers;

// Decides methods for generating random numbers and create text delays
public class Helper implements Helpers {
    @Override
    public int randomAttackMonster() {
        return (int) Math.round(Math.random() * 15); // Generate random number from 0-15
    }

    @Override
    public int randomAttackHero(){
        return (int) Math.round(Math.random() * 20); // Generate random number from 0-20
    }

    @Override
    // Return random number from 1-100 to use for percentage checks
    public int randomPercentage(){
        return (int) Math.round(Math.random() * 99) + 1;
    }

    @Override
    // Method to create text delay
    public void sleepForMilliSeconds(int time) {
        try{
            Thread.sleep(time);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
