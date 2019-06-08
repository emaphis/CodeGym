package com.codegym.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Reinforce the singleton pattern

*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    // Add static block here
    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        // Implement step #5 here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        if (input.equals(Planet.EARTH)) {
            thePlanet = Earth.getInstance();
        } else if (input.equals(Planet.MOON)) {
            thePlanet = Moon.getInstance();
        } else if (input.equals(Planet.SUN)) {
            thePlanet = Sun.getInstance();
        } else {
            thePlanet = null;
        }
    }
}
