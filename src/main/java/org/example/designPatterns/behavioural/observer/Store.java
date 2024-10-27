package org.example.designPatterns.behavioural.observer;

import org.example.designPatterns.behavioural.observer.observable.IphoneStockObservable;
import org.example.designPatterns.behavioural.observer.observable.StockObservable;
import org.example.designPatterns.behavioural.observer.observer.EmailStockNotifier;
import org.example.designPatterns.behavioural.observer.observer.MobileStockNotifier;
import org.example.designPatterns.behavioural.observer.observer.StockNotifier;

public class Store {

    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneStockObservable();

        StockNotifier observer1 = new EmailStockNotifier("xyz@gmail.com", iphoneStockObservable);
        StockNotifier observer2 = new EmailStockNotifier("xyz2@gmail.com", iphoneStockObservable);
        StockNotifier observer3 = new MobileStockNotifier("630", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setData(10);
    }
}
