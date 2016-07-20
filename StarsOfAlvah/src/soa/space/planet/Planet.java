package soa.space.planet;

public class Planet {

	String name = "EMPTY";
	boolean inhabited = false;
	int inhabitablity = 0; //0(Nope)-10(easy) 
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
		info = "Name: "+name+"\n"+
		"Inhabited: "+inhabited+"\n"+
		"Inhabitablity: "+inhabitablity+"\n";
	}
	
	public String getPlanetInfo() {
		return info;
	}
}
