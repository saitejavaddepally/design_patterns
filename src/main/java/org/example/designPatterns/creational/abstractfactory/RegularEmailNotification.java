package org.example.designPatterns.creational.abstractfactory;

public class RegularEmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Regular Email: " + message);
    }
}
