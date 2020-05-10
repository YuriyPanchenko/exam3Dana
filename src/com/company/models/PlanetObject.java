package com.company.models;

public class PlanetObject {
    String name;
    double size;

    public PlanetObject(String name, double size) {
        this.name = name;
        this.size = size;
    }

    public PlanetObject() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "PlanetObject{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
