package org.example.problems.medium.Uber.strategies;

import org.example.problems.medium.Uber.TripMetaData;

public class DefaultPricingStrategy implements PriceStrategy{
    @Override
    public double calculatePrice(TripMetaData tripMetaData) {
        return 100.0;
    }
}
