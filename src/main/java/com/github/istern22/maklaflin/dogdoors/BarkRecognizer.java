package com.github.istern22.maklaflin.dogdoors;

public class BarkRecognizer {
    private DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(String bark) {
        System.out.println("BarkRecognizer: Heard '" + bark + "'");
        door.open();
    }
}
