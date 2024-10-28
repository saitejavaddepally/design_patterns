package org.example.designPatterns.creational.abstractfactory;

public class NotificationFactoryProvider {
    public static NotificationFactory getFactory(String userType) {
        if ("regular".equalsIgnoreCase(userType)) {
            return new RegularUserNotificationFactory();
        } else if ("premium".equalsIgnoreCase(userType)) {
            return new PremiumUserNotificationFactory();
        }
        throw new IllegalArgumentException("Unknown user type: " + userType);
    }
}
