package soa.space.planet;

public class PlanetAction {

	String name = "No Action";
	String info = "No Action";
	//TODO Add Characteristics
	
	public PlanetAction(){
		name = "No Action";
	}
	
	public PlanetAction(String n){
		name = n;
	}
	
	public String getName(){
		return name;
	}

	public void doAction() {
		// TODO Action
	}

}
