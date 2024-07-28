package org.example.java8.generics;

public class Printer<T extends ExClass> {

    T number;

    Printer(T number){
        this.number = number;
    }

    public void print(){
        System.out.println(number);
    }
}
