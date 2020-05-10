package com.company.models;

import java.util.ArrayList;

public class Land extends PlanetObject{
    private double maxHeight;

    public Land(String name, double size, double maxHeight) {
        super(name, size);
        this.maxHeight = maxHeight;
    }

    public Land(double maxHeight, ArrayList<String> countries) {
        this.maxHeight = maxHeight;
    }

    public Land(double maxHeight) {
        this.maxHeight = maxHeight;
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(double maxHeight) {
        this.maxHeight = maxHeight;
    }

    @Override
    public String toString() {
        return "Land{" +
                "maxHeight=" + maxHeight +
                ", name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
