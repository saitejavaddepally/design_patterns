package org.example.designPatterns.structural.behavioural.command.runnable;

public class Main {

    public static void main(String[] args) {

        Task t1 = new Task(10, 12);
        Task t2 = new Task(11, 13);

        Thread thread1 = new Thread(t1);
        thread1.start();

        Thread thread2 = new Thread(t2);
        thread2.start();


    }
}
