package org.example.designPatterns.behavioural.strategy.vehicle.strategy;

public class PassengerVehicle extends Vehicle{

    PassengerVehicle(DriveStrategy driveStrategy) {
        super(new NormalDriveStrategy());
    }
}
