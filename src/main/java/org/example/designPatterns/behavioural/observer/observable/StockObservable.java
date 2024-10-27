package org.example.designPatterns.behavioural.observer.observable;

import org.example.designPatterns.behavioural.observer.observer.StockNotifier;

public interface StockObservable {
    void add(StockNotifier stockNotifier);
    void remove(StockNotifier stockNotifier);
    void notifyMsg();
    void setData(int stocks);
}
