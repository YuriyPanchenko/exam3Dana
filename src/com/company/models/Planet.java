package com.company.models;

import java.util.ArrayList;

public class Planet {
    private String name;
    private ArrayList<Island> islands;
    private ArrayList<Ocean> oceans;
    private ArrayList<Mainland> mainlands;

    public Planet(String name, ArrayList<Island> islands, ArrayList<Ocean> oceans, ArrayList<Mainland> mainlands) {
        this.name = name;
        this.islands = islands;
        this.oceans = oceans;
        this.mainlands = mainlands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Island> getIslands() {
        return islands;
    }

    public void setIslands(ArrayList<Island> islands) {
        this.islands = islands;
    }

    public ArrayList<Ocean> getOceans() {
        return oceans;
    }

    public void setOceans(ArrayList<Ocean> oceans) {
        this.oceans = oceans;
    }

    public ArrayList<Mainland> getMainlands() {
        return mainlands;
    }

    public void setMainlands(ArrayList<Mainland> mainlands) {
        this.mainlands = mainlands;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", islands=" + islands +
                ", oceans=" + oceans +
                ", mainlands=" + mainlands +
                '}';
    }

    public void show(){
        System.out.println("Planet : " + name + ";\nmainlands: ");
        for (Mainland mainland:mainlands
             ) {
            System.out.println(mainland.getName());
        }
        System.out.println("number of mainlands: " + mainlands.size());
    }
}
