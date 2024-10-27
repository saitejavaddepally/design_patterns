package org.example.designPatterns.structural.behavioural.template;

public class ProcessOrder {

    public static void main(String[] args) {

        OrderTemplate template = new WebOrder();

        template.processOrder();

    }
}
