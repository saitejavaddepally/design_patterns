package org.example.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StringTest {

    public static void main(String[] args) {

        String test = "hello";
        StringFactory factory = String::toUpperCase;
        System.out.println(factory.hello("HELLooo"));

        List<String> names = Arrays.asList("John", "Mary", "Jane");
        names.sort(String::compareTo);

        Predicate<String> isEmpty = String::isEmpty;

        Optional<String> name = Optional.of("Test");
        Stream<String> testStream = Stream.of("Hello");


    }
}

interface StringFactory {
    String hello(String s);
}