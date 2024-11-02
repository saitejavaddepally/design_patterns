package org.example.problems.medium.parking.spot;

import org.example.problems.medium.parking.Vehicle;
import org.example.problems.medium.parking.VehicleType;
import org.example.problems.medium.parking.spot.factory.ParkingManagerFactory;
import org.example.problems.medium.parking.spot.manager.ParkingSpotManager;

public class VehiclePark {

    public static void main(String[] args) {

        System.out.println("Enter ticket details");
        Ticket ticket = new Ticket();

        Vehicle vehicle = new Vehicle("1234A", VehicleType.TWO_WHEELER);
        ticket.setVehicle(vehicle);

        ParkingManagerFactory parkingManagerFactory = new ParkingManagerFactory();
        ParkingSpotManager parkingSpotManager = parkingManagerFactory.getParkingSpotManager(VehicleType.TWO_WHEELER);

        parkingSpotManager.findParkingSpace();
    }
}
