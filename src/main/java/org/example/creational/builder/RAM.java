package org.example.creational.builder;

public enum RAM {
    DEFAULT (1024), UPGRADED (2048), MAX(4096);

    private int size;

    RAM(int size){
        this.size = size;
    }
}
