package src.com.myintergalacticproject;

public class Main {
 
    public static void main(String[] args) {

        SolarSystem newSystem = new SolarSystem(true, "THE Solar System");
        newSystem.getrevolve();

        Planet newPlanet = new Planet("Earth");
        newPlanet.attract(); }

    }

        

