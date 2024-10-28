package org.example.designPatterns.creational.abstractfactory;


public class PremiumSMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Premium SMS with Loyalty Points: " + message);
    }
}
