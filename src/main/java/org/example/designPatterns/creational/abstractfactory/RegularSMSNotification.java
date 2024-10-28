package org.example.designPatterns.creational.abstractfactory;

public class RegularSMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Regular SMS: " + message);
    }
}

