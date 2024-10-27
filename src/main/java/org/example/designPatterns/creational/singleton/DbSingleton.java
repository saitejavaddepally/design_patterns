package org.example.designPatterns.creational.singleton;

public class DbSingleton {

    private static DbSingleton dbSingleton = new DbSingleton();

    private DbSingleton(){}

    public static DbSingleton getInstance(){
        return dbSingleton;
    }
}
