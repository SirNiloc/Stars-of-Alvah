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
	
	private String name = "????";
	
	public ShipType(String n, int rankHealth, int rankShield,int rankSpeed, int sci,int com, int econ, int log){
		name=n;
		baseHealth = rankHealth;
		baseShield = rankShield;
		baseSpeed = rankSpeed;
		slotScience = sci;
		slotCombat = com;
		slotEcon = econ;
		slotLogistics = log;
		setScores();
	}
	
	public String getName(){
		return name;
	}
	
	private void setScores(){
		scoreCombat = baseHealth+baseShield+baseSpeed+slotCombat;
		scoreScience = slotLogistics+slotEcon+baseSpeed+slotScience;
		scoreEcon = slotLogistics+slotEcon+baseSpeed+baseSpeed;
		scoreLogistics = slotLogistics+slotLogistics+baseSpeed+baseSpeed;
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
	
	
}
