package soa.space.planet;

public class Planet {

	private String name = "EMPTY";
	
	private boolean inhabited = false;
	private float inhabitablity = 0;		//(0 - 100%)
	private int temp = 0;					//(low 0 - 6 high)
	private int radiationProtection = 0; 	//(0 - 100%)
	private int water = 0;					//(none = 0 solid = 1 liquid = 2 gas = 3)
	private int oxygen = 0;					//(0-30)
	
	private long size = 0;					//(0-? earth = 8000)

	private PlanetResources resources = new PlanetResources();

	
	private String info = "EMPTY";
	//TODO Add Characteristics
	
	public Planet(String n, int t, int p, int w, int o, boolean i,long s){
		name = n;
		temp = t;					//(low 0-6 high)
		setRad(p); 	//(0-100%)randRange(0,90000)
		water = w;
		checkTempAndWater();
		
		setOxygen(o);
		setSize(s);
		inhabited = i;
		setPlanetInfo();
	}
	
	private void setSize(long s) {
		if(s<0)size=0;
		else size=s;
	}
	
	public long getSize(){
		return size;
	}

	public Planet(String n, int t, int p, int w, int o, boolean i,long s,PlanetResources m){
		name = n;
		setTemp(t);					//(low 0-6 high)
		setRad(p); 	//(0-100%)
		water = w;
		checkTempAndWater();
		
		setOxygen(o);
		setSize(s);
		resources = m;
		
		inhabited = i;
		setPlanetInfo();
	}
	
	public void setTemp(int t) {
		if(t<0)temp=0;
		else if(t>6)temp=6;
		else temp=t;
	}

	public PlanetResources getResources(){
		return resources;
	}
	
	public void setResources(PlanetResources m){
		resources = m;
	}
	
	public void setRad(int o) {
		if(o<0) radiationProtection =0;
		else if(o>100) radiationProtection = 100;
		else radiationProtection = o;
	}
	


	public void setOxygen(int o) {
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
		"Inhabitablity: "+getInhabitablity()+"%\n"+
		"Temperature Rank: "+getTempString()+"\n"+
		"Protection Rank: "+radiationProtection+"%\n"+
		"Water: "+getWater()+"\n"+
		"Air Rating: "+getAirRate()+"\n";
	}
	
	private int getTemp() {
		return temp;
	}
	
	private void checkTempAndWater() {
		if(water <= 1 && water >= 3){
			if(		getTemp() == 0)water = 2;
			else if(getTemp() == 1)water = 2;
			else if(getTemp() == 2){
				if(water == 3)water = 1;
				else water = 2;
			}
			else if(getTemp() == 3)water = 1;//water
			else if(getTemp() == 4){
				if(water == 2)water = 1;
				else water = 3;
			}
			else if(getTemp() == 5)water = 3;
			else water = 3;
		}
	}
	
	private String getTempString() {
		String r;
		if(		getTemp() == 0)r = "Extremely Cold";//ice
		else if(getTemp() == 1)r = "Very Cold";//ice
		else if(getTemp() == 2)r = "Cold";//wi
		else if(getTemp() == 3)r = "Moderate";//water
		else if(getTemp() == 4)r = "Hot";//wg
		else if(getTemp() == 5)r = "Very Hot";//gas
		else r = "Extremely Hot";//gas
		return r;
	}

	private int getOxygen() {
		return oxygen;
	}
	
	private String getAirRate() {
		String r;
		if(		getOxygen() < 5)r = "Terrible";
		else if(getOxygen() < 10)r = "Very Poor";
		else if(getOxygen() < 15)r = "Poor";
		else if(getOxygen() < 20)r = "Good";
		else if(getOxygen() < 25)r = "Great";
		else if(getOxygen() < 30)r = "Near Perfect";
		else r = "Perfect";
		return r;
	}
	

	private String getWater() {
		String r = "None";
		if(water == 2){
			r = "Frozen";
		}else if(water == 1){
			r = "Liquid";
		}else if(water == 3){
			r = "Gaseous";
		}
		return r;
	}

	public String getPlanetInfo() {
		return info;
	}
}
