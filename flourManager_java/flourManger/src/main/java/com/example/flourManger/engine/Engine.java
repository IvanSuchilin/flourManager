package com.example.flourManger.engine;

public class Engine extends Thread {
    protected int power = 0;

    public void upPower(int upPower){
        power += upPower;
    }

    public void downPower(int downPower){
        power -= downPower;
        if (power < 0){
            power = 0;
        }
    }


    public int getPower() {
        return power;
    }
}
