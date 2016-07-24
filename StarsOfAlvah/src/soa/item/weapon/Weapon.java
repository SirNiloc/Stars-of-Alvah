package soa.item.weapon;

import soa.item.Item;
import soa.item.weapon.damagetype.DamageType;

public class Weapon extends Item{

	private String name = "Weapon";
	private DamageType type;
	private double damage = 0;
	private double rate = 0;
	private double speed = 0;
	private int magSize = 0;
	private int reloadTime = 0;
	private int tier=0;
	
	public Weapon(String n, int te, DamageType t, double d, double r, double s, int m, int re){
		name = n;
		tier = te;
		type = t;
		
		setDRS(d,r,s);
		setMR(m,re);
	}

	private void setMR(double m, double re) {
		double points = m+re;
		
		m = (m/points)*(tier*10);
		re = (m/tier)-(re/points);
		
		magSize = 0;
		reloadTime = 0;
	}

	private void setDRS(double d, double r, double s) {
		double points = d+r+s;
		
		d = (d/points)*(tier*10);
		r = (r/points)*(tier*10);
		s = (s/points)*(tier*10);
		
		damage = Math.floor(d * 100) / 100;
		rate = Math.floor(r * 100) / 100;
		speed = Math.floor(s * 100) / 100;
	}
	
	public double getDamage(){
		return damage;
	}
	public int getReload(){
		return reloadTime;
	}
	public int getMagSize(){
		return magSize;
	}
	public double getSpeed(){
		return speed;
	}
	public double getRate(){
		return rate;
	}
	public DamageType getType(){
		return type;
	}
	public int getTier(){
		return tier;
	}
	public String getName(){
		return getTier()+" "+name;
	}
	
	public String toString(){
		String r = type.getName()+" "+getName()+":\n"+
				"Damage: "+getDamage()+"\n"+
				"Rate: "+getRate()+"\n"+
				"Projectile peed: "+getSpeed()+"\n"+
				"Capacity: "+getMagSize()+"\n"+
				"Reload: "+getReload()+"\n";
		return r;
	}
}
