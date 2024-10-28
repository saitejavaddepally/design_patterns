package org.example.designPatterns.behavioural.decorator;

public class Main {


    public static void main(String[] args) {

        BasePizza pizza =  new ExtraCheese(new CheeseBurst());
        System.out.println(pizza.cost());
    }
}
