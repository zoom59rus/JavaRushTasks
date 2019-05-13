package com.javarush.task.task15.task1522;

/*
Закрепляем паттерн Singleton
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
        public static void readKeyFromConsoleAndInitPlanet(){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                String planet = reader.readLine();
                if (planet.equals("sun"))
                    thePlanet = Sun.getInstance();
                else if (planet.equals("moon"))
                    thePlanet = Moon.getInstance();
                else if (planet.equals("Earth"))
                    thePlanet = Earth.getInstance();
                else thePlanet = null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    public static void main(String[] args) {
    }

    public static Planet thePlanet;
}