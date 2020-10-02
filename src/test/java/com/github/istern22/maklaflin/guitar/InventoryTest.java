package com.github.istern22.maklaflin.guitar;

import com.github.istern22.maklaflin.guitar.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class InventoryTest {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Map properties = new HashMap();
        properties.put("builder", Builder.COLLINGS);
        properties.put("backWood", Wood.SITKA);
        InstrumentSpec clientSpec = new InstrumentSpec(properties);

        List matchingInstruments = inventory.search(clientSpec);
        if (!matchingInstruments.isEmpty()) {
            System.out.println("You might like these instruments: ");
            for (Iterator i = matchingInstruments.iterator(); i.hasNext();) {
                Instrument instrument = (Instrument) i.next();
                InstrumentSpec spec = instrument.getSpec();
                System.out.println("We have a " + spec.getProperty("instrumentType")
                + " with the following properties:");
                for (Iterator j = spec.getProperties().keySet().iterator(); j.hasNext();) {
                    String propertyName = (String) j.next();
                    if (propertyName.equals("instrumentType")) {
                        continue;
                    }
                    System.out.println(" " + propertyName + ":  " + spec.getProperty(propertyName));
                }
                System.out.println("You can have this "
                + spec.getProperty("InstrumentType") + " for $"
                + instrument.getPrice() + "\n---");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        Map properties = new HashMap();
        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put("builder", Builder.COLLINGS);
        properties.put("model", "CJ");
        properties.put("type", Type.ACOUSTIC);
        properties.put("numStrings", 6);
        properties.put("topWood", Wood.INDIAN_ROSEWOOD);
        properties.put("backWood", Wood.SITKA);
        inventory.addInstrument("11277", 3999.95, new InstrumentSpec(properties));
        Map properties1 = new HashMap();
        properties1.put("instrumentType", InstrumentType.GUITAR);
        properties1.put("builder", Builder.MARTIN);
        properties1.put("model", "D-18");
        properties1.put("type", Type.ACOUSTIC);
        properties1.put("numStrings", 6);
        properties1.put("topWood", Wood.ADIRONDACK);
        properties1.put("backWood", Wood.MAHOGANY);
        inventory.addInstrument("122784", 5495.95, new InstrumentSpec(properties1));
        Map properties2 = new HashMap();
        properties2.put("instrumentType", InstrumentType.GUITAR);
        properties2.put("builder", Builder.FENDER);
        properties2.put("model", "Stratocastor");
        properties2.put("type", Type.ACOUSTIC);
        properties2.put("numStrings", 6);
        properties2.put("topWood", Wood.ALDER);
        properties2.put("backWood", Wood.ALDER);
        inventory.addInstrument("V95693", 1499.95, new InstrumentSpec(properties2));
    }
}