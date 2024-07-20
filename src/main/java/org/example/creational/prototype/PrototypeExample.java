package org.example.creational.prototype;

import org.example.creational.prototype.patternExample.Movie;
import org.example.creational.prototype.patternExample.Registry;

public class PrototypeExample {


    public static void main(String[] args) {

        Registry registry = new Registry();

        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational Patterns in java");

        System.out.println(movie);

    }

}