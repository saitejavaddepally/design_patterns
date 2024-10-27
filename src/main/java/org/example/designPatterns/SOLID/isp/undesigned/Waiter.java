package org.example.designPatterns.SOLID.isp.undesigned;

public class Waiter implements RestaurantEmployee{
    @Override
    public void washDishes() {
        // not waiter job
    }

    @Override
    public void serveCustomers() {
        // yes and here is my implementation
        System.out.println("serving the customer");
    }

    @Override
    public void cookFood() {
        // not waiter job
    }
}
