package com.github.istern22.architecture;

import java.util.ArrayList;
import java.util.Arrays;

public class Child extends Grandma {

    public Child(String name, ArrayList<Action> doList) {
        super(name, doList);
    }

    public Child(String name) {
        this(name, new ArrayList<Action>(Arrays.asList(new WashCar())));
    }
}
