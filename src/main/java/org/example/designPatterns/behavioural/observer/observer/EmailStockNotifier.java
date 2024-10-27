package org.example.designPatterns.behavioural.observer.observer;

import org.example.designPatterns.behavioural.observer.observable.StockObservable;

public class EmailStockNotifier implements StockNotifier{

    String emailId;
    StockObservable stockObservable;

    public EmailStockNotifier(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMail(emailId, "product is in stock");
    }

    private void sendMail(String emailId, String productIsInStock) {
        System.out.println("sending email to " + emailId);
    }
}
