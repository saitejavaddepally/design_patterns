package org.example.designPatterns.SOLID.srp.designed;

public class Invoice {

    private Marker marker;
    private int quantity;


    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    // first responsibility
    public int calculateTotal() {
        return 100;
    }

}
