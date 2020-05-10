package com.company.models;

import java.util.ArrayList;

public class Island extends Land{


    public Island(String name, double size, double maxHeight) {
        super(name, size, maxHeight);
    }

    public Island(double maxHeight, ArrayList<String> countries) {
        super(maxHeight, countries);
    }

    public Island(double maxHeight) {
        super(maxHeight);
    }

    @Override
    public String toString() {
        return "Island{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
