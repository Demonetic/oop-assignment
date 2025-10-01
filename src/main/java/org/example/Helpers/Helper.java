package org.example.Helpers;

public class Helper implements Helpers {
    @Override
    public int randomInt() {
        return (int) Math.round(Math.random() * 20);
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
