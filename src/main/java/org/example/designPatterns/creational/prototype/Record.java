package org.example.designPatterns.creational.prototype;

public class Record implements Cloneable{
    @Override
    public Record clone() {
        try {
            return (Record) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
