package src.com.myintergalacticproject;

import java.util.Random; 

public class SolarSystem {

    public boolean revolve;
    public String name;
    private int numPlanets; 

    // Constructor that initializes a new Solar System object with the user specified values 
    public SolarSystem(boolean revolve, String name) {
        this.revolve = revolve; 
        this.name = name;
        this.numPlanets = new Random().nextInt(8) + 1;

    
    }    
        
    public void getrevolve(){
        System.out.println("The planets in " + name + " revolve around the sun: " + revolve);
    }

    public int getNumPlanets() {
        return numPlanets;

    }

    public double calculateOrbitalSpeed(double distanceFromSun) {
        double speed = Math.sqrt(1000000 / distanceFromSun);
        return Math.round(speed * 100.0) / 100.0;

    }

}