package org.example.designPatterns.SOLID.isp.designed;

public class Waiter implements WaiterInterface{
    @Override
    public void serveCustomers() {
        System.out.println("serving the customers");
    }

    @Override
    public void takeOrder() {
        System.out.println("taking orders");
    }
}
