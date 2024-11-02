package org.example.problems.medium.parking.spot.factory;

import org.example.problems.medium.parking.VehicleType;
import org.example.problems.medium.parking.spot.manager.FourWheelerManager;
import org.example.problems.medium.parking.spot.manager.ParkingSpotManager;
import org.example.problems.medium.parking.spot.manager.TwoWheelerManager;

public class ParkingManagerFactory {

    public ParkingSpotManager getParkingSpotManager(VehicleType vehicleType){

        if (VehicleType.TWO_WHEELER.equals(vehicleType)){
            return new FourWheelerManager();
        }
        return new TwoWheelerManager();
    }
}
