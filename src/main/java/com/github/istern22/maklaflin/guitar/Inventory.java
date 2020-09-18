package com.github.istern22.maklaflin.guitar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List guitars;

    public Inventory() {
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec guitarSpec) {
         Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
            guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    /**
     * Серийный номер игнорируется, так как он уникален.
     * Цена игнорируется, так как она уникальна.
     * @param searchSpec
     * @return
     */
    public List search(GuitarSpec searchSpec) {

        List matchingGuitars = new LinkedList();

        for (Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            GuitarSpec guitarSpec = guitar.getGuitarSpec();
            if (guitarSpec.equals(searchSpec)) {
                matchingGuitars.add(guitar);
            }
        }
        return matchingGuitars;
    }
}
