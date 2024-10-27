package org.example.designPatterns.behavioural.observer.observable;

import org.example.designPatterns.behavioural.observer.observer.StockNotifier;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable{

    List<StockNotifier> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(StockNotifier stockObserver) {
        observerList.add(stockObserver);
    }

    @Override
    public void remove(StockNotifier stockNotifier) {
        observerList.remove(stockNotifier);
    }

    @Override
    public void notifyMsg() {
        for(StockNotifier observer : observerList){
            observer.update();
        }
    }

    @Override
    public void setData(int newStockAdded) {
        if (stockCount == 0){
            notifyMsg();
        }

        stockCount += newStockAdded;
    }

}
