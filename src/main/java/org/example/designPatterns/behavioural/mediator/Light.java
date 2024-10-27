package org.example.designPatterns.behavioural.mediator;

public class Light {

    private boolean isOn;

    private String location = "";

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
