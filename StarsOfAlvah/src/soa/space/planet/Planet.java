package soa.space.planet;

public class Planet {

	private String name = "EMPTY";
	
	private boolean inhabited = false;
	private float inhabitablity = 0;		//(0 - 100%)
	private int temp = 0;					//(low 0 - 6 high)
	private int radiationProtection = 0; 	//(0 - 100%)
	private int water = 0;					//(none = 0 solid = 1 liquid = 2 gas = 3)
	private int oxygen = 0;					//(0-30)

	private String info = "EMPTY";
	//TODO Add Characteristics
	
	public Planet(){}
	
	public Planet(String n, int t, int p, int w, int o, boolean i){
		name = n;
		temp = t;					//(low 0-6 high)
		setRad(p); 	//(0-100%)
		water = w;
		setOxygen(o);
		
		inhabited = i;
		setPlanetInfo();
	}
	
	private void setRad(int o) {
		if(o<0) radiationProtection =0;
		else if(o>100) radiationProtection = 100;
		else radiationProtection = o;
	}

	private void setOxygen(int o) {
		if(o<0) oxygen =0;
		else if(o>30) oxygen = 30;
		else oxygen = o;
	}

	public float getInhabitablity(){
		if(temp == 0)inhabitablity = 0;
		else if(temp == 1)inhabitablity = 10;
		else if(temp == 2)inhabitablity = 20;
		else if(temp == 3)inhabitablity = 25;
		else if(temp == 4)inhabitablity = 20;
		else if(temp == 5)inhabitablity = 10;
		else inhabitablity = 0;
		
		if(water == 2){
			inhabitablity += 40;
		}else if(water == 1){
			inhabitablity += 30;
		}else if(water == 3){
			inhabitablity += 20;
		}
		
		inhabitablity += oxygen;
		
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
		"Water: "+getWater()+"\n"+
		"Air Rating: "+getOxygen()+"\n";
	}
	
	private int getOxygen() {
		return oxygen;
	}

	private String getWater() {
		String r = "None";
		if(water == 2){
			r = "Solid";
		}else if(water == 1){
			r = "Liquid";
		}else if(water == 3){
			r = "Gas";
		}
		return r;
	}

	public String getPlanetInfo() {
		return info;
	}
}
