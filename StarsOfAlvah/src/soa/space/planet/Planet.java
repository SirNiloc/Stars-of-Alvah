package soa.space.planet;

public class Planet {

	private String name = "EMPTY";
	
	private boolean inhabited = false;
	private float inhabitablity = 0;		//(0 - 100%)
	private int temp = 0;					//(low 0 - 6 high)
	private int radiationProtection = 0; 	//(0 - 100%)
	private boolean hasWater = false;
	private boolean hasOxygen = false;

	private String info = "EMPTY";
	//TODO Add Characteristics
	
	public Planet(){}
	
	public Planet(String n, int t, int p, boolean w, boolean o, boolean i){
		name = n;
		temp = t;					//(low 0-6 high)
		radiationProtection = p; 	//(0-100%)
		hasWater = w;
		hasOxygen = o;
		inhabited = i;
		setPlanetInfo();
	}
	
	public float getInhabitablity(){
		if(temp == 0)inhabitablity = 0;
		else if(temp == 1)inhabitablity = 10;
		else if(temp == 2)inhabitablity = 20;
		else if(temp == 3)inhabitablity = 25;
		else if(temp == 4)inhabitablity = 20;
		else if(temp == 5)inhabitablity = 10;
		else if(temp == 6)inhabitablity = 0;
		
		if(hasWater) inhabitablity += 40;
		if(hasOxygen) inhabitablity += 30;
		inhabitablity += ((float)radiationProtection/100)*5;
		
		return inhabitablity;
	}
	
	public boolean isInhabited(){
		return inhabited;
	}
	
	public String getName(){
		return name;
	}

	public void setPlanetInfo() {
		info = "Name: "+name+"\n"+
		"Inhabited: "+inhabited+"\n"+
		"Inhabitablity: "+getInhabitablity()+"\n"+
		"Temperature Rank: "+temp+"\n"+
		"Protection Rank: "+radiationProtection+"\n"+
		"Water: "+hasWater+"\n"+
		"Oxygen: "+hasOxygen+"\n";
	}
	
	public String getPlanetInfo() {
		return info;
	}
}
