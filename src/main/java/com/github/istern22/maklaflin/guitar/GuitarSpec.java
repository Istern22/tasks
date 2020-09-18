package com.github.istern22.maklaflin.guitar;

public class GuitarSpec {

    private String model;
    private Builder builder;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type,
                      Wood backWood, Wood topWood, int numStrings) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numStrings = numStrings;
    }
    public Builder getBuilder() {
        return builder;
    }
    public String getModel() {
        return model;
    }
    public Type getType() {
        return type;
    }
    public Wood getBackWood() {
        return backWood;
    }
    public Wood getTopWood() {
        return topWood;
    }
    public int getNumStrings() {
        return numStrings;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numStrings;
        result = prime * result + numStrings;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        GuitarSpec spec = (GuitarSpec) obj;
        return builder == spec.builder && model == spec.model && type == spec.type
                && backWood == spec.backWood && topWood == spec.topWood && numStrings == spec.numStrings;
    }
}
