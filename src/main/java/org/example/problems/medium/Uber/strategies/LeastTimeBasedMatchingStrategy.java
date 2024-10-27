package org.example.problems.medium.Uber.strategies;

import org.example.problems.medium.Uber.Driver;
import org.example.problems.medium.Uber.TripMetaData;
import org.example.problems.medium.Uber.managers.DriverManager;

import java.util.Map;

public class LeastTimeBasedMatchingStrategy implements DrivingMatchingStrategy{

    @Override
    public Driver matchDriver(TripMetaData tripMetaData) {
        DriverManager driverManager = DriverManager.getDriverManager();
        Map<String, Driver> drivers = driverManager.getAvailableDrivers();

        System.out.println("Using quadtree to see nearest cabs, using driver manager to get details of drivers and send notifications");

        for (String name : drivers.keySet()){
            System.out.println("Found a driver : " + name + " for rider : ");
            return drivers.get(name);
        }

        return null;
    }

}
