package com.github.istern22.architecture;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static  org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CarTest {
    @Test
    public void whenCarWithMotherDriver() {
        Car car0 = new Car("lada", new Mother("mama0"));
        Car car1 = new Car("lada", new Father("papa0"),
                new ArrayList<IPassenger>(List.of(
                        new Child("child0"),
                        new Child("child1"),
                        new Grandma("baba0")))
        );
        Car car2 = new Car("lada",
                new Father("papa1"),
                new ArrayList<IPassenger>(List.of(
                        new Child("child0"),
                        new Child("child1"),
                        new Grandma("baba0"))),
                2);
    }

}
