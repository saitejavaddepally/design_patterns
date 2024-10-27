package org.example.problems.medium.Uber.strategies;

import org.example.problems.medium.Uber.TripMetaData;

public interface PriceStrategy {
    double calculatePrice(TripMetaData tripMetaData);
}
