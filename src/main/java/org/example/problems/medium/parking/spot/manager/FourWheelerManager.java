package org.example.problems.medium.parking.spot.manager;

import org.example.problems.medium.parking.spot.ParkingSpot;
import org.example.problems.medium.parking.spot.strategy.parking.NearToElevatorParkingStrategy;

import java.util.ArrayList;
import java.util.List;

public class FourWheelerManager extends ParkingSpotManager{

    List<ParkingSpot> parkingSpotList;

    public FourWheelerManager() {
        super(new ArrayList<>(40), new NearToElevatorParkingStrategy());
    }

    public void findParkingSpace(){

    }
}
