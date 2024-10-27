package org.example.designPatterns.behavioural.strategy.vehicle.strategy;

public class SportsDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Sports Drive strategy");
    }
}
