package org.example.designPatterns.behavioural.strategy.vehicle.strategy;

public class NormalDriveStrategy implements DriveStrategy{


    @Override
    public void drive() {
        System.out.println("Normal Drive strategy");
    }
}
