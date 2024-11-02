package org.example.problems.medium.parking.spot.manager;

import org.example.problems.medium.parking.spot.ParkingSpot;
import org.example.problems.medium.parking.spot.strategy.parking.NearToElevatorParkingStrategy;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerManager extends ParkingSpotManager{

    List<ParkingSpot> parkingSpots ;

    public TwoWheelerManager() {
        super(new ArrayList<>(60), new NearToElevatorParkingStrategy());
    }

    public void findParkingSpace(){

    }
}
