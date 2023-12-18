package com.example.flourManger.machine;

public class Machine {
    private boolean on;

    public boolean isOn() {
        return on;
    }
    public void on(){
      on = true;
    }

    public void of(){
        on = false;
    }
}
