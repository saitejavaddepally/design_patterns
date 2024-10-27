package org.example.problems.medium.Uber.managers;

import org.example.problems.medium.Uber.TripMetaData;
import org.example.problems.medium.Uber.strategies.DefaultPricingStrategy;
import org.example.problems.medium.Uber.strategies.DrivingMatchingStrategy;
import org.example.problems.medium.Uber.strategies.LeastTimeBasedMatchingStrategy;
import org.example.problems.medium.Uber.strategies.PriceStrategy;

public class StrategyManager {


   static   StrategyManager strategyManager = null;

    private StrategyManager(){

    }


    public static StrategyManager getStrategyManager(){

        if (strategyManager == null){
            strategyManager = new StrategyManager();
        }

        return strategyManager;
    }

    public PriceStrategy determinePricingStrategy(TripMetaData tripMetaData){
        // todo: to implement
        return new DefaultPricingStrategy();
    }


    public DrivingMatchingStrategy determineDriverMatchingStrategy(TripMetaData tripMetaData){
        // todo: to implement
        return new LeastTimeBasedMatchingStrategy();
    }
}
