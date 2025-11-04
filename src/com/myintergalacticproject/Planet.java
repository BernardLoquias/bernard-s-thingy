package src.com.myintergalacticproject;

import java.util.Random;

public class Planet extends SolarSystem {   

    private String planetname;
    private double distanceFromSun; 

    public Planet(String planetname, boolean revolve){
        super(revolve, "");
        this.planetname = planetname;
        this.distanceFromSun = new Random().nextDouble() * 500 + 50;
    } // randomely generates a distance from the sun between 50 and 550 million km

    public void attract() {
        System.out.println(planetname + " is revolving " + revolve + "ly ");
    }

    public void showPlanetInfo() {
        System.out.println("Planet: " + planetname); 
        System.out.println("Part of the Solar System with " + getNumPlanets() + " planets."); 
        System.out.println("Distance from the Sun: " + Math.round(distanceFromSun * 100.0) / 100.0 + "million km."); 
        System.out.println("Approximate orbital speed: " + calculateOrbitalSpeed(distanceFromSun) + "kms/s");  
    }
}


