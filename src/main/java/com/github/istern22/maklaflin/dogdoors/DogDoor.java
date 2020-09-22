package com.github.istern22.maklaflin.dogdoors;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
    private boolean open;
    private Bark allowed;

    public DogDoor() {
        this.open = false;
    }

    public Bark getAllowed() {
        return allowed;
    }

    public void setAllowed(Bark allowed) {
        this.allowed = allowed;
    }

    public void open() {
        System.out.println("The dog door opens.");
        open = true;

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public void close() {
        System.out.println("The dog door closes.");
        open = false;
    }

    public boolean isOpen() {
        return open;
    }
}
