package org.example.designPatterns.behavioural.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BikeRepository implements Iterable<String>{

    private List<String> bikes;
    private int index;

    public BikeRepository(){
        bikes = new ArrayList<>();
        index = 0;
    }

    public void addBike(String bike){
        bikes.add(bike);
        index += 1;
    }


    @Override
    public Iterator<String> iterator() {

        return new Iterator<String>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < 10;
            }

            @Override
            public String next() {
                return bikes.get(currentIndex++);
            }
        };
    }
}
