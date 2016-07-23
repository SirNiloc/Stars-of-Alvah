package soa.space.planet.actions;

import soa.space.planet.Planet;
import soa.space.ship.Ship;

public class PlanetAction {

	String name = "No Action";
	String info = "No Action";
	//TODO Add Characteristics
		
	public PlanetAction(String n){
		name = n;
	}
	
	public String getName(){
		return name;
	}

	public static void doAction(Ship s, Planet p) {
		// TODO Action
	}
	

}
