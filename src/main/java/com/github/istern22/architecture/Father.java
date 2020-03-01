package com.github.istern22.architecture;

import java.util.ArrayList;

public class Father extends Mother {
    public Father(String name) {
        super(name);
    }

    public Father(String name, ArrayList<Action> doList) {
        this(name);
        this.doList = doList;
    }
}
