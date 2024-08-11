package org.example.behavioural.command;

//receiver

public class Light {

    private boolean isOn = false;

    public boolean isOn(){
        return isOn;
    }

    public void toggle() {

        if (isOn){
            off();
        }
        else
            on();

        this.isOn = !isOn;
    }

    public void on(){
        System.out.println("Light is on");
    }

    public void off(){
        System.out.println("Light is off");
    }
}
