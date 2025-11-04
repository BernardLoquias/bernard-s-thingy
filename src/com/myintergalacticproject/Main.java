package src.com.myintergalacticproject;

import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) {

        // scanner object to read input 
        Scanner sc = new Scanner(System.in); 

        // Asks for the name of the solar system 
        System.out.println("Welcome to the Intergalactic System Creator!");
        System.out.print("Enter the name of your solar system: ");
        String systemName = sc.nextLine();

        // Sees of the planet revolves around the sun 
        System.out.println("Do Planets in your solar system revolve around the sun? (true/false): ");
        boolean revolve = sc.nextBoolean(); 
        sc.nextLine(); 

        // Creates a Solar System object 
        SolarSystem newSystem = new SolarSystem(revolve, systemName);
        newSystem.getrevolve();
        System.out.println("Your solar system has approximately " + newSystem.getNumPlanets() + " planets.\n"); 


        System.out.println("Enter the name of a planet in your solar system: "); 
        String planetName = sc.nextLine();  

        // Creates a new planet object with the provided name and revolve status
        Planet newPlanet = new Planet(planetName, revolve);
        newPlanet.attract(); 
        newPlanet.showPlanetInfo(); 

        sc.close(); 
    

    }
}
        

