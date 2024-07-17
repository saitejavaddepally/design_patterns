package org.example.singleton;

public class DbSingletonDemo {

    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();

        System.out.println( instance);

        ThreadSafeDBSingleton instance2 = ThreadSafeDBSingleton.getInstance();
        System.out.println(instance2);

    }
}
