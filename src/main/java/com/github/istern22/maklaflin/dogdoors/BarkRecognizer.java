package com.github.istern22.maklaflin.dogdoors;

public class BarkRecognizer {
    private DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(Bark bark) {
        System.out.println("BarkRecognizer: Heard '" + bark.getSound() + "'");
        if (door.getAllowed().contains(bark)) {
            door.open();
        } else {
            System.out.println("This dog is not allowed.");
        }
    }
}
