package org.example.designPatterns.creational.abstractfactory;

public class PremiumUserNotificationFactory implements NotificationFactory {

    @Override
    public Notification createEmailNotification() {
        return new PremiumEmailNotification();
    }

    @Override
    public Notification createSMSNotification() {
        return new PremiumSMSNotification();
    }

    @Override
    public Notification createPushNotification() {
        return new PremiumPushNotification();
    }

}
