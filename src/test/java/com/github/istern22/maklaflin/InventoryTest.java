package com.github.istern22.maklaflin;

import java.util.Iterator;
import java.util.List;

public class InventoryTest {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        List matchingGuitar = inventory.search(whatErinLikes);
        if (!matchingGuitar.isEmpty()) {
            System.out.println("Erin, you might like these guitars: ");
            for (Iterator i = matchingGuitar.iterator(); i.hasNext();) {
                Guitar guitar = (Guitar) i.next();
                System.out.println("We have a "
                    + guitar.getBuilder() + " " + guitar.getModel() + " "
                    + guitar.getType() + " guitar:\n "
                    + guitar.getBackWood() + " back and sides,\n "
                    + guitar.getTopWood() + " top.\nYou can have it for only $"
                    + guitar.getPrice() + "!\n ----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("V95693",
                1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
    }
}