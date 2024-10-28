package org.example.designPatterns.creational.abstractfactory;

public interface NotificationFactory {
    Notification createEmailNotification();
    Notification createSMSNotification();
    Notification createPushNotification();
}
