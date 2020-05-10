package com.company.models;

import java.util.ArrayList;

public class Mainland extends Land{
    private ArrayList<String> tectonicPlates;

    public Mainland(String name, double size, double maxHeight, ArrayList<String> tectonicPlates) {
        super(name, size, maxHeight);
        this.tectonicPlates = tectonicPlates;
    }

    public Mainland(double maxHeight, ArrayList<String> tectonicPlates) {
        super(maxHeight);
        this.tectonicPlates = tectonicPlates;
    }

    public ArrayList<String> getTectonicPlates() {
        return tectonicPlates;
    }

    public void setTectonicPlates(ArrayList<String> tectonicPlates) {
        this.tectonicPlates = tectonicPlates;
    }

    @Override
    public String toString() {
        return "Mainland{" +
                "tectonicPlates=" + tectonicPlates +
                ", name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
