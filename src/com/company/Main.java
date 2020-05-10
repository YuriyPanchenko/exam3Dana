package com.company;

import com.company.models.Island;
import com.company.models.Mainland;
import com.company.models.Ocean;
import com.company.models.Planet;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> tectonicPlates = new ArrayList<>();
        tectonicPlates.add("1");

        ArrayList<Mainland> mainlands = new ArrayList<>();
        mainlands.add(new Mainland("Asia", 2000000, 8809, tectonicPlates));
        mainlands.add(new Mainland("Europe", 10000, 2345, tectonicPlates));
        mainlands.add(new Mainland("Antarctica", 13000, 1234, tectonicPlates));
        mainlands.add(new Mainland("Sous America", 233445, 4444, tectonicPlates));
        mainlands.add(new Mainland("North America", 4321333, 5555, tectonicPlates));
        mainlands.add(new Mainland("Australia", 2332234, 5000, tectonicPlates));

        ArrayList<Island> islands = new ArrayList<>();
        islands.add(new Island("Greenland", 2500, 233));
        islands.add(new Island("Madagascar", 1500, 433));


        ArrayList<Ocean> oceans = new ArrayList<>();
        oceans.add(new Ocean("Atlantic", 200000, 11000));

        Planet earth = new Planet("Earth", islands, oceans, mainlands);
        earth.show();
    }
}
