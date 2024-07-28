package org.example.java8.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(){{
            add(1);
            add(1);
            add(1);
            add(1);
        }};


        method(list);
    }


    public static void method(List<?> t){
        System.out.println(t);
    }

}
