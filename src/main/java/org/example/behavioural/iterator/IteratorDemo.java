package org.example.behavioural.iterator;

import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {

        BikeRepository bikeRepository = new BikeRepository();

        bikeRepository.addBike("bike 1");
        bikeRepository.addBike("bike 2");
        bikeRepository.addBike("bike 3");
        bikeRepository.addBike("bike 4");
        bikeRepository.addBike("bike 5");
        bikeRepository.addBike("bike 6");
        bikeRepository.addBike("bike 7");
        bikeRepository.addBike("bike 8");
        bikeRepository.addBike("bike 9");
        bikeRepository.addBike("bike 10");
        bikeRepository.addBike("bike 11");
        bikeRepository.addBike("bike 12");

        for (String s : bikeRepository) {
            System.out.println(s);
        }


    }
}
