package org.example.problems.medium.Uber;

import org.example.problems.medium.Uber.managers.StrategyManager;
import org.example.problems.medium.Uber.strategies.DrivingMatchingStrategy;
import org.example.problems.medium.Uber.strategies.PriceStrategy;

public class TripManager {

    TripManager tripManager = null;

    public TripManager getTripManager() {

        if (tripManager == null){
            tripManager = new TripManager();
        }

        return tripManager;
    }


    public void createTrip(Driver driver, int sourceLoc, int destLoc){

        TripMetaData tripMetaData = new TripMetaData(null, driver.getRating(), sourceLoc, destLoc);

        StrategyManager strategyManager = StrategyManager.getStrategyManager();

        PriceStrategy strategy = strategyManager.determinePricingStrategy(tripMetaData);
        DrivingMatchingStrategy drivingMatchingStrategy = strategyManager.determineDriverMatchingStrategy(tripMetaData);

        Driver driver1 = drivingMatchingStrategy.matchDriver(tripMetaData);

        Trip trip = new Trip(null, driver, sourceLoc, destLoc,  strategy, drivingMatchingStrategy );
    }

}
