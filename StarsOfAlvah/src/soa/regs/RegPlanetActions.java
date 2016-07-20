package soa.regs;

import java.util.ArrayList;

import soa.space.planet.PlanetAction;

public class RegPlanetActions {

	private static ArrayList<PlanetAction> actions = new ArrayList<PlanetAction>();

	public RegPlanetActions(){
		registerPlanetAction(new PlanetAction());
		registerPlanetAction(new PlanetAction("Travel"));
	}
	
	public ArrayList<PlanetAction> getPlanetActions(){
		return actions;
	}
	
	public void registerPlanetAction(PlanetAction r){
		if(actions.contains(r));
		else actions.add(r);
	}
}
