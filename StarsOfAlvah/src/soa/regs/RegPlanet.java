package soa.regs;

import java.util.ArrayList;

import soa.space.planet.Planet;

public class RegPlanet {

	private static ArrayList<Planet> planets = new ArrayList<Planet>();

	public ArrayList<Planet> getPlanets(){
		return planets;
	}
	
	public static void registerPlanet(Planet r){
		if(planets.contains(r));
		else planets.add(r);
	}
}
