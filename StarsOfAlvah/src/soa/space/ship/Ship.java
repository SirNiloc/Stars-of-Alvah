package soa.space.ship;

import java.util.ArrayList;

import soa.item.slot.combat.ShipWeapon;
import soa.item.slot.econ.ShipEcon;
import soa.item.slot.logistics.ShipLogistics;
import soa.item.slot.sci.ShipScience;
import soa.space.ship.type.ShipType;

public class Ship {

	private ShipType type;
	
	private String name = "Ship";
	
	private String subClass = "Space Ship";
	
	private double currentHull;
	private double currentShield;
	
	private int maxHull;
	private int maxShield;
	
	private double fuel;
	
	private int crewSize;
	
	private long x = 0;
	private long y = 0;
	private long z = 0;
	
	private int filledScience = 0;
	private int filledCombat = 0;
	private int filledEcon = 0;
	private int filledLogistics = 0;
	
	private int tier = 0;
	
	private ArrayList<ShipWeapon> slotCombat = new ArrayList<ShipWeapon>();
	private ArrayList<ShipScience> slotScience = new ArrayList<ShipScience>();
	private ArrayList<ShipLogistics> slotLog = new ArrayList<ShipLogistics>();
	private ArrayList<ShipEcon> slotEcon = new ArrayList<ShipEcon>();
	
	public Ship(String n, ShipType t,int tt, double hull, double shield,double ch,double cs,double f, int c, long xx,long yy,long zz){
		name = n;
		type = t;
		tier = tt;
		
		setHSC(hull,shield,c);
		
		
		x=xx;
		y=yy;
		z=zz;
		currentHull=ch;
		currentShield=cs;
		checkHullAndShield();
		fuel = f;
		
		updateSubClass();
	}
	
	private void setHSC(double h, double s, int c) {
		double points = h+s+c;
		double ps = s/points;
		double pc = c/points;
		
		int crew = (int) (100*pc);
		double sh = 100*ps;
		double hull = 100-(crew+sh);

		maxHull = setMaxHull(hull);
		maxShield = setMaxShield(sh);
		crewSize = setCrew(crew);

	}

	private int setCrew(int c) {
		return c;
	}

	private void updateSubClass(){
		int topScore = 0;
		subClass = "Space Ship";
		
		

		if(type.getEconScore() > topScore){
			topScore = type.getEconScore();
			subClass = "Tradeship";
		}
		if(type.getScienceScore() > topScore){
			topScore = type.getScienceScore();
			subClass = "Research Vessel";
		}
		if(type.getLogisticsScore() > topScore){
			topScore = type.getLogisticsScore();
			subClass = "Transport";
		}
		if(type.rankSpeed() > topScore){
			topScore = type.rankSpeed();
			subClass = "Exploration Vessel";
		}
		if(type.rankHull() > topScore){
			topScore = type.rankHull();
			subClass = "Heavy Ship";
		}
		if(type.rankShield() > topScore){
			topScore = type.rankShield();
			subClass = "Shield Bearer";
		}
		if(type.getCombatScore() > topScore){
			topScore = type.getCombatScore();
			subClass = "Warship";
		}
		
	}
	
	private void checkHullAndShield(){
		if(currentHull<0||currentHull>maxHull)currentHull=maxHull;
		if(currentShield<0||currentShield>maxShield)currentShield=maxShield;
	}
	
	private int setMaxShield(double shield) {
		return (int) (tier*shield*type.rankShield());
	}

	private int setMaxHull(double hull) {
		return (int) ((hull*1.1*tier)*type.rankHull());
	}

	public ArrayList<ShipWeapon> getWeapons(){
		return slotCombat;
	}
	public ArrayList<ShipScience> getScience(){
		return slotScience;
	}
	public ArrayList<ShipEcon> getEcon(){
		return slotEcon;
	}
	public ArrayList<ShipLogistics> getLogistics(){
		return slotLog;
	}
	
	public void addWeapon(ShipWeapon w){
		if(type.getCombatSlots() > filledCombat){
			slotCombat.add(w);
			filledCombat++;
		}
	}
	
	public void removeWeapon(int i){
		if(filledCombat > 0){
			slotCombat.remove(i);
			filledCombat--;
		}
	}
	
	public void addLog(ShipLogistics w){
		if(type.getLogisticsSlot() > filledLogistics){
			slotLog.add(w);
			filledLogistics++;
		}
	}
	
	public void removeSci(int i){
		if(filledScience > 0){
			slotScience.remove(i);
			filledScience--;
		}
	}
	
	public void addSci(ShipScience w){
		if(type.getScienceSlot() > filledScience){
			slotScience.add(w);
			filledScience++;
		}
	}
	
	public void removeLog(int i){
		if(filledLogistics > 0){
			slotLog.remove(i);
			filledLogistics--;
		}
	}
	
	public void addEcon(ShipEcon w){
		if(type.getEconSlot() > filledEcon){
			slotEcon.add(w);
			filledEcon++;
		}
	}
	
	public void removeEcon(int i){
		if(filledEcon > 0){
			slotEcon.remove(i);
			filledEcon--;
		}
	}
	
	public String getName(){
		return name;
	}
	
	public long getCoordX(){
		return x;
	}
	public long getCoordY(){
		return y;
	}
	public long getCoordZ(){
		return z;
	}
	
	public void setCoordX(long xx){
		x = xx;
	}
	public void setCoordY(long yy){
		y = yy;
	}
	public void setCoordZ(long zz){
		z = zz;
	}
	
	public void takeDamage(int damage, boolean pen){
		if(currentShield > 0 && !pen){
			damageShield(damage/2);
		}else{
			damageHull(damage);
		}
	}
	
	public ShipType getType(){
		return type;
	}
	
	public void damageShield(int damage){
		currentShield-=damage;
		if(currentShield<0)currentShield=0;
	}
	
	public void damageHull(int damage){
		currentHull-=damage;
		if(currentHull<0)currentHull=0;
	}
	
	public String getPercentHull(){
		return 100*(currentHull/maxHull)+"%";
	}
	
	public String getPercentShield(){
		return 100*(currentShield/maxShield)+"%";
	}
	
	public double getFuel(){
		return fuel;
	}
	
	public int getCrewSize(){
		return crewSize;
	}
	
	public void addFuel(int f){
		fuel+=f;
	}
	
	public void removeFuel(int f){
		fuel-=f;
	}
	
	public String toString(){
		String r;
		r="Name: "+getName()+" T"+tier+" "+type.getName()+" "+getSubClass()+"\n"+
		"Hull: "+getPercentHull()+"("+currentHull+"\\"+maxHull+")|Shield: "+getPercentShield()+"("+currentShield+"\\"+maxShield+")\n"+
		"Combat Rank: "+type.getCombatScore()+"\n"+
		"Logistics Rank: "+type.getLogisticsScore()+"\n"+
		"Economy Rank: "+type.getEconScore()+"\n"+
		"Science Rank: "+type.getScienceScore()+"\n"+
		"Speed Rank: "+type.rankSpeed()+"\n"+
		"Crew Size: "+getCrewSize()+"\n"+
		"Slots C: "+ type.getCombatSlots()+" L: "+type.getLogisticsSlot()+" E: "+type.getEconSlot()+" S: "+type.getScienceSlot();
		
		return r;
	}

	public String getSubClass() {
		return subClass;
	}
}
