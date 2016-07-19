package soa.planet;

public class Planet {

	String name = "EMPTY";
	boolean inhabitable = false;
	String info = "EMPTY";
	//TODO Add Characteristics
	
	public Planet(){}
	
	public Planet(String n){
		name = n;
		
		setPlanetInfo();
	}
	
	public String getName(){
		return name;
	}

	public void setPlanetInfo() {
		// TODO Finish Info
		info = "Name: "+name+"\n"+
		"Supports Life: "+inhabitable+"\n";
	}
	
	public String getPlanetInfo() {
		// TODO Auto-generated method stub
		return info;
	}
}
