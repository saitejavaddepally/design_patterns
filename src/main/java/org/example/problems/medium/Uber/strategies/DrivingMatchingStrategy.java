package org.example.problems.medium.Uber.strategies;

import org.example.problems.medium.Uber.Driver;
import org.example.problems.medium.Uber.TripMetaData;

public interface DrivingMatchingStrategy {
    Driver matchDriver(TripMetaData tripMetaData);
}
