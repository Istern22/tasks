package com.github.istern22.architecture;

import java.util.ArrayList;
import java.util.Arrays;

public class Grandma implements IPassenger {

    String name;
    ArrayList<Action> doList;

    public Grandma(String name, ArrayList<Action> doList) {
        this.name = name;
        this.doList = doList;
    }

    public Grandma(String name) {
        this(name, null);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Action> getDoList() {
        return doList;
    }

    public void setDoList(ArrayList<Action> doList) {
        this.doList = doList;
    }
}
