package org.example.java8.lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
        }};

        System.out.println(list);

        Set<String> set = list.stream().filter(integer -> integer > 2).map(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return 4 * integer + "";
            }
        }).collect(Collectors.toSet());
    }
}
