package org.example.designPatterns.behavioural.template;

public class WebOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
        System.out.println("In checkout");
    }

    @Override
    public void doPayment() {
        System.out.println("process payment without card present");

    }

    @Override
    public void doReceipt() {
        System.out.println("In receipt");
    }

    @Override
    public void doDelivery() {
        System.out.println("In delivery");
    }
}
