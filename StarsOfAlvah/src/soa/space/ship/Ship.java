package soa.space.ship;

import soa.space.ship.type.ShipType;

public class Ship {

	private ShipType type;
	
	private String name = "Ship";
	
	private double currentHull;
	private double currentShield;
	
	private double maxHull;
	private double maxShield;
	
	private double fuel;
	
	private int crewSize;
	
	private long x = 0;
	private long y = 0;
	private long z = 0;
	
	public Ship(String n, ShipType t, double hull, double shield,double ch,double cs,double f, int c, long xx,long yy,long zz){
		name = n;
		type = t;
		maxHull = hull;
		maxShield = shield;
		crewSize = c;
		x=xx;
		y=yy;
		z=zz;
		currentHull=ch;
		currentShield=cs;
		fuel = f;
		
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
	
	public double getHull(){
		return 100*(currentHull/maxHull);
	}
	
	public double getShield(){
		return 100*(currentShield/maxShield);
	}
	
	public double getFuel(){
		return fuel;
	}
	
	public double getCrewSize(){
		return crewSize;
	}
	
	public void addFuel(int f){
		fuel+=f;
	}
	
	public void removeFuel(int f){
		fuel-=f;
	}
}
