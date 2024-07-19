package org.example.prototype;

import org.example.prototype.patternExample.Movie;
import org.example.prototype.patternExample.Registry;

import java.util.ArrayList;
import java.util.List;

public class PrototypeExample {


    public static void main(String[] args) {

        Registry registry = new Registry();

        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational Patterns in java");

        System.out.println(movie);

    }

}