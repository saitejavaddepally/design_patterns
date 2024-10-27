package org.example.problems.medium.Uber.strategies;

import org.example.problems.medium.Uber.TripMetaData;
import org.example.problems.medium.Uber.Util;

public class RatingBasedPricingStrategy implements PriceStrategy{
    @Override
    public double calculatePrice(TripMetaData tripMetaData) {

        double price = Util.isHighRating(tripMetaData.getRiderRating()) ? 55.0 : 100.0;

        return price;
    }
}
