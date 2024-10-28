package org.example.designPatterns.creational.factory;

public class NotificationService {
    public void notifyUser(String channel, String message) {
        Notification notification = NotificationFactory.createNotification(channel);
        notification.send(message);
    }

    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.notifyUser("email", "Your order has been shipped!");
        service.notifyUser("sms", "Your OTP code is 123456");
        service.notifyUser("push", "New promotion available!");
    }
}
