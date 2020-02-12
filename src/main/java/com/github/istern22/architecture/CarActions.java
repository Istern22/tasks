package com.github.istern22.architecture;

public interface CarActions {

    public void drive(Car car);

    public void wash(Car car);

    public void repair(Car car);

    public void driveTo(Car car, Place place);

    public void driveTo(Car car, Place place, Family family);
}
