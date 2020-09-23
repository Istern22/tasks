package com.github.istern22.maklaflin.guitar;

import com.github.istern22.maklaflin.guitar.*;

import java.util.Iterator;
import java.util.List;

public class InventoryTest {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 12, Wood.ALDER, Wood.ALDER);
        List matchingGuitar = inventory.search(whatErinLikes);
        if (!matchingGuitar.isEmpty()) {
            System.out.println("Erin, you might like these guitars: ");
            for (Iterator i = matchingGuitar.iterator(); i.hasNext();) {
                Guitar guitar = (Guitar) i.next();
                System.out.println("We have a "
                    + guitar.getSpec().getBuilder() + " " + guitar.getSpec().getModel() + " "
                    + guitar.getSpec().getType() + " guitar:\n "
                    + guitar.getSpec().getBackWood() + " back and sides,\n "
                    + guitar.getSpec().getTopWood() + " top.\nYou can have it for only $"
                    + guitar.getPrice() + "!\n ----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addInstrument("V95693",
                1499.95, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 12, Wood.ALDER, Wood.ALDER));
    }
}