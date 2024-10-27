package org.example.problems.medium.Uber.managers;

import org.example.problems.medium.Uber.Driver;

import java.util.Map;

public class DriverManager {
    static DriverManager DriverManager = null;
    Map<String, Driver> availableDrivers;

    private DriverManager() {

    }

    public static synchronized DriverManager getDriverManager() {

        if (DriverManager == null){
            DriverManager = new DriverManager();
        }
        return DriverManager;
    }

    public void addRider(Driver driver) {
        availableDrivers.put(driver.getName(), driver);
    }

    public Driver getRider(String name){
        return availableDrivers.get(name);
    }

    public Map<String, Driver> getAvailableDrivers() {
        return availableDrivers;
    }
}
