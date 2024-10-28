package org.example.designPatterns.creational.abstractfactory;

public class RegularPushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Regular Push Notification: " + message);
    }
}