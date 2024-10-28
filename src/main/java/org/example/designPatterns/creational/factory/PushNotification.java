package org.example.designPatterns.creational.factory;

public class PushNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}
