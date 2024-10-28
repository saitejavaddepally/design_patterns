package org.example.designPatterns.creational.abstractfactory;

public class NotificationService {
    public void notifyUser(String userType, String channel, String message) {
        NotificationFactory factory = NotificationFactoryProvider.getFactory(userType);
        Notification notification;

        switch (channel.toLowerCase()) {
            case "email":
                notification = factory.createEmailNotification();
                break;
            case "sms":
                notification = factory.createSMSNotification();
                break;
            case "push":
                notification = factory.createPushNotification();
                break;
            default:
                throw new IllegalArgumentException("Unknown notification channel: " + channel);
        }

        notification.send(message);
    }

    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        // Regular user notifications
        service.notifyUser("regular", "email", "Welcome to our platform!");
        service.notifyUser("regular", "sms", "Your OTP code is 1234");

        // Premium user notifications
        service.notifyUser("premium", "email", "Exclusive deal for you!");
        service.notifyUser("premium", "push", "Loyalty points updated!");
    }
}

