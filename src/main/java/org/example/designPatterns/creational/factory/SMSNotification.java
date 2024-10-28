package org.example.designPatterns.creational.factory;

public class SMSNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
