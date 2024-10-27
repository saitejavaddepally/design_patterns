package org.example.problems.medium.Uber.managers;

import org.example.problems.medium.Uber.Rider;

import java.util.Map;

public class RiderManager {
    RiderManager riderManager = null;
    Map<String, Rider> availableDrivers;

    private RiderManager() {

    }

    public synchronized RiderManager getRiderManager() {

        if (riderManager == null){
            riderManager = new RiderManager();
        }
        return riderManager;
    }


    public void addRider(Rider rider) {
        availableDrivers.put(rider.getName(), rider);
    }

    public Rider getRider(String name){
        return availableDrivers.get(name);
    }

}
