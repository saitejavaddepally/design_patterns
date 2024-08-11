package org.example.java8.lambda;

public class MathUtils {
    public static int add(int a, int b){
        System.out.println("Let's say I am writing something");

        a = a * a;
        return a + b;
    }

    public int sumSquare(int a, int b){
        return a*a + b*b;
    }
}
