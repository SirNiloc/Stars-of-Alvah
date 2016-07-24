package soa.item;

import soa.item.slot.combat.ShipWeapon;
import soa.item.weapon.damagetype.DamageType;

public class Weapon extends Item{

	private String name = "Weapon";
	private DamageType type;
	private double damage = 0;
	private double rate = 0;
	private double range = 0;
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
		int mod = tier;
		if(this instanceof ShipWeapon){
			ShipWeapon w = (ShipWeapon) this;
			mod+=w.getSlotCost();
		}
		m = (m/points)*(mod*10);
		re = (m/mod)-(re/points);
		magSize = (int) m+1;
		reloadTime = (int) re;
	}

	private void setDRS(double d, double r, double s) {
		double points = d+r+s;
		int mod = tier;
		if(this instanceof ShipWeapon){
			ShipWeapon w = (ShipWeapon) this;
			mod+=w.getSlotCost();
		}
		d = (d/points)*(mod*10);
		r = (r/points)*(mod*10);
		s = (s/points)*(mod*10);
		
		damage = Math.floor(d * 100) / 100;
		rate = Math.floor(r * 100) / 100;
		range = Math.floor(s * 100) / 100;
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
	public double getRange(){
		return range;
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
		return "T"+getTier()+" "+name;
	}
	
	public String toString(){
		String r = type.getName()+" "+getName()+":\n"+
				"Damage: "+getDamage()+"\n"+
				"Rate: "+getRate()+"\n"+
				"Range: "+getRange()+"\n"+
				"Capacity: "+getMagSize()+"\n"+
				"Reload: "+getReload()+"\n";
		return r;
	}
}
