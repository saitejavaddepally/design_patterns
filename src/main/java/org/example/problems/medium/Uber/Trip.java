package org.example.problems.medium.Uber;

import org.example.problems.medium.Uber.strategies.DrivingMatchingStrategy;
import org.example.problems.medium.Uber.strategies.PriceStrategy;

public class Trip {

    Rider rider;
    Driver driver;
    Integer srcLoc;
    Integer dstLoc;
    String tripStatus;
    Integer tripId = 0;
    double price;
    PriceStrategy priceStrategy;
    DrivingMatchingStrategy drivingMatchingStrategy;

    public Trip(Rider rider, Driver driver, Integer srcLoc, Integer dstLoc, PriceStrategy strategy, DrivingMatchingStrategy drivingMatchingStrategy) {
        this.rider = rider;
        this.driver = driver;
        this.srcLoc = srcLoc;
        this.dstLoc = dstLoc;
        this.tripStatus = "Driver on the way";
        this.tripId = this.tripId + 1;
        this.priceStrategy = strategy;
        this.drivingMatchingStrategy = drivingMatchingStrategy;
    }
}
