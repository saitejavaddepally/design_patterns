package org.example.problems.medium.parking.spot.manager;

import org.example.problems.medium.parking.spot.ParkingSpot;
import org.example.problems.medium.parking.spot.strategy.parking.ParkingStrategy;

import java.util.List;

public class ParkingSpotManager {

    List<ParkingSpot> parkingSpots;
    ParkingStrategy parkingStrategy;

    public ParkingSpotManager(List<ParkingSpot> parkingSpots, ParkingStrategy parkingStrategy) {
        this.parkingSpots = parkingSpots;
        this.parkingStrategy = parkingStrategy;
    }

    public void addParkingSpace(){

    }

    public void removeParkingSpace(){

    }

    public void parkVehicle(){

    }

    public void removeVehicle(){

    }

    public void findParkingSpace(){

    }
}
