package com.github.istern22.maklaflin.dogdoors;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
    private boolean open;
    private ArrayList<Bark> allowed;

    public DogDoor() {
        allowed = new ArrayList<>();
        this.open = false;
    }

    public ArrayList<Bark> getAllowed() {
        return allowed;
    }

    public void addAllowedBark(Bark bark) {
        allowed.add(bark);
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
