package org.example.designPatterns.creational.abstractfactory;

public class PremiumPushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Premium Push Notification with Special Offer: " + message);
    }
}
