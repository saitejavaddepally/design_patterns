package org.example.designPatterns.behavioural.observer.observer;

import org.example.designPatterns.behavioural.observer.observable.StockObservable;

public class MobileStockNotifier implements StockNotifier{

    String emailId;
    StockObservable observable;

    public MobileStockNotifier(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId, "product available for stock ");
    }

    private void sendMail(String emailId, String productAvailableForStock) {
        System.out.println("phone msg sent to " + emailId);
    }
}
