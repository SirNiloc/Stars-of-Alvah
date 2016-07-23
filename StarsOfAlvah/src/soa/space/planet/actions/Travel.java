package soa.space.planet.actions;

import soa.space.planet.Planet;
import soa.space.ship.Ship;

public class Travel extends PlanetAction {

	public Travel() {
		super("Travel");
	}
	
	public static long getDistance(Ship s, Planet p){
		long x = s.getCoordX() - p.getCoordX();
		long y = s.getCoordY() - p.getCoordY();
		long z = s.getCoordZ() - p.getCoordZ();
		
		return (long) Math.sqrt((x*x)+(y*y)+(z*z));
	}
	
	public static double getCost(Ship s, Planet p){
		long distance = getDistance(s,p);
		//TODO Add fuel stuff
		return distance;
	}
	
	public static void doAction() {
		// TODO Action
	}
		

}
