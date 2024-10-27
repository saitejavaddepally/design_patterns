package org.example.designPatterns.behavioural.strategy.vehicle.strategy;

public class SportsVehicle extends Vehicle {

    SportsVehicle(DriveStrategy driveStrategy) {
        super(new SportsDriveStrategy());
    }
}
