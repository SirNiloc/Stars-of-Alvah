package soa.space.ship.type;

public class ShipType {
	
	private int scoreCombat = 0;
	private int scoreScience = 0;
	private int scoreEcon = 0;
	private int scoreLogistics = 0;
	
	private int slotScience = 0;
	private int slotCombat = 0;
	private int slotEcon = 0;
	private int slotLogistics = 0;
	
	private int baseHealth = 0;
	private int baseShield = 0;
	private int baseSpeed = 0;
	
	private String name = "Experimental";
	
	public ShipType(String n, int rankHealth, int rankShield,int rankSpeed,
			int sci,int com, int econ, int log){
		name=n+" Class";

		setRanks(rankHealth,rankShield,rankSpeed,sci,com,econ,log);
		setScores();
	}
	
	private void setRanks(double h, double s, double sp, double sci, double com, double econ, double log){
		double points = h+s+sp+sci+com+econ+log;
		double ph = h/points;
		double ps = s/points;
		double psp = sp/points;
		double psci = sci/points;
		double pcom = com/points;
		double pecon = econ/points;
		double plog = log/points;
		
		baseHealth = getRank(ph);
		baseShield =getRank(ps);
		baseSpeed = getRank(psp);
		slotScience = getRank(psci);
		slotCombat = getRank(pcom);
		slotEcon = getRank(pecon);
		slotLogistics = getRank(plog);
	}
	
	private int getRank(double i){
		return (int) (60*i);
	}
	
	public String getName(){
		return name;
	}
	
	public int rankHull(){
		return baseHealth;
	}
	
	public int rankShield(){
		return baseShield;
	}
	
	public int rankSpeed(){
		return baseSpeed;
	}
	
	private void setScores(){
		scoreCombat = rankHull()+rankShield()+rankSpeed()+slotCombat;
		scoreScience = slotLogistics+slotEcon+rankSpeed()+slotScience;
		scoreEcon = slotLogistics+slotEcon+rankSpeed()+rankSpeed();
		scoreLogistics = slotLogistics+slotLogistics+rankSpeed()+rankSpeed();
	}
	
	public int getCombatScore(){
		return scoreCombat;
	}
	public int getEconScore(){
		return scoreEcon;
	}
	public int getScienceScore(){
		return scoreScience;
	}
	public int getLogisticsScore(){
		return scoreLogistics;
	}
	
	public int getCombatSlots(){
		return slotCombat;
	}
	public int getEconSlot(){
		return slotEcon;
	}
	public int getScienceSlot(){
		return slotScience;
	}
	public int getLogisticsSlot(){
		return slotLogistics;
	}
	
	
}
