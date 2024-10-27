package org.example.designPatterns.SOLID.lsp.undesigned;

public class MotorCycle implements Bike{

    boolean isEngineOn;
    int speed;


    // functionality improved good
    public void turnOnEngine() {
        isEngineOn = true;
    }

    // functionality improved good
    @Override
    public void accelerate() {
        speed += 10;
    }
}
