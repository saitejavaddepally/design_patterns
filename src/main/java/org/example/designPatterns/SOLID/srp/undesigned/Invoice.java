package org.example.designPatterns.SOLID.srp.undesigned;

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

    // second responsibility
    public void printInvoice(){

    }

    // third responsibility
    public void saveToDb(){

    }

    public void setMarker(Marker marker) {
        this.marker = marker;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
