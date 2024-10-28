package org.example.designPatterns.creational.abstractfactory;

public class RegularUserNotificationFactory implements NotificationFactory {
    @Override
    public Notification createEmailNotification() {
        return new RegularEmailNotification();
    }

    @Override
    public Notification createSMSNotification() {
        return new RegularSMSNotification();
    }

    @Override
    public Notification createPushNotification() {
        return new RegularPushNotification();
    }
}
