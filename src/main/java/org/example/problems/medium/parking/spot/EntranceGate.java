package org.example.problems.medium.parking.spot;

import org.example.problems.medium.parking.spot.factory.ParkingManagerFactory;
import org.example.problems.medium.parking.spot.manager.ParkingSpotManager;

public class EntranceGate {

    ParkingManagerFactory parkingManagerFactory;
    ParkingSpotManager parkingSpotManager;
    Ticket ticket;

    public ParkingManagerFactory getParkingManagerFactory() {
        return parkingManagerFactory;
    }

    public void setParkingManagerFactory(ParkingManagerFactory parkingManagerFactory) {
        this.parkingManagerFactory = parkingManagerFactory;
    }

    public ParkingSpotManager getParkingSpotManager() {
        return parkingSpotManager;
    }

    public void setParkingSpotManager(ParkingSpotManager parkingSpotManager) {
        this.parkingSpotManager = parkingSpotManager;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
