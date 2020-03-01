package com.github.istern22.architecture;

import java.util.ArrayList;

public class Car {
    String model;
    IDriver driver;
    ArrayList<IPassenger> passengers;
    int capacity = 3;

    Car(String model, IDriver driver, ArrayList<IPassenger> passengers, int capacity) {
        this.model = model;
        this.driver = driver;
        this.passengers = passengers;
        this.capacity = capacity;
    }

    Car(String model, IDriver driver, ArrayList<IPassenger> passengers) {
       this(model, driver, passengers, 3);
    }

    Car(String model, IDriver driver) {
        this(model, driver, null);
    }

    public String getModel() {
        return model;
    }

    public IDriver getDriver() {
        return driver;
    }

    public void setDriver(IDriver driver) {
        this.driver = driver;
    }

    public ArrayList<IPassenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<IPassenger> passengers) {
        this.passengers = passengers;
    }
    public void go() throws Exception {
        if (driver == null) {
            throw new Exception("no driver(((");
        }
        if (passengers != null && passengers.size() > capacity) {
            throw new Exception("no places");
        }
    }
}
