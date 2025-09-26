package src.com.myintergalacticproject;

public class SolarSystem {

    public boolean revolve;
    public String name;

    public SolarSystem(boolean revolve, String name) {
        this.revolve = revolve; 
        this.name = name;

    
    }    
        
    public void getrevolve(){
        System.out.println("The planets in " + name + " revolve around the sun: " + revolve);
    }
}