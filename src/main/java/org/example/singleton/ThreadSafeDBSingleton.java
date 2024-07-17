package org.example.singleton;

public class ThreadSafeDBSingleton {

    private static class LazyInstance{
        private static ThreadSafeDBSingleton INSTANCE = new ThreadSafeDBSingleton();
    }

    private ThreadSafeDBSingleton(){

    }


    public static ThreadSafeDBSingleton getInstance(){
        return LazyInstance.INSTANCE;
    }



}
