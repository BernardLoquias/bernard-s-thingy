package src.com.myintergalacticproject;

public class Planet extends SolarSystem {   

    private String planetname;

    public Planet(String planetname, boolean revolve){
        super(revolve, "");
        this.planetname = planetname;
    }

    public void attract() {
        System.out.println(planetname + " is revolving " + revolve + "ly ");
    }
}


