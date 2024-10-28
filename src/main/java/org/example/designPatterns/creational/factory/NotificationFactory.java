package org.example.designPatterns.creational.factory;

public class NotificationFactory {
    public static Notification createNotification(String channel) {
        switch (channel.toLowerCase()) {
            case "email":
                return new EmailNotification();
            case "sms":
                return new SMSNotification();
            case "push":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown notification channel " + channel);
        }
    }
}
