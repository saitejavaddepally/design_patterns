package org.example.structural.decorator;

public class TestSandwichDecorator {

    public static void main(String[] args) {

        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
        System.out.println(sandwich.make());
    }
}
