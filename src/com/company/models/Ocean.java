package com.company.models;

public class Ocean extends PlanetObject{
    double maxDeep;

    public Ocean(String name, double size, double maxDeep) {
        super(name, size);
        this.maxDeep = maxDeep;
    }

    public Ocean(double maxDeep) {
        this.maxDeep = maxDeep;
    }

    public double getMaxDeep() {
        return maxDeep;
    }

    public void setMaxDeep(double maxDeep) {
        this.maxDeep = maxDeep;
    }

    @Override
    public String toString() {
        return "Ocean{" +
                "maxDeep=" + maxDeep +
                ", name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
