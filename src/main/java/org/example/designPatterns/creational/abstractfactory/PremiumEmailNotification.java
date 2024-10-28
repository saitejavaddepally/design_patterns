package org.example.designPatterns.creational.abstractfactory;


public class PremiumEmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Premium Email with Exclusive Content: " + message);
    }
}
