package com.github.istern22.maklaflin.gsf.board;

import com.github.istern22.maklaflin.gsf.unit.Unit;

import java.util.LinkedList;
import java.util.List;

public class Tile {
    private List units;

    public Tile() {
        units = new LinkedList();
    }

    protected void addUnit(Unit unit) {
        units.add(unit);
    }

    protected void removeUnit(Unit unit) {
        units.remove(unit);
    }
}
