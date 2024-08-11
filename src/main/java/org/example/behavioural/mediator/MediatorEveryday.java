package org.example.behavioural.mediator;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class MediatorEveryday {

    private final Timer timer;

    public MediatorEveryday(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
        timer.schedule(new RemindTaskWithoutBeep(), seconds * 2 * 1000);
    }

    class RemindTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("Time's up");
        }
    }

    class RemindTaskWithoutBeep extends TimerTask{

        @Override
        public void run() {
            System.out.println("Time's really up");
        }
    }

    public static void main(String[] args) {
        System.out.println("About to schedule task");
        new MediatorEveryday(3);
        System.out.println("Task scheduled");
    }

}
